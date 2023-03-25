package com.sakura.project_manage.web.controller.basic;

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
import com.sakura.project_manage.entity.CompanyDetail;
import com.sakura.project_manage.service.CompanyDetailService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/2/28 15:10
 */
@RestController
@Api("公司维护管理器")
@RequestMapping("/basic/company/")
public class CompanyDetailController {

    @Autowired
    private CompanyDetailService companyDetailService;

    @GetMapping("{id}")
    @ApiOperation(value = "获取单个公司信息")
    public CompanyDetail get(@PathVariable Integer id) {
        return companyDetailService.get(id);
    }

    @GetMapping
    @ApiOperation(value = "获取公司列表")
    public PageResult<CompanyDetail> search(HttpServletRequest request, Pageable pageable) {
        return companyDetailService.search(pageable, new PageData(request));
    }

    @GetMapping("/getCompanyList")
    @ApiOperation(value = "获取公司列表")
    public List<PageData> getCompanyList() {
        return companyDetailService.getCompanyList();
    }

    @PostMapping
    @ApiOperation(value = "新增公司")
    @RequiresPermissions("COMPANY_MANAGE")
    public Boolean conserve(@RequestBody CompanyDetail companyDetail) {
        return companyDetailService.conserve(companyDetail);
    }

    @PutMapping
    @ApiOperation(value = "修改公司")
    @RequiresPermissions("COMPANY_MANAGE")
    public Boolean modify(@RequestBody CompanyDetail companyDetail) {
        return companyDetailService.modify(companyDetail);
    }

    @DeleteMapping("{id}")
    @ApiOperation(value = "删除公司")
    @RequiresPermissions("COMPANY_MANAGE")
    public Boolean remove(@PathVariable Integer id) {
        return companyDetailService.remove(id);
    }

}
