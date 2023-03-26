package com.sakura.project_manage;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sakura.project_manage.common.enums.EnumProjectLevel;
import com.sakura.project_manage.common.utils.CommonsUtil;
import com.sakura.project_manage.common.utils.DateUtils;
import com.sakura.project_manage.common.utils.JwtUtil;
import com.sakura.project_manage.common.utils.MD5Util;
import com.sakura.project_manage.entity.AuthorityDetail;
import com.sakura.project_manage.entity.FundProject;
import com.sakura.project_manage.entity.FundProjectDetail;
import com.sakura.project_manage.entity.HonourProject;
import com.sakura.project_manage.entity.UserDetail;
import com.sakura.project_manage.mapper.generator.AuthorityDetailGeneratorMapper;
import com.sakura.project_manage.mapper.generator.FundProjectDetailGeneratorMapper;
import com.sakura.project_manage.mapper.generator.FundProjectGeneratorMapper;
import com.sakura.project_manage.mapper.generator.HonourProjectGeneratorMapper;
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
                //创建者
                .createUser(1)
                //部门
                .departmentId(1)
                //附件
                .projectAppendix("http://cssmobanobs.obs.cn-east-3.myhuaweicloud.com/d_res/20229558.docx")
                //是否立项
                .projectApproval(1)
                //项目主体
                .projectBody("某某某子公司")
                //建设地点
                .projectBuildAddress("某某省某某市某某区")
                //主要建设内容
                .projectBuildContent("")
                //项目建设性质
                .projectBuildProperties("")
                //环评
                .projectEia("")
                //项目竣工时间
                .projectEndDate(DateUtils.parseDate("2023-03-25"))
                //能评
                .projectGmp("")
                //土地
                .projectLand("")
                //级别
                .projectLevel(1)
                //项目名称
                .projectName("某某某公司大数据建设")
                //其他
                .projectOther("")
                //规划
                .projectPlan("")
                //所属项目公告
                .projectPublishId(1)
                //项目开工时间
                .projectStartDate(DateUtils.parseDate("2023-01-03"))
                //备案
                .recordPut("2023318220400000024")
                //申报时间
                .reportTime(DateUtils.parseDate("2022-12-31"))
                .sectionId(1)
                .sustainId(1)
                .build());
        fundProjectDetailGeneratorMapper.insertSelective(FundProjectDetail
                .builder()
                //银行贷款
                .bankCredit(new BigDecimal(1200))
                //企业自筹
                .enterpriseSelfFinance(new BigDecimal(1100))
                //中央预算内投资
                .projectCenterInvestment(new BigDecimal(900))
                .projectFundId(1)
                //拟申请资金额度
                .projectFundQuota(new BigDecimal(0))
                //地方预算内投资
                .projectPartInvestment(new BigDecimal(0))
                //项目总投资
                .projectTotalInvestment(new BigDecimal(1000))
                .build());
    }

    @Test
    void t5() {
        FundProject fundProject = fundProjectGeneratorMapper.selectOne(FundProject.builder().id(1).build());
        FundProjectDetail fundProjectDetail = fundProjectDetailGeneratorMapper
                .selectOne(FundProjectDetail.builder().projectFundId(1).build());
        System.out.println(JSON.toJSONString(fundProject));
        System.out.println(JSON.toJSONString(fundProjectDetail));
    }

    @Autowired
    private HonourProjectGeneratorMapper honourProjectGeneratorMapper;

    @Test
    void t6() {
//        honourProjectGeneratorMapper.insertSelective(HonourProject
//                .builder()
//                .departmentId(1)
//                .honourName("某某某荣誉")
//                .projectAppendix("")
//                .projectBody("某某某公司")
//                .projectDesc("")
//                .projectLevel(EnumProjectLevel.CITY.getCode())
//                .projectName("某某某项目")
//                .projectPublishId(1)
//                .reportTime(DateUtils.parseDate("2023-03-25"))
//                .reportCondition("条件1,条件2,条件3")
//                .sectionId(1)
//                .build());
        System.out.println(
                JSON.toJSONString(honourProjectGeneratorMapper.selectOne(HonourProject.builder().id(1).build())));
    }
}
