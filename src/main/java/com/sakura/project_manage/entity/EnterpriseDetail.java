package com.sakura.project_manage.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sakura.project_manage.common.utils.DateUtils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Mybatis Generator on 2023/03/11
 * @author 李七夜
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "企业信息表")
@Table(name = "enterprise_detail")
public class EnterpriseDetail implements Serializable {

    @Id
    @ApiModelProperty(value = "主键id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty(value = "企业名称")
    private String enterpriseName;

    @ApiModelProperty(value = "企业法人")
    private String enterpriseCorporate;

    @ApiModelProperty(value = "企业性质")
    private String enterpriseProperties;

    @ApiModelProperty(value = "企业负责人名称")
    private String enterpriseDirector;

    @ApiModelProperty(value = "企业负责人联系电话")
    private String enterpriseDirectorPhone;

    @ApiModelProperty(value = "开户银行")
    private String enterpriseBank;

    @ApiModelProperty(value = "开户银行账号")
    private String enterpriseBankAccount;

    @ApiModelProperty(value = "股权结构")
    private String enterpriseShareholder;

    @ApiModelProperty(value = "经营范围")
    private String scopeBusiness;

    @ApiModelProperty(value = "纳税人识别号")
    private String taxpayerNo;

    @ApiModelProperty(value = "社会信用代码证")
    private String taxpayerImage;

    @ApiModelProperty(value = "企业简介")
    private String enterpriseDesc;

    @ApiModelProperty(value = "注册时间")
    @JsonFormat(pattern = DateUtils.DAY_DATE_PATTERN)
    @DateTimeFormat(pattern = DateUtils.DAY_DATE_PATTERN)
    private Date logonTime;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = DateUtils.SECOND_DATE_PATTERN)
    private Date createDate;

    private static final long serialVersionUID = 1L;

    public enum Column {
        id("id", "id", "INTEGER", false),
        enterpriseName("enterprise_name", "enterpriseName", "VARCHAR", false),
        enterpriseCorporate("enterprise_corporate", "enterpriseCorporate", "VARCHAR", false),
        enterpriseProperties("enterprise_properties", "enterpriseProperties", "VARCHAR", false),
        enterpriseDirector("enterprise_director", "enterpriseDirector", "VARCHAR", false),
        enterpriseDirectorPhone("enterprise_director_phone", "enterpriseDirectorPhone", "VARCHAR", false),
        enterpriseBank("enterprise_bank", "enterpriseBank", "VARCHAR", false),
        enterpriseBankAccount("enterprise_bank_account", "enterpriseBankAccount", "VARCHAR", false),
        enterpriseShareholder("enterprise_shareholder", "enterpriseShareholder", "VARCHAR", false),
        scopeBusiness("scope_business", "scopeBusiness", "VARCHAR", false),
        taxpayerNo("taxpayer_no", "taxpayerNo", "VARCHAR", false),
        taxpayerImage("taxpayer_image", "taxpayerImage", "VARCHAR", false),
        enterpriseDesc("enterprise_desc", "enterpriseDesc", "VARCHAR", false),
        logonTime("logon_time", "logonTime", "TIMESTAMP", false),
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