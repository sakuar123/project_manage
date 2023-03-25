package com.sakura.project_manage.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.sakura.project_manage.common.enums.EnumProjectType;
import com.sakura.project_manage.common.exception.ErrorException;
import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.ProjectPublish;
import com.sakura.project_manage.mapper.generator.ProjectPublishGeneratorMapper;
import com.sakura.project_manage.service.ProjectPublishService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/13 21:21
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class ProjectPublishServiceImpl implements ProjectPublishService {

    @Autowired
    private ProjectPublishGeneratorMapper generatorMapper;

    private String message = "项目发布";

    @Override
    public ProjectPublish get(Integer id) {
        return generatorMapper.selectOne(ProjectPublish.builder().id(id).build());
    }

    @Override
    public PageResult<PageData> search(PageData pageData, Pageable pageable) {
        PageHelper.startPage(pageable.getPageNumber(), pageable.getPageSize());
        List<PageData> result = generatorMapper.search(pageData);
        Map<Integer, String> map = Arrays.stream(EnumProjectType.values())
                .collect(Collectors.toMap(EnumProjectType::getCold, EnumProjectType::getValue));
        result.forEach(pd -> pd.put("projectType", map.get(pd.getIntegerVal("projectType"))));
        return PageResult.success(result);
    }

    @Override
    public Boolean add(ProjectPublish projectPublish) {
        try {
            projectPublish.setProjectAppendix("http://cssmobanobs.obs.cn-east-3.myhuaweicloud.com/d_res/20229558.docx");
            generatorMapper.insertSelective(projectPublish);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("异常信息", e);
            throw new ErrorException("新增" + message + "失败");
        }
    }

    @Override
    public Boolean edit(ProjectPublish projectPublish) {
        try {
            generatorMapper.updateByPrimaryKeySelective(projectPublish);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("异常信息", e);
            throw new ErrorException("修改" + message + "失败");
        }
    }

    @Override
    public Boolean del(Integer id) {
        try {
            generatorMapper.deleteByPrimaryKey(ProjectPublish.builder().id(id).build());
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("异常信息", e);
            throw new ErrorException("删除" + message + "失败");
        }
    }
}
