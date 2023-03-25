package com.sakura.project_manage.mapper.generator;

import com.sakura.project_manage.entity.EnterpriseDetail;
import com.sakura.project_manage.entity.example.EnterpriseDetailExample;
import com.sakura.project_manage.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EnterpriseDetailGeneratorMapper extends BaseGeneratorMapper<EnterpriseDetail> {
    long countByExample(EnterpriseDetailExample example);
}