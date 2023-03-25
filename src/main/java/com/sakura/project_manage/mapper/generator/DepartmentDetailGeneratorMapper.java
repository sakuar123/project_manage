package com.sakura.project_manage.mapper.generator;

import com.sakura.project_manage.entity.DepartmentDetail;
import com.sakura.project_manage.entity.example.DepartmentDetailExample;
import com.sakura.project_manage.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentDetailGeneratorMapper extends BaseGeneratorMapper<DepartmentDetail> {
    long countByExample(DepartmentDetailExample example);
}