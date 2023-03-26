package com.sakura.project_manage.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.sakura.project_manage.common.enums.EnumProjectFundStatus;
import com.sakura.project_manage.common.enums.EnumProjectLevel;
import com.sakura.project_manage.common.exception.ErrorException;
import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.HonourProject;
import com.sakura.project_manage.entity.UserDetail;
import com.sakura.project_manage.mapper.generator.HonourProjectGeneratorMapper;
import com.sakura.project_manage.mapper.generator.UserDetailGeneratorMapper;
import com.sakura.project_manage.service.HonourProjectService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/26 15:19
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class HonourProjectServiceImpl implements HonourProjectService {

    @Autowired
    private HonourProjectGeneratorMapper generatorMapper;

    @Autowired
    private UserDetailGeneratorMapper userDetailGeneratorMapper;

    @Override
    public PageData get(Integer id) {
        PageData result = new PageData();
        UserDetail userDetail = (UserDetail) SecurityUtils.getSubject().getPrincipal();
        result.put("userDetail", userDetailGeneratorMapper.getUserDetail(userDetail.getId()));
        result.put("honourProject", generatorMapper.get(id));
        return result;
    }

    @Override
    public PageResult<PageData> search(PageData pageData, Pageable pageable) {
        PageHelper.startPage(pageable.getPageNumber(), pageable.getPageSize());
        Map<Integer, String> projectLevelMap = Arrays.stream(EnumProjectLevel.values())
                .collect(Collectors.toMap(EnumProjectLevel::getCode, EnumProjectLevel::getValue));
        Map<Integer, String> statusMap = Arrays.stream(EnumProjectFundStatus.values())
                .collect(Collectors.toMap(EnumProjectFundStatus::getCode, EnumProjectFundStatus::getValue));
        List<PageData> result = generatorMapper.search(pageData);
        result.forEach(pd -> {
            pd.put("projectLevel", projectLevelMap.get(pd.getIntegerVal("projectLevel")));
            pd.put("projectStatus", statusMap.get(pd.getIntegerVal("projectStatus")));
        });
        return PageResult.success(result);
    }

    @Override
    public Boolean add(HonourProject honourProject) {
        try {
            generatorMapper.insertSelective(honourProject);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("新增科技项目失败", e);
            throw new ErrorException("新增科技项目失败");
        }
    }

    @Override
    public Boolean edit(HonourProject honourProject) {
        try {
            generatorMapper.updateByPrimaryKeySelective(honourProject);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("修改科技项目失败", e);
            throw new ErrorException("修改科技项目失败");
        }
    }

    @Override
    public Boolean del(Integer id) {
        try {
            generatorMapper.deleteByPrimaryKey(HonourProject.builder().id(id).build());
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("删除科技项目失败", e);
            throw new ErrorException("删除科技项目失败");
        }
    }
}
