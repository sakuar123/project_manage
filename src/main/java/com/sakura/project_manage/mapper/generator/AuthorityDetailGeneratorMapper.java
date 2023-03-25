package com.sakura.project_manage.mapper.generator;

import com.sakura.project_manage.entity.AuthorityDetail;
import com.sakura.project_manage.entity.example.AuthorityDetailExample;
import com.sakura.project_manage.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthorityDetailGeneratorMapper extends BaseGeneratorMapper<AuthorityDetail> {
    long countByExample(AuthorityDetailExample example);
}