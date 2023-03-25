package com.sakura.project_manage.service;

import java.util.List;

import com.sakura.project_manage.common.vo.AuthorityMenuVo;
import com.sakura.project_manage.entity.AuthorityDetail;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/11 16:34
 */
public interface AuthorityDetailService {

    List<AuthorityDetail> list();

    Boolean conserve(AuthorityDetail authorityDetail);

    Boolean modify(AuthorityDetail authorityDetail);

}
