package com.sakura.project_manage.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.sakura.project_manage.common.enums.EnumProjectFundStatus;
import com.sakura.project_manage.common.exception.ErrorException;
import com.sakura.project_manage.common.utils.ObjectTools;
import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.ScienceProject;
import com.sakura.project_manage.entity.ScienceProjectUnits;
import com.sakura.project_manage.entity.example.ScienceProjectUnitsExample;
import com.sakura.project_manage.mapper.generator.ScienceProjectGeneratorMapper;
import com.sakura.project_manage.mapper.generator.ScienceProjectUnitsGeneratorMapper;
import com.sakura.project_manage.service.ScienceProjectService;
import com.sakura.project_manage.web.vo.ScienceProjectVo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/26 19:10
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class ScienceProjectServiceImpl implements ScienceProjectService {

    @Autowired
    private ScienceProjectGeneratorMapper scienceProjectGeneratorMapper;
    @Autowired
    private ScienceProjectUnitsGeneratorMapper scienceProjectUnitsGeneratorMapper;

    @Override
    public PageData get(Integer id) {
        PageData result = new PageData();
        ScienceProject scienceProject = scienceProjectGeneratorMapper
                .selectOne(ScienceProject.builder().id(id).build());
        result.put("scienceProject", scienceProject);
        List<ScienceProjectUnits> scienceProjectUnitsList = scienceProjectUnitsGeneratorMapper.selectByExample(
                new ScienceProjectUnitsExample().or().andScienceIdEqualTo(id).example());
        result.put("scienceProjectUnitsList", scienceProjectUnitsList);
        return result;
    }

    @Override
    public PageResult<PageData> search(PageData pageData, Pageable pageable) {
        Map<Integer, String> statusMap = Arrays.stream(EnumProjectFundStatus.values())
                .collect(Collectors.toMap(EnumProjectFundStatus::getCode, EnumProjectFundStatus::getValue));
        PageHelper.startPage(pageable.getPageNumber(), pageable.getPageSize());
        List<PageData> result = scienceProjectGeneratorMapper.search(pageData);
        result.forEach(pd -> pd.put("projectStatus", statusMap.get(pd.getIntegerVal("projectStatus"))));
        return PageResult.success(result);
    }

    @Override
    public Boolean add(ScienceProjectVo scienceProjectVo) {
        try {
            ScienceProject scienceProject = new ScienceProject();
            BeanUtils.copyProperties(scienceProjectVo, scienceProject);
            scienceProjectGeneratorMapper.insertSelective(scienceProject);
            if (ObjectTools.isNotBlank(scienceProjectVo.getScienceProjectUnits())) {
                scienceProjectVo.getScienceProjectUnits()
                        .forEach(scienceProjectUnits -> scienceProjectUnits.setId(scienceProject.getId()));
                scienceProjectUnitsGeneratorMapper.insertList(scienceProjectVo.getScienceProjectUnits());
            }
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("添加项目失败", e);
            throw new ErrorException("添加项目失败");
        }
    }

    @Override
    public Boolean edit(ScienceProjectVo scienceProjectVo) {
        try {
            ScienceProject scienceProject = new ScienceProject();
            BeanUtils.copyProperties(scienceProjectVo, scienceProject);
            scienceProjectGeneratorMapper.updateByPrimaryKeySelective(scienceProject);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("修改项目失败", e);
            throw new ErrorException("修改项目失败");
        }
    }

    @Override
    public Boolean del(Integer id) {
        try {
            scienceProjectGeneratorMapper.deleteByPrimaryKey(ScienceProject.builder().id(id).build());
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("删除项目失败", e);
            throw new ErrorException("删除项目失败");
        }
    }
}
