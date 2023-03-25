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
import com.sakura.project_manage.entity.SectionDetail;
import com.sakura.project_manage.entity.SectionDetail.Column;
import com.sakura.project_manage.entity.example.SectionDetailExample;
import com.sakura.project_manage.mapper.generator.SectionDetailGeneratorMapper;
import com.sakura.project_manage.service.SectionDetailService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/12 13:59
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class SectionDetailServiceImpl implements SectionDetailService {

    @Autowired
    private SectionDetailGeneratorMapper generatorMapper;

    @Override
    public SectionDetail get(Integer id) {
        return generatorMapper.selectOne(SectionDetail.builder().id(id).build());
    }

    @Override
    public PageResult<SectionDetail> search(PageData pageData, Pageable pageable) {
        PageHelper.startPage(pageable.getPageNumber(), pageable.getPageSize());
        SectionDetailExample.Criteria criteria = new SectionDetailExample().or();
        String sectionName = pageData.getString("sectionName");
        if (ObjectTools.isNotBlank(sectionName)) {
            criteria.andSectionNameLike(StringUtils.join("%", sectionName, "%"));
        }
        return PageResult.success(generatorMapper.selectByExample(criteria.example().orderBy(Column.id.asc())));
    }

    @Override
    public Boolean add(SectionDetail sectionDetail) {
        try {
            generatorMapper.insertSelective(sectionDetail);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("异常信息", e);
            throw new ErrorException("新增科室失败");
        }
    }

    @Override
    public Boolean edit(SectionDetail sectionDetail) {
        try {
            generatorMapper.updateByPrimaryKeySelective(sectionDetail);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("异常信息", e);
            throw new ErrorException("修改科室失败");
        }
    }

    @Override
    public Boolean del(Integer id) {
        try {
            generatorMapper.deleteByPrimaryKey(SectionDetail.builder().id(id).build());
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("异常信息", e);
            throw new ErrorException("删除科室失败");
        }
    }
}
