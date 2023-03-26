package com.sakura.project_manage.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.web.vo.ScienceProjectVo;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/26 19:10
 */
public interface ScienceProjectService {

    PageData get(Integer id);

    PageResult<PageData> search(PageData pageData, Pageable pageable);

    Boolean add(ScienceProjectVo scienceProjectVo);

    Boolean edit(ScienceProjectVo scienceProjectVo);

    Boolean del(Integer id);


}
