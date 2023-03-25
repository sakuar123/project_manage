package com.sakura.project_manage.web.controller.sys;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
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
import com.sakura.project_manage.entity.RoleDetail;
import com.sakura.project_manage.service.RoleDetailService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/8 20:06
 */
@RestController
@Api(tags = "角色控制管理器")
@RequestMapping("/sys/role/")
public class RoleDetailController {

    @Autowired
    private RoleDetailService roleDetailService;

    @GetMapping("{id}")
    @ApiOperation(value = "获取单个角色信息")
    @RequiresPermissions("AUTHORITY_MANAGE")
    public RoleDetail get(@PathVariable Integer id) {
        return roleDetailService.get(id);
    }

    @GetMapping("/getCompanyList")
    @ApiOperation(value = "获取角色列表")
    public List<PageData> getCompanyList() {
        return roleDetailService.getRoleList();
    }

    @GetMapping
    @ApiOperation(value = "获取角色信息列表")
    @RequiresPermissions("AUTHORITY_MANAGE")
    public PageResult<RoleDetail> search(Pageable pageable, HttpServletRequest request) {
        return roleDetailService.search(pageable, new PageData(request));
    }

    @PostMapping
    @ApiOperation(value = "新增角色")
    @RequiresPermissions("AUTHORITY_MANAGE")
    public Boolean conserve(@RequestBody RoleDetail roleDetail) {
        return roleDetailService.conserve(roleDetail);
    }

    @PutMapping
    @ApiOperation(value = "修改角色")
    @RequiresPermissions("AUTHORITY_MANAGE")
    public Boolean modify(@RequestBody RoleDetail roleDetail) {
        return roleDetailService.modify(roleDetail);
    }

    @DeleteMapping("{id}")
    @ApiOperation(value = "删除角色")
    @RequiresPermissions("AUTHORITY_MANAGE")
    public Boolean remove(@PathVariable Integer id) {
        return roleDetailService.remove(id);
    }
}
