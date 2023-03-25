package com.sakura.project_manage.common.vo;

import java.util.List;

import com.sakura.project_manage.entity.AuthorityDetail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/11 15:07
 * 权限树状图
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorityMenuVo {

    private AuthorityDetail authorityDetail;

    private List<AuthorityDetail> childrenAuthorityList;

}
