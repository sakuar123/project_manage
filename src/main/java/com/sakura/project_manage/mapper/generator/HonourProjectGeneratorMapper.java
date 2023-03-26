package com.sakura.project_manage.mapper.generator;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.entity.HonourProject;
import com.sakura.project_manage.entity.example.HonourProjectExample;
import com.sakura.project_manage.mapper.BaseGeneratorMapper;

@Mapper
public interface HonourProjectGeneratorMapper extends BaseGeneratorMapper<HonourProject> {

    long countByExample(HonourProjectExample example);

    PageData get(int id);

    List<PageData> search(PageData pageData);
}