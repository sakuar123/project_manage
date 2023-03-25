package com.sakura.project_manage.mapper.generator;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.entity.UserDetail;
import com.sakura.project_manage.entity.example.UserDetailExample;
import com.sakura.project_manage.mapper.BaseGeneratorMapper;

@Mapper
public interface UserDetailGeneratorMapper extends BaseGeneratorMapper<UserDetail> {

    long countByExample(UserDetailExample example);

    List<PageData> search(PageData pageData);

    PageData getUserDetail(Integer id);
}