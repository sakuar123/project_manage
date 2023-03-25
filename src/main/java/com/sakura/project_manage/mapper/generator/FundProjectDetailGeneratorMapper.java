package com.sakura.project_manage.mapper.generator;

import org.apache.ibatis.annotations.Mapper;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.entity.FundProjectDetail;
import com.sakura.project_manage.entity.example.FundProjectDetailExample;
import com.sakura.project_manage.mapper.BaseGeneratorMapper;

@Mapper
public interface FundProjectDetailGeneratorMapper extends BaseGeneratorMapper<FundProjectDetail> {

    long countByExample(FundProjectDetailExample example);

    PageData get(Integer id);
}