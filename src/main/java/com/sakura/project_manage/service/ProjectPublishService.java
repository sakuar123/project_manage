package com.sakura.project_manage.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.ProjectPublish;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/13 21:21
 */
public interface ProjectPublishService {

    ProjectPublish get(Integer id);

    PageResult<PageData> search(PageData pageData, Pageable pageable);

    Boolean add(ProjectPublish projectPublish);

    Boolean edit(ProjectPublish projectPublish);

    Boolean del(Integer id);

}
