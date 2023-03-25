package com.sakura.project_manage.mapper.generator;

import com.sakura.project_manage.entity.FundProject;
import com.sakura.project_manage.entity.example.FundProjectExample;
import com.sakura.project_manage.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FundProjectGeneratorMapper extends BaseGeneratorMapper<FundProject> {
    long countByExample(FundProjectExample example);
}