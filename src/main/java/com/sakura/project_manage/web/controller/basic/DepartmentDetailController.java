package com.sakura.project_manage.web.controller.basic;

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
import com.sakura.project_manage.entity.DepartmentDetail;
import com.sakura.project_manage.service.DepartmentDetailService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/8 20:12
 */
@RestController
@Api(tags = "部门维护管理器")
@RequestMapping("/basic/department/")
public class DepartmentDetailController {

    @Resource
    private DepartmentDetailService service;

    @GetMapping("{id}")
    @ApiOperation(value = "获取单个信息")
    public DepartmentDetail get(@PathVariable Integer id) {
        return service.get(id);
    }

    @GetMapping
    @ApiOperation(value = "列表查询")
    public PageResult<DepartmentDetail> search(Pageable pageable, HttpServletRequest request) {
        return service.search(new PageData(request), pageable);
    }

    @PostMapping
    @ApiOperation(value = "新增")
    @RequiresPermissions("DEPARTMENT_MANAGE_ADD")
    public Boolean add(@RequestBody DepartmentDetail entity) {
        return service.add(entity);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    @RequiresPermissions("DEPARTMENT_MANAGE_EDIT")
    public Boolean edit(@RequestBody DepartmentDetail entity) {
        return service.edit(entity);
    }

    @DeleteMapping("{id}")
    @ApiOperation(value = "删除")
    @RequiresPermissions("DEPARTMENT_MANAGE_DEL")
    public Boolean del(@PathVariable Integer id) {
        return service.del(id);
    }
}
