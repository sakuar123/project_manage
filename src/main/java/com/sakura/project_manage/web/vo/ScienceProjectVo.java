package com.sakura.project_manage.web.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.sakura.project_manage.entity.ScienceProjectUnits;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/26 19:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScienceProjectVo {

    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "项目公告")
    private Integer projectPublishId;

    @ApiModelProperty(value = "项目状态")
    private Integer projectStatus;

    @ApiModelProperty(value = "项目名称")
    private String projectName;

    @ApiModelProperty(value = "项目所属学科")
    private String projectCourse;

    @ApiModelProperty(value = "项目所属专业")
    private String projectSpecialized;

    @ApiModelProperty(value = "预算经费")
    private BigDecimal budgetFunds;

    @ApiModelProperty(value = "年限（起）")
    private Date projectStartDate;

    @ApiModelProperty(value = "年限（止）")
    private Date projectEndDate;

    @ApiModelProperty(value = "预期成果")
    private String expectedResults;

    @ApiModelProperty(value = "申报主持单位")
    private String hostUnit;

    @ApiModelProperty(value = "申报主持单位")
    private String unitType;

    @ApiModelProperty(value = "负责人姓名")
    private String personCharge;

    @ApiModelProperty(value = "负责人电话")
    private String personChargePhone;

    @ApiModelProperty(value = "身份证号")
    private String personChargeIdentity;

    @ApiModelProperty(value = "工作单位")
    private String personChargeWork;

    private List<ScienceProjectUnits> scienceProjectUnits;

}
