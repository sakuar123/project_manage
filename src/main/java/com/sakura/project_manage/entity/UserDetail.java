package com.sakura.project_manage.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sakura.project_manage.common.utils.DateUtils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Mybatis Generator on 2023/03/05
 * @author 李七夜
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "用户信息表")
@Table(name = "user_detail")
public class UserDetail implements Serializable {

    @Id
    @ApiModelProperty(value = "主键id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty(value = "用户名称")
    private String userName;

    @ApiModelProperty(value = "用户账户")
    private String userAccount;

    @ApiModelProperty(value = "登录密码")
    private String userPassword;

    @ApiModelProperty(value = "登录密码盐")
    private String userPasswordSalt;

    @ApiModelProperty(value = "性别")
    private Integer gender;

    @ApiModelProperty(value = "所属公司")
    private Integer userCompany;

    @ApiModelProperty(value = "所属角色")
    private Integer userRole;

    @ApiModelProperty(value = "账户状态(0:启用,1:禁用)")
    private Integer userState;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = DateUtils.SECOND_DATE_PATTERN)
    private Date createDate;

    private static final long serialVersionUID = 1L;

    public enum Column {
        id("id", "id", "INTEGER", false),
        userName("user_name", "userName", "VARCHAR", false),
        userAccount("user_account", "userAccount", "VARCHAR", false),
        userPassword("user_password", "userPassword", "VARCHAR", false),
        userPasswordSalt("user_password_salt", "userPasswordSalt", "VARCHAR", false),
        gender("gender", "gender", "INTEGER", false),
        userCompany("user_company", "userCompany", "INTEGER", false),
        userRole("user_role", "userRole", "INTEGER", false),
        userState("user_state", "userState", "INTEGER", false),
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