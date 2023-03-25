package com.sakura.project_manage.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
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
@ApiModel(value="资金类项目详细表")
@Table(name = "fund_project_detail")
public class FundProjectDetail implements Serializable {
    @Id
    @ApiModelProperty(value="主键id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty(value="资金类项目id")
    private Integer projectFundId;

    @ApiModelProperty(value="拟申请资金额度")
    private BigDecimal projectFundQuota;

    @ApiModelProperty(value="项目总投资")
    private BigDecimal projectTotalInvestment;

    @ApiModelProperty(value="中央预算内投资")
    private BigDecimal projectCenterInvestment;

    @ApiModelProperty(value="地方预算内投资")
    private BigDecimal projectPartInvestment;

    @ApiModelProperty(value="银行贷款")
    private BigDecimal bankCredit;

    @ApiModelProperty(value="企业自筹")
    private BigDecimal enterpriseSelfFinance;

    @ApiModelProperty(value="创建时间")
    private Date createDate;

    private static final long serialVersionUID = 1L;

    public enum Column {
        id("id", "id", "INTEGER", false),
        projectFundId("project_fund_id", "projectFundId", "INTEGER", false),
        projectFundQuota("project_fund_quota", "projectFundQuota", "DECIMAL", false),
        projectTotalInvestment("project_total_investment", "projectTotalInvestment", "DECIMAL", false),
        projectCenterInvestment("project_center_investment", "projectCenterInvestment", "DECIMAL", false),
        projectPartInvestment("project_part_investment", "projectPartInvestment", "DECIMAL", false),
        bankCredit("bank_credit", "bankCredit", "DECIMAL", false),
        enterpriseSelfFinance("enterprise_self_finance", "enterpriseSelfFinance", "DECIMAL", false),
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