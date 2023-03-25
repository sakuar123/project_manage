package com.sakura.project_manage.mapper.generator;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.entity.ProjectPublish;
import com.sakura.project_manage.entity.example.ProjectPublishExample;
import com.sakura.project_manage.mapper.BaseGeneratorMapper;

@Mapper
public interface ProjectPublishGeneratorMapper extends BaseGeneratorMapper<ProjectPublish> {

    long countByExample(ProjectPublishExample example);

    List<PageData> search(PageData pageData);
}