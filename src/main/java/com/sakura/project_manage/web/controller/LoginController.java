package com.sakura.project_manage.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.service.UserDetailService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/5 17:43
 */
@RestController
@Api(value = "登录接口控制器")
@RequestMapping
public class LoginController {

    @Autowired
    private UserDetailService userDetailService;

    @PostMapping("/login")
    @ApiOperation(value = "登录")
    public PageData login(String userName, String password) {
        return userDetailService.login(userName, password);
    }
}
