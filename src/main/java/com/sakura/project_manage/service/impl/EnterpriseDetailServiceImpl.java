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
import com.sakura.project_manage.entity.EnterpriseDetail;
import com.sakura.project_manage.entity.EnterpriseDetail.Column;
import com.sakura.project_manage.entity.example.EnterpriseDetailExample;
import com.sakura.project_manage.mapper.generator.EnterpriseDetailGeneratorMapper;
import com.sakura.project_manage.service.EnterpriseDetailService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/11 22:01
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class EnterpriseDetailServiceImpl implements EnterpriseDetailService {

    @Autowired
    private EnterpriseDetailGeneratorMapper generatorMapper;

    @Override
    public EnterpriseDetail get(Integer id) {
        return generatorMapper.selectOne(EnterpriseDetail.builder().id(id).build());
    }

    @Override
    public PageResult<EnterpriseDetail> search(PageData pageData, Pageable pageable) {
        PageHelper.startPage(pageable.getPageNumber(), pageable.getPageSize());
        EnterpriseDetailExample.Criteria criteria = new EnterpriseDetailExample().or();
        String enterpriseName = pageData.getString("enterpriseName");
        String taxpayerNo = pageData.getString("taxpayerNo");
        if (ObjectTools.isNotBlank(enterpriseName)) {
            criteria.andEnterpriseNameLike(StringUtils.join("%", enterpriseName, "%"));
        }
        if (ObjectTools.isNotBlank(taxpayerNo)) {
            criteria.andTaxpayerNoLike(StringUtils.join("%", taxpayerNo, "%"));
        }
        return PageResult.success(generatorMapper.selectByExample(criteria.example().orderBy(Column.id.asc())));
    }

    @Override
    public Boolean add(EnterpriseDetail enterpriseDetail) {
        try {
            generatorMapper.insertSelective(enterpriseDetail);
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            throw new ErrorException("新增企业失败");
        }
    }

    @Override
    public Boolean edit(EnterpriseDetail enterpriseDetail) {
        try {
            generatorMapper.updateByPrimaryKeySelective(enterpriseDetail);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ErrorException("修改企业失败");
        }
    }

    @Override
    public Boolean del(Integer id) {
        try {
            generatorMapper.deleteByPrimaryKey(EnterpriseDetail.builder().id(id).build());
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ErrorException("删除企业失败");
        }
    }
}
