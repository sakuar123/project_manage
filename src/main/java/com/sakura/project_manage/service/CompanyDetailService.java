package com.sakura.project_manage.service;


import java.util.List;

import org.springframework.data.domain.Pageable;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.CompanyDetail;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/2/28 14:50
 */
public interface CompanyDetailService {

    CompanyDetail get(Integer id);

    PageResult<CompanyDetail> search(Pageable pageable, PageData pageData);

    Boolean conserve(CompanyDetail companyDetail);

    Boolean modify(CompanyDetail companyDetail);

    Boolean remove(Integer id);

    List<PageData> getCompanyList();

}
