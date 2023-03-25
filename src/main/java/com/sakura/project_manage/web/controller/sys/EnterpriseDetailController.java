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
import com.sakura.project_manage.entity.EnterpriseDetail;
import com.sakura.project_manage.service.EnterpriseDetailService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/11 22:09
 */
@RestController
@Api(tags = "企业管理控制器")
@RequestMapping("/sys/enterprise/")
public class EnterpriseDetailController {

    @Resource
    private EnterpriseDetailService service;

    @GetMapping("{id}")
    @ApiOperation(value = "获取单个企业信息")
    public EnterpriseDetail get(@PathVariable Integer id) {
        return service.get(id);
    }

    @GetMapping
    @ApiOperation(value = "获取企业信息列表")
    public PageResult<EnterpriseDetail> search(Pageable pageable, HttpServletRequest request) {
        return service.search(new PageData(request), pageable);
    }

    @PostMapping
    @ApiOperation(value = "新增企业")
    @RequiresPermissions("ENTERPRISE_MANAGE_ADD")
    public Boolean add(@RequestBody EnterpriseDetail enterpriseDetail) {
        return service.add(enterpriseDetail);
    }

    @PutMapping
    @ApiOperation(value = "修改角色")
    @RequiresPermissions("ENTERPRISE_MANAGE_EDIT")
    public Boolean edit(@RequestBody EnterpriseDetail enterpriseDetail) {
        return service.edit(enterpriseDetail);
    }

    @DeleteMapping("{id}")
    @ApiOperation(value = "删除角色")
    @RequiresPermissions("ENTERPRISE_MANAGE_DEl")
    public Boolean del(@PathVariable Integer id) {
        return service.del(id);
    }

}
