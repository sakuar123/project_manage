package com.sakura.project_manage.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.sakura.project_manage.common.enums.EnumJsonResultMsg;
import com.sakura.project_manage.common.exception.ErrorException;
import com.sakura.project_manage.common.utils.Assert;
import com.sakura.project_manage.common.utils.CommonConstant;
import com.sakura.project_manage.common.utils.CommonsUtil;
import com.sakura.project_manage.common.utils.JwtUtil;
import com.sakura.project_manage.common.utils.MD5Util;
import com.sakura.project_manage.common.utils.ObjectTools;
import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.UserDetail;
import com.sakura.project_manage.entity.example.UserDetailExample;
import com.sakura.project_manage.mapper.generator.UserDetailGeneratorMapper;
import com.sakura.project_manage.service.UserDetailService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/2/28 14:34
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class UserDetailServiceImpl implements UserDetailService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private UserDetailGeneratorMapper userDetailGeneratorMapper;

    /**
     * 登录接口
     * @param userAccout
     * @param password
     * @return
     */
    @Override
    public PageData login(String userAccout, String password) {
        //先用,用户输入的账户查询下数据库
        UserDetail userDetail = userDetailGeneratorMapper.selectOneByExample(new UserDetailExample()
                .or()
                .andUserAccountEqualTo(userAccout)
                .example());
        //断言,判断下用户是否存在且账户是否未被冻结
        Assert.isTrue(ObjectTools.isNotBlank(userDetail) && userDetail.getUserState() == 0, EnumJsonResultMsg.USER_BAD);
        //获取加密盐,得到加密后的密码
        String salt = userDetail.getUserPasswordSalt();
        String userPassword = MD5Util.getMd5(password, salt);
        //判断密码是否输入正确
        Assert.isTrue(userPassword.equals(userDetail.getUserPassword()), EnumJsonResultMsg.USER_NAME_OR_PWD_ERROR);
        PageData result = new PageData();
        result.put("token", getToken(userDetail));
        return result;
    }

    @Override
    public UserDetail get(Integer id) {
        return userDetailGeneratorMapper.selectOne(UserDetail.builder().id(id).build());
    }

    @Override
    public PageResult<PageData> search(Pageable pageable, PageData pageData) {
        PageHelper.startPage(pageable.getPageNumber(), pageable.getPageSize());
        List<PageData> result = userDetailGeneratorMapper.search(pageData);
        return PageResult.success(result);
    }

    @Override
    public Boolean conserve(UserDetail userDetail) {
        try {
            String passwordSalt = CommonsUtil.getRandomString(8);
            userDetail.setUserPassword(MD5Util.getMd5(userDetail.getUserPassword(), passwordSalt));
            userDetail.setUserPasswordSalt(passwordSalt);
            userDetailGeneratorMapper.insertSelective(userDetail);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ErrorException("新增用户失败");
        }
    }

    @Override
    public Boolean modify(UserDetail userDetail) {
        try {
            userDetailGeneratorMapper.updateByPrimaryKeySelective(userDetail);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ErrorException("修改用户失败");
        }
    }

    @Override
    public Boolean remove(Integer id) {
        try {
            userDetailGeneratorMapper.deleteByPrimaryKey(UserDetail.builder().id(id).build());
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ErrorException("删除用户失败");
        }
    }

    /**
     * 重置密码
     * @param newPassword
     * @return
     */
    @Override
    public Boolean restPassword(String oldPassword, String newPassword) {
        //获取当前登录的用户信息
        UserDetail userDetail = (UserDetail) SecurityUtils.getSubject().getPrincipal();
        //加密下用户输入的旧密码
        String userPrintPassword = MD5Util.getMd5(oldPassword, userDetail.getUserPasswordSalt());
        //判断下密码是否一致
        Assert.isTrue(userPrintPassword.equals(userDetail.getUserPassword()), "请输入正确的密码");
        //将输入的新密码设置到用户里
        userDetail.setUserPassword(MD5Util.getMd5(newPassword, userDetail.getUserPasswordSalt()));
        try {
            userDetailGeneratorMapper.updateByPrimaryKeySelective(userDetail);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ErrorException("修改密码失败");
        }
    }

    /**
     * 获取JWTtoken
     * @param userDetail
     * @return
     */
    private String getToken(UserDetail userDetail) {
        //生成JWTtoken
        String token = JwtUtil.createJwt(JSONObject.toJSONString(userDetail));
        //生成rediskey
        String redisKey = StringUtils.join(CommonConstant.REDIS_LOGIN_NAME, userDetail.getId());
        //将生成的token放到redis中
        redisTemplate.opsForValue().set(redisKey, token);
        return token;
    }
}
