package com.sakura.project_manage.web.controller.pa;

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
import com.sakura.project_manage.entity.ProjectPublish;
import com.sakura.project_manage.service.ProjectPublishService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/8 20:12
 */
@RestController
@Api(tags = "项目发布")
@RequestMapping("/publish/project/")
public class ProjectPublishController {

    @Resource
    private ProjectPublishService service;

    @GetMapping("{id}")
    @ApiOperation(value = "获取单个信息")
    public ProjectPublish get(@PathVariable Integer id) {
        return service.get(id);
    }

    @GetMapping
    @ApiOperation(value = "列表查询")
    public PageResult<PageData> search(Pageable pageable, HttpServletRequest request) {
        return service.search(new PageData(request), pageable);
    }

    @PostMapping
    @ApiOperation(value = "新增")
    @RequiresPermissions("PROJECT_PUBLISH")
    public Boolean add(@RequestBody ProjectPublish entity) {
        return service.add(entity);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    @RequiresPermissions("PROJECT_PUBLISH")
    public Boolean edit(@RequestBody ProjectPublish entity) {
        return service.edit(entity);
    }

    @DeleteMapping("{id}")
    @ApiOperation(value = "删除")
    @RequiresPermissions("PROJECT_PUBLISH")
    public Boolean del(@PathVariable Integer id) {
        return service.del(id);
    }
}
