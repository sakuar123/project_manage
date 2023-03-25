package com.sakura.project_manage.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.FundProjectDetail;
import com.sakura.project_manage.web.vo.FundProjectDetailVo;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/20 21:33
 */
public interface FundProjectDetailService {

    PageData get(Integer id);

    PageResult<PageData> search(PageData pageData, Pageable pageable);

    Boolean add(FundProjectDetailVo fundProjectDetailVo);

    Boolean edit(FundProjectDetailVo fundProjectDetailVo);

    Boolean del(Integer id);

}
