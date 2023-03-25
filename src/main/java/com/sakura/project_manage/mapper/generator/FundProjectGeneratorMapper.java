package com.sakura.project_manage.mapper.generator;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.entity.FundProject;
import com.sakura.project_manage.entity.example.FundProjectExample;
import com.sakura.project_manage.mapper.BaseGeneratorMapper;

@Mapper
public interface FundProjectGeneratorMapper extends BaseGeneratorMapper<FundProject> {

    long countByExample(FundProjectExample example);

    PageData get(Integer id);

    List<PageData> search(PageData pageData);
}