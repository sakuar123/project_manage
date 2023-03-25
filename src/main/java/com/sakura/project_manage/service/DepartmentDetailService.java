package com.sakura.project_manage.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.DepartmentDetail;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/12 14:26
 */
public interface DepartmentDetailService {

    DepartmentDetail get(Integer id);

    PageResult<DepartmentDetail> search(PageData pageData, Pageable pageable);

    Boolean add(DepartmentDetail departmentDetail);

    Boolean edit(DepartmentDetail departmentDetail);

    Boolean del(Integer id);
}
