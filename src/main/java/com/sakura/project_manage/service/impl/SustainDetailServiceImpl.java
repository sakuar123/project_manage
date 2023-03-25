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
import com.sakura.project_manage.entity.SustainDetail;
import com.sakura.project_manage.entity.SustainDetail.Column;
import com.sakura.project_manage.entity.example.SustainDetailExample;
import com.sakura.project_manage.mapper.generator.SustainDetailGeneratorMapper;
import com.sakura.project_manage.service.SustainDetailService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/12 14:42
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class SustainDetailServiceImpl implements SustainDetailService {

    @Autowired
    private SustainDetailGeneratorMapper generatorMapper;

    private String message = "支持方式";

    @Override
    public SustainDetail get(Integer id) {
        return generatorMapper.selectOne(SustainDetail.builder().id(id).build());
    }

    @Override
    public PageResult<SustainDetail> search(PageData pageData, Pageable pageable) {
        PageHelper.startPage(pageable.getPageNumber(), pageable.getPageSize());
        SustainDetailExample.Criteria criteria = new SustainDetailExample().or();
        String sustainName = pageData.getString("sustainName");
        if (ObjectTools.isNotBlank(sustainName)) {
            criteria.andSustainNameLike(StringUtils.join("%", sustainName, "%"));
        }
        return PageResult.success(generatorMapper.selectByExample(criteria.example().orderBy(Column.id.asc())));
    }

    @Override
    public Boolean add(SustainDetail sustainDetail) {
        try {
            generatorMapper.insertSelective(sustainDetail);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("异常信息", e);
            throw new ErrorException("新增" + message + "失败");
        }
    }

    @Override
    public Boolean edit(SustainDetail sustainDetail) {
        try {
            generatorMapper.updateByPrimaryKeySelective(sustainDetail);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("异常信息", e);
            throw new ErrorException("修改" + message + "失败");
        }
    }

    @Override
    public Boolean del(Integer id) {
        try {
            generatorMapper.deleteByPrimaryKey(SustainDetail.builder().id(id).build());
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("异常信息", e);
            throw new ErrorException("删除" + message + "失败");
        }
    }
}
