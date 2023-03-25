package com.sakura.project_manage.common.utils;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/5 18:49
 */
public class AuthToken extends UsernamePasswordToken {

    private String token;

    public AuthToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
