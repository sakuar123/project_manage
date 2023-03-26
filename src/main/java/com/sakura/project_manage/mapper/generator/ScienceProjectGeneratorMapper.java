package com.sakura.project_manage.mapper.generator;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.entity.ScienceProject;
import com.sakura.project_manage.entity.example.ScienceProjectExample;
import com.sakura.project_manage.mapper.BaseGeneratorMapper;

@Mapper
public interface ScienceProjectGeneratorMapper extends BaseGeneratorMapper<ScienceProject> {

    long countByExample(ScienceProjectExample example);

    List<PageData> search(PageData pageData);
}