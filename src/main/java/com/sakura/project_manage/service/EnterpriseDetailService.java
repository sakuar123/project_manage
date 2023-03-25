package com.sakura.project_manage.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.EnterpriseDetail;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/11 22:00
 */
public interface EnterpriseDetailService {

    EnterpriseDetail get(Integer id);

    PageResult<EnterpriseDetail> search(PageData pageData, Pageable pageable);

    Boolean add(EnterpriseDetail enterpriseDetail);

    Boolean edit(EnterpriseDetail enterpriseDetail);

    Boolean del(Integer id);
}
