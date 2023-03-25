package com.sakura.project_manage.mapper.generator;

import com.sakura.project_manage.entity.OperateLogDetail;
import com.sakura.project_manage.entity.example.OperateLogDetailExample;
import com.sakura.project_manage.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OperateLogDetailGeneratorMapper extends BaseGeneratorMapper<OperateLogDetail> {
    long countByExample(OperateLogDetailExample example);
}