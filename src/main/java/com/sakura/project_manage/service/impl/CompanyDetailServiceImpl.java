package com.sakura.project_manage.service.impl;


import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import com.sakura.project_manage.common.exception.ErrorException;
import com.sakura.project_manage.common.utils.ObjectTools;
import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.CompanyDetail;
import com.sakura.project_manage.entity.CompanyDetail.Column;
import com.sakura.project_manage.entity.example.CompanyDetailExample;
import com.sakura.project_manage.mapper.generator.CompanyDetailGeneratorMapper;
import com.sakura.project_manage.service.CompanyDetailService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/2/28 14:50
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class CompanyDetailServiceImpl implements CompanyDetailService {

    @Autowired
    private CompanyDetailGeneratorMapper companyDetailGeneratorMapper;

    private final String message = "公司";

    @Override
    public CompanyDetail get(Integer id) {
        return companyDetailGeneratorMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult<CompanyDetail> search(Pageable pageable, PageData pageData) {
        //开启分页效果
        PageHelper.startPage(pageable.getPageNumber(), pageable.getPageSize());
        //查询参数
        String companyName = pageData.getString("companyName");
        //构建查询条件
        CompanyDetailExample.Criteria criteria = new CompanyDetailExample().or();
        //如果参数不为空,则拼接参数
        if (ObjectTools.isNotBlank(companyName)) {
            criteria.andCompanyDescLike(StringUtils.join("%", companyName, "%"));
        }
        //查询
        List<CompanyDetail> list = companyDetailGeneratorMapper
                .selectByExample(criteria.example().orderBy(Column.id.desc()));
        return PageResult.success(list);
    }

    @Override
    public Boolean conserve(CompanyDetail companyDetail) {
        try {
            companyDetailGeneratorMapper.insertSelective(companyDetail);
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ErrorException(StringUtils.join("新增", message, "异常,请联系系统管理员处理"));
        }
        return Boolean.TRUE;
    }

    @Override
    public Boolean modify(CompanyDetail companyDetail) {
        try {
            companyDetailGeneratorMapper.updateByPrimaryKeySelective(companyDetail);
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ErrorException(StringUtils.join("修改", message, "异常,请联系系统管理员处理"));
        }
        return Boolean.TRUE;
    }

    @Override
    public Boolean remove(Integer id) {
        try {
            companyDetailGeneratorMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ErrorException(StringUtils.join("删除", message, "异常,请联系系统管理员处理"));
        }
        return Boolean.TRUE;
    }

    @Override
    public List<PageData> getCompanyList() {
        List<CompanyDetail> list = companyDetailGeneratorMapper.selectAll();
        List<PageData> result = Lists.newArrayList();
        list.forEach(companyDetail -> {
            PageData pageData = new PageData();
            pageData.put("companyId", companyDetail.getId());
            pageData.put("companyName", companyDetail.getCompanyName());
            result.add(pageData);
        });
        return result;
    }
}
