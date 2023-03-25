package com.sakura.project_manage.service.impl;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.FundProjectDetail;
import com.sakura.project_manage.service.FundProjectDetailService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/20 21:35
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class FundProjectDetailServiceImpl implements FundProjectDetailService {

    @Override
    public PageData get(Integer id) {
        return null;
    }

    @Override
    public PageResult<PageData> search(PageData pageData, Pageable pageable) {
        return null;
    }

    @Override
    public Boolean add(FundProjectDetail fundProjectDetail) {
        return null;
    }

    @Override
    public Boolean edit(FundProjectDetail fundProjectDetail) {
        return null;
    }

    @Override
    public Boolean del(Integer id) {
        return null;
    }
}
