package com.sakura.project_manage.mapper.generator;

import com.sakura.project_manage.entity.FundProjectDetail;
import com.sakura.project_manage.entity.example.FundProjectDetailExample;
import com.sakura.project_manage.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FundProjectDetailGeneratorMapper extends BaseGeneratorMapper<FundProjectDetail> {
    long countByExample(FundProjectDetailExample example);
}