package com.sakura.project_manage.mapper.generator;

import com.sakura.project_manage.entity.ScienceProjectUnits;
import com.sakura.project_manage.entity.example.ScienceProjectUnitsExample;
import com.sakura.project_manage.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScienceProjectUnitsGeneratorMapper extends BaseGeneratorMapper<ScienceProjectUnits> {
    long countByExample(ScienceProjectUnitsExample example);
}