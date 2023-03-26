package com.sakura.project_manage.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.HonourProject;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/26 15:19
 */
public interface HonourProjectService {

    PageData get(Integer id);

    PageResult<PageData> search(PageData pageData, Pageable pageable);

    Boolean add(HonourProject honourProject);

    Boolean edit(HonourProject honourProject);

    Boolean del(Integer id);

}
