package com.sakura.project_manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.OperateLogDetail;
import com.sakura.project_manage.entity.OperateLogDetail.Column;
import com.sakura.project_manage.entity.example.OperateLogDetailExample;
import com.sakura.project_manage.mapper.generator.OperateLogDetailGeneratorMapper;
import com.sakura.project_manage.service.OperateLogDetailService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/8 21:12
 */
@Slf4j
@Service
public class OperateLogDetailServiceImpl implements OperateLogDetailService {

    @Autowired
    private OperateLogDetailGeneratorMapper operateLogDetailGeneratorMapper;

    @Override
    public PageResult<OperateLogDetail> search(PageData pageData, Pageable pageable) {
        PageHelper.startPage(pageable.getPageNumber(), pageable.getPageSize());
        List<OperateLogDetail> result = operateLogDetailGeneratorMapper
                .selectByExample(new OperateLogDetailExample().orderBy(Column.id.desc()));
        return PageResult.success(result);
    }
}
