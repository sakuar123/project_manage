package com.sakura.project_manage.web.controller.sys;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.OperateLogDetail;
import com.sakura.project_manage.service.OperateLogDetailService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/8 21:16
 */
@RestController
@Api(tags = "用户操作记录管理器")
@RequestMapping("/sys/log/")
public class OperateLogDetailController {

    @Autowired
    private OperateLogDetailService operateLogDetailService;

    @GetMapping
    @RequiresPermissions("OPERATE_LOG")
    @ApiOperation(value = "获取用户操作信息列表")
    public PageResult<OperateLogDetail> search(Pageable pageable, HttpServletRequest request) {
        return operateLogDetailService.search(new PageData(request), pageable);
    }


}
