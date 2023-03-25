package com.sakura.project_manage.mapper.generator;

import com.sakura.project_manage.entity.CompanyDetail;
import com.sakura.project_manage.entity.example.CompanyDetailExample;
import com.sakura.project_manage.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyDetailGeneratorMapper extends BaseGeneratorMapper<CompanyDetail> {
    long countByExample(CompanyDetailExample example);
}