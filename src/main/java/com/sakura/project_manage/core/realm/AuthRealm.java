package com.sakura.project_manage.core.realm;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.sakura.project_manage.common.enums.EnumJsonResultMsg;
import com.sakura.project_manage.common.utils.Assert;
import com.sakura.project_manage.common.utils.CommonConstant;
import com.sakura.project_manage.common.utils.JwtUtil;
import com.sakura.project_manage.common.utils.ObjectTools;
import com.sakura.project_manage.entity.UserDetail;
import com.sakura.project_manage.entity.example.UserDetailExample;
import com.sakura.project_manage.mapper.generator.UserDetailGeneratorMapper;

import io.jsonwebtoken.Claims;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/5 18:51
 */
public class AuthRealm extends AuthorizingRealm {

    @Autowired
    private UserDetailGeneratorMapper userDetailGeneratorMapper;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 认证
     * @param token
     * @return
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取前端传来的token
        String accessToken = (String) token.getPrincipal();
        //解密token,如果解密失败直接返回
        Claims claims = JwtUtil.parseJwt(accessToken);
        Assert.isTrue(ObjectTools.isNotBlank(claims), EnumJsonResultMsg.USER_TOKEN_ERR);
        //生成rediskey
        String redisKey = StringUtils.join(CommonConstant.REDIS_LOGIN_NAME, claims.get("id"));
        //从redis中取出存放的key,进行判断
        String redisToken = redisTemplate.opsForValue().get(redisKey);
        //如果redis中的key为空,或者跟前端传入的key不一样就返回
        Assert.isTrue(ObjectTools.isNotBlank(redisToken), EnumJsonResultMsg.USER_TOKEN_ERR);
        Assert.isTrue(redisToken.equals(accessToken), EnumJsonResultMsg.USER_TOKEN_TIME);
        //此方法需要返回一个AuthenticationInfo类型的数据
        // 因此返回一个它的实现类SimpleAuthenticationInfo,将user以及获取到的token传入它可以实现自动认证
        return new SimpleAuthenticationInfo(getUserDetail(claims.get("id").toString()), accessToken,
                "");
    }

    /**
     * 授权
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //从认证那里获取到用户对象User
        UserDetail userDetail = (UserDetail) principals.getPrimaryPrincipal();
        //此方法需要一个AuthorizationInfo类型的返回值，因此返回一个它的实现类SimpleAuthorizationInfo
        //通过SimpleAuthorizationInfo里的addStringPermission()设置用户的权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        // 将角色对应的权限集合从缓存中取出来
        String stringPermission = redisTemplate.opsForValue()
                .get(CommonConstant.REDIS_PERMISSION + userDetail.getUserRole().toString());
        simpleAuthorizationInfo.addStringPermission(stringPermission);
        return simpleAuthorizationInfo;
    }

    private UserDetail getUserDetail(String id) {
        return userDetailGeneratorMapper.selectOneByExample(
                new UserDetailExample()
                        .or()
                        .andIdEqualTo(Integer.parseInt(id))
                        .example());
    }
}
