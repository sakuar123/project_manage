package com.sakura.project_manage.mapper.generator;

import com.sakura.project_manage.entity.SustainDetail;
import com.sakura.project_manage.entity.example.SustainDetailExample;
import com.sakura.project_manage.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SustainDetailGeneratorMapper extends BaseGeneratorMapper<SustainDetail> {
    long countByExample(SustainDetailExample example);
}