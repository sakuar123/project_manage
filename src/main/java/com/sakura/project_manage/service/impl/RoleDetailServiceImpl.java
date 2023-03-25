package com.sakura.project_manage.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import com.sakura.project_manage.common.exception.ErrorException;
import com.sakura.project_manage.common.utils.ObjectTools;
import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.RoleDetail;
import com.sakura.project_manage.entity.UserDetail.Column;
import com.sakura.project_manage.entity.example.RoleDetailExample;
import com.sakura.project_manage.mapper.generator.RoleDetailGeneratorMapper;
import com.sakura.project_manage.service.RoleDetailService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/8 19:55
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleDetailServiceImpl implements RoleDetailService {

    @Autowired
    private RoleDetailGeneratorMapper roleDetailGeneratorMapper;

    @Override
    public RoleDetail get(Integer id) {
        return roleDetailGeneratorMapper.selectOne(RoleDetail.builder().id(id).build());
    }

    @Override
    public List<PageData> getRoleList() {
        List<RoleDetail> list = roleDetailGeneratorMapper.selectAll();
        List<PageData> result = Lists.newArrayList();
        list.forEach(roleDetail -> {
            PageData pageData = new PageData();
            pageData.put("roleId", roleDetail.getId());
            pageData.put("roleName", roleDetail.getRoleName());
            result.add(pageData);
        });
        return result;
    }

    @Override
    public PageResult<RoleDetail> search(Pageable pageable, PageData pageData) {
        PageHelper.startPage(pageable.getPageNumber(), pageable.getPageSize());
        RoleDetailExample.Criteria criteria = new RoleDetailExample().or();
        String roleName = pageData.getString("roleName");
        if (ObjectTools.isNotBlank(roleName)) {
            criteria.andRoleNameLike(StringUtils.join("%", roleName, "%"));
        }
        return PageResult
                .success(roleDetailGeneratorMapper.selectByExample(criteria.example().orderBy(Column.id.asc())));
    }

    @Override
    public Boolean conserve(RoleDetail roleDetail) {
        try {
            roleDetailGeneratorMapper.insertSelective(roleDetail);
            return Boolean.TRUE;
        } catch (Exception e) {
            throw new ErrorException("新增角色失败");
        }
    }

    @Override
    public Boolean modify(RoleDetail roleDetail) {
        try {
            roleDetailGeneratorMapper.updateByPrimaryKeySelective(roleDetail);
            return Boolean.TRUE;
        } catch (Exception e) {
            throw new ErrorException("修改角色失败");
        }
    }

    @Override
    public Boolean remove(Integer id) {
        try {
            roleDetailGeneratorMapper.deleteByPrimaryKey(RoleDetail.builder().id(id).build());
            return Boolean.TRUE;
        } catch (Exception e) {
            throw new ErrorException("删除角色失败");
        }
    }
}
