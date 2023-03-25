package com.sakura.project_manage.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.SustainDetail;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/12 14:41
 */
public interface SustainDetailService {

    SustainDetail get(Integer id);

    PageResult<SustainDetail> search(PageData pageData, Pageable pageable);

    Boolean add(SustainDetail sustainDetail);

    Boolean edit(SustainDetail sustainDetail);

    Boolean del(Integer id);

}
