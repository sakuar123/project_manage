package com.sakura.project_manage.web.controller.sys;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.UserDetail;
import com.sakura.project_manage.service.UserDetailService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/7 21:34
 */
@RestController
@Api(tags = "用户管理控制器")
@RequestMapping("/sys/user/")
public class UserDetailController {

    @Resource
    private UserDetailService userDetailService;

    @GetMapping("{id}")
    @ApiOperation(value = "获取当个用户信息")
    @RequiresPermissions("ROLE_MANAGE")
    public UserDetail get(@PathVariable Integer id) {
        return userDetailService.get(id);
    }

    @GetMapping
    @ApiOperation(value = "获取用户列表信息")
    @RequiresPermissions("ROLE_MANAGE")
    public PageResult<PageData> search(HttpServletRequest request, Pageable pageable) {
        return userDetailService.search(pageable, new PageData(request));
    }

    @PostMapping
    @ApiOperation(value = "新增用户")
    @RequiresPermissions("ROLE_MANAGE")
    public Boolean conserve(@RequestBody UserDetail userDetail) {
        return userDetailService.conserve(userDetail);
    }

    @PutMapping
    @ApiOperation(value = "修改用户")
    @RequiresPermissions("ROLE_MANAGE")
    public Boolean modify(@RequestBody UserDetail userDetail) {
        return userDetailService.modify(userDetail);
    }

    @DeleteMapping("{id}")
    @ApiOperation(value = "删除用户")
    @RequiresPermissions("ROLE_MANAGE")
    public Boolean remove(@PathVariable Integer id) {
        return userDetailService.remove(id);
    }

    @PostMapping("restPassword")
    @ApiOperation(value = "重置密码用户")
    public Boolean restPassword(String newPasswod, String oldPassword) {
        return userDetailService.restPassword(oldPassword, newPasswod);
    }

}
