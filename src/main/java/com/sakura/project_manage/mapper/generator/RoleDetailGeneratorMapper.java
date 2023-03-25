package com.sakura.project_manage.mapper.generator;

import com.sakura.project_manage.entity.RoleDetail;
import com.sakura.project_manage.entity.example.RoleDetailExample;
import com.sakura.project_manage.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleDetailGeneratorMapper extends BaseGeneratorMapper<RoleDetail> {
    long countByExample(RoleDetailExample example);
}