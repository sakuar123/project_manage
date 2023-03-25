package com.sakura.project_manage.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project_manage.common.utils.PageData;
import com.sakura.project_manage.common.utils.PageResult;
import com.sakura.project_manage.entity.UserDetail;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/2/28 14:34
 */
public interface UserDetailService {

    PageData login(String userAccout, String password);

    UserDetail get(Integer id);

    PageResult<PageData> search(Pageable pageable, PageData pageData);

    Boolean conserve(UserDetail userDetail);

    Boolean modify(UserDetail userDetail);

    Boolean remove(Integer id);

    Boolean restPassword(String oldPassword, String newPassword);

}
