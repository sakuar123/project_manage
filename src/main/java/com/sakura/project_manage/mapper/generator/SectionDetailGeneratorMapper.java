package com.sakura.project_manage.mapper.generator;

import com.sakura.project_manage.entity.SectionDetail;
import com.sakura.project_manage.entity.example.SectionDetailExample;
import com.sakura.project_manage.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SectionDetailGeneratorMapper extends BaseGeneratorMapper<SectionDetail> {
    long countByExample(SectionDetailExample example);
}