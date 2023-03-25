package com.sakura.project_manage.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.OperateLogDetail;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/8 21:12
 */
public interface OperateLogDetailService {


    PageResult<OperateLogDetail> search(PageData pageData, Pageable pageable);
}
