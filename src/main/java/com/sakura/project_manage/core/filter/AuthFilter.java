package com.sakura.project_manage.core.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.AuthenticatingFilter;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sakura.project_manage.common.enums.EnumJsonResultMsg;
import com.sakura.project_manage.common.utils.AuthToken;
import com.sakura.project_manage.common.utils.CommonsUtil;
import com.sakura.project_manage.common.utils.JsonResult;
import com.sakura.project_manage.common.utils.ObjectTools;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/5 18:44
 */
public class AuthFilter extends AuthenticatingFilter {

    /**
     * 生成自定义token
     * @param request
     * @param response
     * @return
     */
    @Override
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        //从header中获取token
        String token = httpServletRequest.getHeader("token");
        return new AuthToken(token);
    }

    /**
     * 所有请求全部拒绝访问
     * @param request
     * @param response
     * @param mappedValue
     * @return
     */
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        //允许option请求通过
        if (((HttpServletRequest) request).getMethod().equals(RequestMethod.OPTIONS.name())) {
            return true;
        }
        return false;
    }

    /**
     * 拒绝访问的请求，onAccessDenied方法先获取 token，再调用executeLogin方法
     */
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        //获取请求token
        String token = httpServletRequest.getHeader("token");
        //StringUtils.isBlank(String str)  判断str字符串是否为空或者长度是否为0
        if (ObjectTools.isBlank(token)) {
            CommonsUtil.returnResult(JsonResult.error(EnumJsonResultMsg.USER_NOT_LOGIN), httpServletResponse);
            return false;
        }
        return executeLogin(request, response);
    }

    /**
     * token失效时调用
     * @param token
     * @param e
     * @param request
     * @param response
     * @return
     */
    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request,
            ServletResponse response) {
        //处理登录失败的异常
        CommonsUtil.returnResult(JsonResult.error(EnumJsonResultMsg.USER_NOT_LOGIN), (HttpServletResponse) response);
        return false;
    }
}
