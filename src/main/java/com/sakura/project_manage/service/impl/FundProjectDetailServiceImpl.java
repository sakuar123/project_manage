package com.sakura.project_manage.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.sakura.project_manage.common.enums.EnumProjectFundStatus;
import com.sakura.project_manage.common.enums.EnumProjectLevel;
import com.sakura.project_manage.common.exception.ErrorException;
import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.FundProject;
import com.sakura.project_manage.entity.FundProjectDetail;
import com.sakura.project_manage.entity.UserDetail;
import com.sakura.project_manage.mapper.generator.FundProjectDetailGeneratorMapper;
import com.sakura.project_manage.mapper.generator.FundProjectGeneratorMapper;
import com.sakura.project_manage.mapper.generator.UserDetailGeneratorMapper;
import com.sakura.project_manage.service.FundProjectDetailService;
import com.sakura.project_manage.web.vo.FundProjectDetailVo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/20 21:35
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class FundProjectDetailServiceImpl implements FundProjectDetailService {

    @Autowired
    private FundProjectGeneratorMapper fundProjectGeneratorMapper;
    @Autowired
    private FundProjectDetailGeneratorMapper fundProjectDetailGeneratorMapper;
    @Autowired
    private UserDetailGeneratorMapper userDetailGeneratorMapper;

    @Override
    public PageData get(Integer id) {
        //获取当前登录的用户信息
        UserDetail userDetail = (UserDetail) SecurityUtils.getSubject().getPrincipal();
        PageData result = new PageData();
        result.put("fundProject", fundProjectGeneratorMapper.get(id));
        result.put("fundProjectDetail", fundProjectDetailGeneratorMapper.get(id));
        result.put("userDetail", userDetailGeneratorMapper.getUserDetail(userDetail.getId()));
        return result;
    }

    @Override
    public PageResult<PageData> search(PageData pageData, Pageable pageable) {
        PageHelper.startPage(pageable.getPageNumber(), pageable.getPageSize());
        Map<Integer, String> projectLevelMap = Arrays.stream(EnumProjectLevel.values())
                .collect(Collectors.toMap(EnumProjectLevel::getCode, EnumProjectLevel::getValue));
        Map<Integer, String> statusMap = Arrays.stream(EnumProjectFundStatus.values())
                .collect(Collectors.toMap(EnumProjectFundStatus::getCode, EnumProjectFundStatus::getValue));
        List<PageData> result = fundProjectGeneratorMapper.search(pageData);
        result.forEach(pd -> pd.put("projectLevel", projectLevelMap.get(pd.getIntegerVal("projectLevel"))));
        result.forEach(pd -> pd.put("projectFundStatus", statusMap.get(pd.getIntegerVal("projectFundStatus"))));
        return PageResult.success(result);
    }

    @Override
    public Boolean add(FundProjectDetailVo fundProjectDetailVo) {
        try {
            //获取当前登录的用户信息
            UserDetail userDetail = (UserDetail) SecurityUtils.getSubject().getPrincipal();
            FundProject fundProject = new FundProject();
            FundProjectDetail fundProjectDetail = new FundProjectDetail();
            BeanUtils.copyProperties(fundProjectDetailVo, fundProject);
            BeanUtils.copyProperties(fundProjectDetailVo, fundProjectDetail);
            fundProject.setCreateUser(userDetail.getId());
            fundProjectGeneratorMapper.insertSelective(fundProject);
            fundProjectDetail.setProjectFundId(fundProject.getId());
            fundProjectDetailGeneratorMapper.insertSelective(fundProjectDetail);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("新增项目失败,", e);
            throw new ErrorException("新增项目失败");
        }
    }

    @Override
    public Boolean edit(FundProjectDetailVo fundProjectDetailVo) {
        try {
            FundProject fundProject = new FundProject();
            FundProjectDetail fundProjectDetail = new FundProjectDetail();
            BeanUtils.copyProperties(fundProjectDetailVo, fundProject);
            BeanUtils.copyProperties(fundProjectDetailVo, fundProjectDetail);
            fundProjectGeneratorMapper.updateByPrimaryKeySelective(fundProject);
            fundProjectDetailGeneratorMapper.updateByPrimaryKeySelective(fundProjectDetail);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("修改项目失败,", e);
            throw new ErrorException("修改项目失败");
        }
    }

    @Override
    public Boolean del(Integer id) {
        try {
            fundProjectGeneratorMapper.deleteByPrimaryKey(FundProject.builder().id(id).build());
            fundProjectDetailGeneratorMapper.deleteByPrimaryKey(FundProjectDetail.builder().projectFundId(id).build());
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("删除项目失败,", e);
            throw new ErrorException("删除项目失败");
        }
    }
}
