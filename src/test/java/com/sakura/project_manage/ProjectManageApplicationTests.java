package com.sakura.project_manage;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sakura.project_manage.common.utils.CommonsUtil;
import com.sakura.project_manage.common.utils.JwtUtil;
import com.sakura.project_manage.common.utils.MD5Util;
import com.sakura.project_manage.entity.AuthorityDetail;
import com.sakura.project_manage.entity.FundProject;
import com.sakura.project_manage.entity.UserDetail;
import com.sakura.project_manage.mapper.generator.AuthorityDetailGeneratorMapper;
import com.sakura.project_manage.mapper.generator.FundProjectDetailGeneratorMapper;
import com.sakura.project_manage.mapper.generator.FundProjectGeneratorMapper;
import com.sakura.project_manage.mapper.generator.UserDetailGeneratorMapper;

import io.jsonwebtoken.Claims;

@SpringBootTest
class ProjectManageApplicationTests {

    @Autowired
    private UserDetailGeneratorMapper userDetailGeneratorMapper;

    @Test
    void t1() {
        String salt = CommonsUtil.getRandomString(8);
        String password = MD5Util.getMd5("123456", salt);
        UserDetail userDetail = UserDetail
                .builder()
                .gender(1)
                .userAccount("13010669997")
                .userCompany(1)
                .userName("张三")
                .userRole(1)
                .userPassword(password)
                .userPasswordSalt(salt)
                .build();
        userDetailGeneratorMapper.insertSelective(userDetail);
    }

    @Test
    void t2() {
        UserDetail userDetail = userDetailGeneratorMapper.selectOne(UserDetail.builder().id(1).build());
        String token = JwtUtil.createJwt(JSONObject.toJSONString(userDetail));
        System.out.println(token);
        Claims claims = JwtUtil.parseJwt(token);
    }

    @Autowired
    private AuthorityDetailGeneratorMapper authorityDetailGeneratorMapper;

    @Test
    void t3() {
        List<AuthorityDetail> list = authorityDetailGeneratorMapper.selectAll();
        // 操作所有的数据
        // 通过Collectors.groupingBy(Address::getPid)方法按照Pid进行分组，也就是将pid相同的放在一起
        Map<Integer, List<AuthorityDetail>> map = list.stream()
                .collect(Collectors.groupingBy(AuthorityDetail::getParentId));
        System.out.println(JSON.toJSONString(map));
        // 循环addresses,给它设置children属性
        list.forEach(authorityDetail -> {
            authorityDetail.setAuthorityDetailList(map.get(authorityDetail.getId()));
        });
        // 现在已经形成了多棵树，最后我们再通过filter()方法挑选出根节点的那颗树即可。 这里我的根节点的pid为0
        List<AuthorityDetail> result = list.stream().filter(authorityDetail -> authorityDetail.getParentId().equals(0))
                .collect(Collectors.toList());
        System.out.println(JSON.toJSONString(result));
    }

    @Autowired
    private FundProjectGeneratorMapper fundProjectGeneratorMapper;
    @Autowired
    private FundProjectDetailGeneratorMapper fundProjectDetailGeneratorMapper;

    @Test
    void t4() {
        fundProjectGeneratorMapper.insertSelective(FundProject
                .builder()
                .createUser(1)
                .departmentId(1)
                .projectAppendix("")
                .build());
    }
}