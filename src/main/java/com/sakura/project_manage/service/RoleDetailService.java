package com.sakura.project_manage.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.RoleDetail;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/8 19:54
 */
public interface RoleDetailService {

    RoleDetail get(Integer id);

    List<PageData> getRoleList();

    PageResult<RoleDetail> search(Pageable pageable, PageData pageData);

    Boolean conserve(RoleDetail roleDetail);

    Boolean modify(RoleDetail roleDetail);

    Boolean remove(Integer id);

}
