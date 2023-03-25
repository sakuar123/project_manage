package com.sakura.project_manage.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.sakura.project_manage.common.exception.ErrorException;
import com.sakura.project_manage.common.utils.ObjectTools;
import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.DepartmentDetail;
import com.sakura.project_manage.entity.DepartmentDetail.Column;
import com.sakura.project_manage.entity.example.DepartmentDetailExample;
import com.sakura.project_manage.mapper.generator.DepartmentDetailGeneratorMapper;
import com.sakura.project_manage.service.DepartmentDetailService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/12 14:26
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class DepartmentDetailServiceImpl implements DepartmentDetailService {

    @Autowired
    private DepartmentDetailGeneratorMapper generatorMapper;

    private String message = "部门";

    @Override
    public DepartmentDetail get(Integer id) {
        return generatorMapper.selectOne(DepartmentDetail.builder().id(id).build());
    }

    @Override
    public PageResult<DepartmentDetail> search(PageData pageData, Pageable pageable) {
        PageHelper.startPage(pageable.getPageNumber(), pageable.getPageSize());
        DepartmentDetailExample.Criteria criteria = new DepartmentDetailExample().or();
        String departmentName = pageData.getString("departmentName");
        if (ObjectTools.isNotBlank(departmentName)) {
            criteria.andDepartmentNameLike(StringUtils.join("%", departmentName, "%"));
        }
        return PageResult.success(generatorMapper.selectByExample(criteria.example().orderBy(Column.id.asc())));
    }

    @Override
    public Boolean add(DepartmentDetail departmentDetail) {
        try {
            generatorMapper.insertSelective(departmentDetail);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("异常信息", e);
            throw new ErrorException("新增" + message + "失败");
        }
    }

    @Override
    public Boolean edit(DepartmentDetail departmentDetail) {
        try {
            generatorMapper.updateByPrimaryKeySelective(departmentDetail);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("异常信息", e);
            throw new ErrorException("修改" + message + "失败");
        }
    }

    @Override
    public Boolean del(Integer id) {
        try {
            generatorMapper.deleteByPrimaryKey(DepartmentDetail.builder().id(id).build());
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("异常信息", e);
            throw new ErrorException("删除" + message + "失败");
        }
    }
}
