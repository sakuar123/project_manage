package com.sakura.project_manage.web.controller.sys;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakura.project_manage.entity.AuthorityDetail;
import com.sakura.project_manage.service.AuthorityDetailService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/8 20:12
 */
@RestController
@Api(tags = "权限管理器")
@RequestMapping("/sys/authority")
public class AuthorityDetailController {

    @Resource
    private AuthorityDetailService service;

    @GetMapping
    @ApiOperation(value = "获取权限信息列表")
    @RequiresPermissions("AUTHORITY_MANAGE")
    public List<AuthorityDetail> search() {
        return service.list();
    }

    @PostMapping
    @ApiOperation(value = "新增权限 ")
    @RequiresPermissions("AUTHORITY_MANAGE")
    public Boolean conserve(@RequestBody AuthorityDetail authorityDetail) {
        return service.conserve(authorityDetail);
    }

    @PutMapping
    @ApiOperation(value = "修改角色")
    @RequiresPermissions("AUTHORITY_MANAGE")
    public Boolean modify(@RequestBody AuthorityDetail authorityDetail) {
        return service.modify(authorityDetail);
    }
}
