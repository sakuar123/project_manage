package com.sakura.project_manage.web.vo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/25 20:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FundProjectDetailVo {

    @Id
    @ApiModelProperty(value = "主键id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty(value = "项目状态")
    private Integer projectFundStatus;

    @ApiModelProperty(value = "所属项目公告")
    private Integer projectPublishId;

    @ApiModelProperty(value = "项目名称")
    private String projectName;

    @ApiModelProperty(value = "申报时间")
    private Date reportTime;

    @ApiModelProperty(value = "项目主体")
    private String projectBody;

    @ApiModelProperty(value = "项目建设性质")
    private String projectBuildProperties;

    @ApiModelProperty(value = "项目建设主体")
    private String projectBuildContent;

    @ApiModelProperty(value = "项目建设地点")
    private String projectBuildAddress;

    @ApiModelProperty(value = "项目开工时间")
    private Date projectStartDate;

    @ApiModelProperty(value = "项目竣工时间")
    private Date projectEndDate;

    @ApiModelProperty(value = "项目主管部门")
    private Integer departmentId;

    @ApiModelProperty(value = "主管科室")
    private Integer sectionId;

    @ApiModelProperty(value = "支持方式")
    private Integer sustainId;

    @ApiModelProperty(value = "项目级别")
    private Integer projectLevel;

    @ApiModelProperty(value = "是否立项")
    private Integer projectApproval;

    @ApiModelProperty(value = "备案")
    private String recordPut;

    @ApiModelProperty(value = "环评")
    private String projectEia;

    @ApiModelProperty(value = "能评")
    private String projectGmp;

    @ApiModelProperty(value = "土地")
    private String projectLand;

    @ApiModelProperty(value = "规划")
    private String projectPlan;

    @ApiModelProperty(value = "其他")
    private String projectOther;

    @ApiModelProperty(value = "附件")
    private String projectAppendix;

    @ApiModelProperty(value = "拟申请资金额度")
    private BigDecimal projectFundQuota;

    @ApiModelProperty(value = "项目总投资")
    private BigDecimal projectTotalInvestment;

    @ApiModelProperty(value = "中央预算内投资")
    private BigDecimal projectCenterInvestment;

    @ApiModelProperty(value = "地方预算内投资")
    private BigDecimal projectPartInvestment;

    @ApiModelProperty(value = "银行贷款")
    private BigDecimal bankCredit;

    @ApiModelProperty(value = "企业自筹")
    private BigDecimal enterpriseSelfFinance;

}
