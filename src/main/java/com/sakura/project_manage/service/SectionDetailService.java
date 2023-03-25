package com.sakura.project_manage.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.SectionDetail;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/12 13:59
 */
public interface SectionDetailService {

    SectionDetail get(Integer id);

    PageResult<SectionDetail> search(PageData pageData, Pageable pageable);

    Boolean add(SectionDetail sectionDetail);

    Boolean edit(SectionDetail sectionDetail);

    Boolean del(Integer id);

}
