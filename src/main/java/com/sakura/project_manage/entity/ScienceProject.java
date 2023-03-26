package com.sakura.project_manage.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Mybatis Generator on 2023/03/26
 * @author 李七夜
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "科技类项目")
@Table(name = "science_project")
public class ScienceProject implements Serializable {

    @Id
    @ApiModelProperty(value = "主键id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ApiModelProperty(value = "创建者")
    private Integer createUser;

    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    private static final long serialVersionUID = 1L;

    public enum Column {
        id("id", "id", "INTEGER", false),
        projectPublishId("project_publish_id", "projectPublishId", "INTEGER", false),
        projectStatus("project_status", "projectStatus", "INTEGER", false),
        projectName("project_name", "projectName", "VARCHAR", false),
        projectCourse("project_course", "projectCourse", "VARCHAR", false),
        projectSpecialized("project_specialized", "projectSpecialized", "VARCHAR", false),
        budgetFunds("budget_funds", "budgetFunds", "DECIMAL", false),
        projectStartDate("project_start_date", "projectStartDate", "TIMESTAMP", false),
        projectEndDate("project_end_date", "projectEndDate", "TIMESTAMP", false),
        expectedResults("expected_results", "expectedResults", "VARCHAR", false),
        hostUnit("host_unit", "hostUnit", "VARCHAR", false),
        unitType("unit_type", "unitType", "VARCHAR", false),
        personCharge("person_charge", "personCharge", "VARCHAR", false),
        personChargePhone("person_charge_phone", "personChargePhone", "VARCHAR", false),
        personChargeIdentity("person_charge_identity", "personChargeIdentity", "VARCHAR", false),
        personChargeWork("person_charge_work", "personChargeWork", "VARCHAR", false),
        createUser("create_user", "createUser", "INTEGER", false),
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

        public static Column[] excludes(Column... excludes) {
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
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER)
                        .toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}