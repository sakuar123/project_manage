package com.sakura.project_manage.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2023/03/25
* @author 李七夜 
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="资金类项目表")
@Table(name = "fund_project")
public class FundProject implements Serializable {
    @Id
    @ApiModelProperty(value="主键id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty(value="项目状态")
    private Integer projectFundStatus;

    @ApiModelProperty(value="所属项目公告")
    private Integer projectPublishId;

    @ApiModelProperty(value="项目名称")
    private String projectName;

    @ApiModelProperty(value="申报时间")
    private Date reportTime;

    @ApiModelProperty(value="项目主体")
    private String projectBody;

    @ApiModelProperty(value="项目建设性质")
    private String projectBuildProperties;

    @ApiModelProperty(value="项目建设主体")
    private String projectBuildContent;

    @ApiModelProperty(value="项目建设地点")
    private String projectBuildAddress;

    @ApiModelProperty(value="项目开工时间")
    private Date projectStartDate;

    @ApiModelProperty(value="项目竣工时间")
    private Date projectEndDate;

    @ApiModelProperty(value="创建者")
    private Integer createUser;

    @ApiModelProperty(value="项目主管部门")
    private Integer departmentId;

    @ApiModelProperty(value="主管科室")
    private Integer sectionId;

    @ApiModelProperty(value="支持方式")
    private Integer sustainId;

    @ApiModelProperty(value="项目级别")
    private Integer projectLevel;

    @ApiModelProperty(value="是否立项")
    private Integer projectApproval;

    @ApiModelProperty(value="备案")
    private String recordPut;

    @ApiModelProperty(value="环评")
    private String projectEia;

    @ApiModelProperty(value="能评")
    private String projectGmp;

    @ApiModelProperty(value="土地")
    private String projectLand;

    @ApiModelProperty(value="规划")
    private String projectPlan;

    @ApiModelProperty(value="其他")
    private String projectOther;

    @ApiModelProperty(value="附件")
    private String projectAppendix;

    @ApiModelProperty(value="创建时间")
    private Date createDate;

    private static final long serialVersionUID = 1L;

    public enum Column {
        id("id", "id", "INTEGER", false),
        projectFundStatus("project_fund_status", "projectFundStatus", "INTEGER", false),
        projectPublishId("project_publish_id", "projectPublishId", "INTEGER", false),
        projectName("project_name", "projectName", "VARCHAR", false),
        reportTime("report_time", "reportTime", "TIMESTAMP", false),
        projectBody("project_body", "projectBody", "VARCHAR", false),
        projectBuildProperties("project_build_properties", "projectBuildProperties", "VARCHAR", false),
        projectBuildContent("project_build_content", "projectBuildContent", "VARCHAR", false),
        projectBuildAddress("project_build_address", "projectBuildAddress", "VARCHAR", false),
        projectStartDate("project_start_date", "projectStartDate", "TIMESTAMP", false),
        projectEndDate("project_end_date", "projectEndDate", "TIMESTAMP", false),
        createUser("create_user", "createUser", "INTEGER", false),
        departmentId("department_id", "departmentId", "INTEGER", false),
        sectionId("section_id", "sectionId", "INTEGER", false),
        sustainId("sustain_id", "sustainId", "INTEGER", false),
        projectLevel("project_level", "projectLevel", "INTEGER", false),
        projectApproval("project_approval", "projectApproval", "INTEGER", false),
        recordPut("record_put", "recordPut", "VARCHAR", false),
        projectEia("project_eia", "projectEia", "VARCHAR", false),
        projectGmp("project_gmp", "projectGmp", "VARCHAR", false),
        projectLand("project_land", "projectLand", "VARCHAR", false),
        projectPlan("project_plan", "projectPlan", "VARCHAR", false),
        projectOther("project_other", "projectOther", "VARCHAR", false),
        projectAppendix("project_appendix", "projectAppendix", "VARCHAR", false),
        createDate("create_date", "createDate", "TIMESTAMP", false);

        private static final String BEGINNING_DELIMITER = "\"";

        private static final String ENDING_DELIMITER = "\"";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public static Column[] all() {
            return Column.values();
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}