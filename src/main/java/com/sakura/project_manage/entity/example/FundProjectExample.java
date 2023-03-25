package com.sakura.project_manage.entity.example;

import com.sakura.project_manage.entity.FundProject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FundProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FundProjectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public FundProjectExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public FundProjectExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static Criteria newAndCreateCriteria() {
        FundProjectExample example = new FundProjectExample();
        return example.createCriteria();
    }

    public FundProjectExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public FundProjectExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusIsNull() {
            addCriterion("project_fund_status is null");
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusIsNotNull() {
            addCriterion("project_fund_status is not null");
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusEqualTo(Integer value) {
            addCriterion("project_fund_status =", value, "projectFundStatus");
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_fund_status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusNotEqualTo(Integer value) {
            addCriterion("project_fund_status <>", value, "projectFundStatus");
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_fund_status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusGreaterThan(Integer value) {
            addCriterion("project_fund_status >", value, "projectFundStatus");
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_fund_status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_fund_status >=", value, "projectFundStatus");
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_fund_status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusLessThan(Integer value) {
            addCriterion("project_fund_status <", value, "projectFundStatus");
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_fund_status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusLessThanOrEqualTo(Integer value) {
            addCriterion("project_fund_status <=", value, "projectFundStatus");
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_fund_status <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusIn(List<Integer> values) {
            addCriterion("project_fund_status in", values, "projectFundStatus");
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusNotIn(List<Integer> values) {
            addCriterion("project_fund_status not in", values, "projectFundStatus");
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusBetween(Integer value1, Integer value2) {
            addCriterion("project_fund_status between", value1, value2, "projectFundStatus");
            return (Criteria) this;
        }

        public Criteria andProjectFundStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("project_fund_status not between", value1, value2, "projectFundStatus");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdIsNull() {
            addCriterion("project_publish_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdIsNotNull() {
            addCriterion("project_publish_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdEqualTo(Integer value) {
            addCriterion("project_publish_id =", value, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_publish_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdNotEqualTo(Integer value) {
            addCriterion("project_publish_id <>", value, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_publish_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdGreaterThan(Integer value) {
            addCriterion("project_publish_id >", value, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_publish_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_publish_id >=", value, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_publish_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdLessThan(Integer value) {
            addCriterion("project_publish_id <", value, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_publish_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_publish_id <=", value, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_publish_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdIn(List<Integer> values) {
            addCriterion("project_publish_id in", values, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdNotIn(List<Integer> values) {
            addCriterion("project_publish_id not in", values, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdBetween(Integer value1, Integer value2) {
            addCriterion("project_publish_id between", value1, value2, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_publish_id not between", value1, value2, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNull() {
            addCriterion("report_time is null");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNotNull() {
            addCriterion("report_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualTo(Date value) {
            addCriterion("report_time =", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("report_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(Date value) {
            addCriterion("report_time <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("report_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(Date value) {
            addCriterion("report_time >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("report_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("report_time >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("report_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(Date value) {
            addCriterion("report_time <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("report_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(Date value) {
            addCriterion("report_time <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("report_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportTimeIn(List<Date> values) {
            addCriterion("report_time in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotIn(List<Date> values) {
            addCriterion("report_time not in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeBetween(Date value1, Date value2) {
            addCriterion("report_time between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotBetween(Date value1, Date value2) {
            addCriterion("report_time not between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andProjectBodyIsNull() {
            addCriterion("project_body is null");
            return (Criteria) this;
        }

        public Criteria andProjectBodyIsNotNull() {
            addCriterion("project_body is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBodyEqualTo(String value) {
            addCriterion("project_body =", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_body = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyNotEqualTo(String value) {
            addCriterion("project_body <>", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_body <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyGreaterThan(String value) {
            addCriterion("project_body >", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_body > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyGreaterThanOrEqualTo(String value) {
            addCriterion("project_body >=", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_body >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyLessThan(String value) {
            addCriterion("project_body <", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_body < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyLessThanOrEqualTo(String value) {
            addCriterion("project_body <=", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_body <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyLike(String value) {
            addCriterion("project_body like", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyNotLike(String value) {
            addCriterion("project_body not like", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyIn(List<String> values) {
            addCriterion("project_body in", values, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyNotIn(List<String> values) {
            addCriterion("project_body not in", values, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyBetween(String value1, String value2) {
            addCriterion("project_body between", value1, value2, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyNotBetween(String value1, String value2) {
            addCriterion("project_body not between", value1, value2, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesIsNull() {
            addCriterion("project_build_properties is null");
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesIsNotNull() {
            addCriterion("project_build_properties is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesEqualTo(String value) {
            addCriterion("project_build_properties =", value, "projectBuildProperties");
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_properties = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesNotEqualTo(String value) {
            addCriterion("project_build_properties <>", value, "projectBuildProperties");
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_properties <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesGreaterThan(String value) {
            addCriterion("project_build_properties >", value, "projectBuildProperties");
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_properties > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("project_build_properties >=", value, "projectBuildProperties");
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_properties >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesLessThan(String value) {
            addCriterion("project_build_properties <", value, "projectBuildProperties");
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_properties < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesLessThanOrEqualTo(String value) {
            addCriterion("project_build_properties <=", value, "projectBuildProperties");
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_properties <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesLike(String value) {
            addCriterion("project_build_properties like", value, "projectBuildProperties");
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesNotLike(String value) {
            addCriterion("project_build_properties not like", value, "projectBuildProperties");
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesIn(List<String> values) {
            addCriterion("project_build_properties in", values, "projectBuildProperties");
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesNotIn(List<String> values) {
            addCriterion("project_build_properties not in", values, "projectBuildProperties");
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesBetween(String value1, String value2) {
            addCriterion("project_build_properties between", value1, value2, "projectBuildProperties");
            return (Criteria) this;
        }

        public Criteria andProjectBuildPropertiesNotBetween(String value1, String value2) {
            addCriterion("project_build_properties not between", value1, value2, "projectBuildProperties");
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentIsNull() {
            addCriterion("project_build_content is null");
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentIsNotNull() {
            addCriterion("project_build_content is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentEqualTo(String value) {
            addCriterion("project_build_content =", value, "projectBuildContent");
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_content = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentNotEqualTo(String value) {
            addCriterion("project_build_content <>", value, "projectBuildContent");
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_content <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentGreaterThan(String value) {
            addCriterion("project_build_content >", value, "projectBuildContent");
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_content > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentGreaterThanOrEqualTo(String value) {
            addCriterion("project_build_content >=", value, "projectBuildContent");
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_content >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentLessThan(String value) {
            addCriterion("project_build_content <", value, "projectBuildContent");
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_content < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentLessThanOrEqualTo(String value) {
            addCriterion("project_build_content <=", value, "projectBuildContent");
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_content <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentLike(String value) {
            addCriterion("project_build_content like", value, "projectBuildContent");
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentNotLike(String value) {
            addCriterion("project_build_content not like", value, "projectBuildContent");
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentIn(List<String> values) {
            addCriterion("project_build_content in", values, "projectBuildContent");
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentNotIn(List<String> values) {
            addCriterion("project_build_content not in", values, "projectBuildContent");
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentBetween(String value1, String value2) {
            addCriterion("project_build_content between", value1, value2, "projectBuildContent");
            return (Criteria) this;
        }

        public Criteria andProjectBuildContentNotBetween(String value1, String value2) {
            addCriterion("project_build_content not between", value1, value2, "projectBuildContent");
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressIsNull() {
            addCriterion("project_build_address is null");
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressIsNotNull() {
            addCriterion("project_build_address is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressEqualTo(String value) {
            addCriterion("project_build_address =", value, "projectBuildAddress");
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_address = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressNotEqualTo(String value) {
            addCriterion("project_build_address <>", value, "projectBuildAddress");
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_address <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressGreaterThan(String value) {
            addCriterion("project_build_address >", value, "projectBuildAddress");
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_address > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressGreaterThanOrEqualTo(String value) {
            addCriterion("project_build_address >=", value, "projectBuildAddress");
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_address >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressLessThan(String value) {
            addCriterion("project_build_address <", value, "projectBuildAddress");
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_address < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressLessThanOrEqualTo(String value) {
            addCriterion("project_build_address <=", value, "projectBuildAddress");
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_build_address <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressLike(String value) {
            addCriterion("project_build_address like", value, "projectBuildAddress");
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressNotLike(String value) {
            addCriterion("project_build_address not like", value, "projectBuildAddress");
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressIn(List<String> values) {
            addCriterion("project_build_address in", values, "projectBuildAddress");
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressNotIn(List<String> values) {
            addCriterion("project_build_address not in", values, "projectBuildAddress");
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressBetween(String value1, String value2) {
            addCriterion("project_build_address between", value1, value2, "projectBuildAddress");
            return (Criteria) this;
        }

        public Criteria andProjectBuildAddressNotBetween(String value1, String value2) {
            addCriterion("project_build_address not between", value1, value2, "projectBuildAddress");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateIsNull() {
            addCriterion("project_start_date is null");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateIsNotNull() {
            addCriterion("project_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateEqualTo(Date value) {
            addCriterion("project_start_date =", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_start_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStartDateNotEqualTo(Date value) {
            addCriterion("project_start_date <>", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_start_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStartDateGreaterThan(Date value) {
            addCriterion("project_start_date >", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_start_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("project_start_date >=", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_start_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStartDateLessThan(Date value) {
            addCriterion("project_start_date <", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_start_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStartDateLessThanOrEqualTo(Date value) {
            addCriterion("project_start_date <=", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_start_date <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStartDateIn(List<Date> values) {
            addCriterion("project_start_date in", values, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateNotIn(List<Date> values) {
            addCriterion("project_start_date not in", values, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateBetween(Date value1, Date value2) {
            addCriterion("project_start_date between", value1, value2, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateNotBetween(Date value1, Date value2) {
            addCriterion("project_start_date not between", value1, value2, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateIsNull() {
            addCriterion("project_end_date is null");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateIsNotNull() {
            addCriterion("project_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateEqualTo(Date value) {
            addCriterion("project_end_date =", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_end_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEndDateNotEqualTo(Date value) {
            addCriterion("project_end_date <>", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_end_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEndDateGreaterThan(Date value) {
            addCriterion("project_end_date >", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_end_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("project_end_date >=", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_end_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEndDateLessThan(Date value) {
            addCriterion("project_end_date <", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_end_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEndDateLessThanOrEqualTo(Date value) {
            addCriterion("project_end_date <=", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_end_date <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEndDateIn(List<Date> values) {
            addCriterion("project_end_date in", values, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateNotIn(List<Date> values) {
            addCriterion("project_end_date not in", values, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateBetween(Date value1, Date value2) {
            addCriterion("project_end_date between", value1, value2, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateNotBetween(Date value1, Date value2) {
            addCriterion("project_end_date not between", value1, value2, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Integer value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("create_user = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Integer value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("create_user <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Integer value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("create_user > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("create_user >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Integer value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("create_user < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("create_user <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Integer> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Integer> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Integer value1, Integer value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("department_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("department_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("department_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("department_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("department_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("department_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andSectionIdIsNull() {
            addCriterion("section_id is null");
            return (Criteria) this;
        }

        public Criteria andSectionIdIsNotNull() {
            addCriterion("section_id is not null");
            return (Criteria) this;
        }

        public Criteria andSectionIdEqualTo(Integer value) {
            addCriterion("section_id =", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("section_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSectionIdNotEqualTo(Integer value) {
            addCriterion("section_id <>", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("section_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThan(Integer value) {
            addCriterion("section_id >", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("section_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("section_id >=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("section_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThan(Integer value) {
            addCriterion("section_id <", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("section_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("section_id <=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("section_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSectionIdIn(List<Integer> values) {
            addCriterion("section_id in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotIn(List<Integer> values) {
            addCriterion("section_id not in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdBetween(Integer value1, Integer value2) {
            addCriterion("section_id between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("section_id not between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSustainIdIsNull() {
            addCriterion("sustain_id is null");
            return (Criteria) this;
        }

        public Criteria andSustainIdIsNotNull() {
            addCriterion("sustain_id is not null");
            return (Criteria) this;
        }

        public Criteria andSustainIdEqualTo(Integer value) {
            addCriterion("sustain_id =", value, "sustainId");
            return (Criteria) this;
        }

        public Criteria andSustainIdEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("sustain_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainIdNotEqualTo(Integer value) {
            addCriterion("sustain_id <>", value, "sustainId");
            return (Criteria) this;
        }

        public Criteria andSustainIdNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("sustain_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainIdGreaterThan(Integer value) {
            addCriterion("sustain_id >", value, "sustainId");
            return (Criteria) this;
        }

        public Criteria andSustainIdGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("sustain_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sustain_id >=", value, "sustainId");
            return (Criteria) this;
        }

        public Criteria andSustainIdGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("sustain_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainIdLessThan(Integer value) {
            addCriterion("sustain_id <", value, "sustainId");
            return (Criteria) this;
        }

        public Criteria andSustainIdLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("sustain_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainIdLessThanOrEqualTo(Integer value) {
            addCriterion("sustain_id <=", value, "sustainId");
            return (Criteria) this;
        }

        public Criteria andSustainIdLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("sustain_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainIdIn(List<Integer> values) {
            addCriterion("sustain_id in", values, "sustainId");
            return (Criteria) this;
        }

        public Criteria andSustainIdNotIn(List<Integer> values) {
            addCriterion("sustain_id not in", values, "sustainId");
            return (Criteria) this;
        }

        public Criteria andSustainIdBetween(Integer value1, Integer value2) {
            addCriterion("sustain_id between", value1, value2, "sustainId");
            return (Criteria) this;
        }

        public Criteria andSustainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sustain_id not between", value1, value2, "sustainId");
            return (Criteria) this;
        }

        public Criteria andProjectLevelIsNull() {
            addCriterion("project_level is null");
            return (Criteria) this;
        }

        public Criteria andProjectLevelIsNotNull() {
            addCriterion("project_level is not null");
            return (Criteria) this;
        }

        public Criteria andProjectLevelEqualTo(Integer value) {
            addCriterion("project_level =", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_level = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLevelNotEqualTo(Integer value) {
            addCriterion("project_level <>", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_level <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLevelGreaterThan(Integer value) {
            addCriterion("project_level >", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_level > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_level >=", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_level >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLevelLessThan(Integer value) {
            addCriterion("project_level <", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_level < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLevelLessThanOrEqualTo(Integer value) {
            addCriterion("project_level <=", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_level <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLevelIn(List<Integer> values) {
            addCriterion("project_level in", values, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelNotIn(List<Integer> values) {
            addCriterion("project_level not in", values, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelBetween(Integer value1, Integer value2) {
            addCriterion("project_level between", value1, value2, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("project_level not between", value1, value2, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectApprovalIsNull() {
            addCriterion("project_approval is null");
            return (Criteria) this;
        }

        public Criteria andProjectApprovalIsNotNull() {
            addCriterion("project_approval is not null");
            return (Criteria) this;
        }

        public Criteria andProjectApprovalEqualTo(Integer value) {
            addCriterion("project_approval =", value, "projectApproval");
            return (Criteria) this;
        }

        public Criteria andProjectApprovalEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_approval = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectApprovalNotEqualTo(Integer value) {
            addCriterion("project_approval <>", value, "projectApproval");
            return (Criteria) this;
        }

        public Criteria andProjectApprovalNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_approval <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectApprovalGreaterThan(Integer value) {
            addCriterion("project_approval >", value, "projectApproval");
            return (Criteria) this;
        }

        public Criteria andProjectApprovalGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_approval > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectApprovalGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_approval >=", value, "projectApproval");
            return (Criteria) this;
        }

        public Criteria andProjectApprovalGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_approval >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectApprovalLessThan(Integer value) {
            addCriterion("project_approval <", value, "projectApproval");
            return (Criteria) this;
        }

        public Criteria andProjectApprovalLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_approval < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectApprovalLessThanOrEqualTo(Integer value) {
            addCriterion("project_approval <=", value, "projectApproval");
            return (Criteria) this;
        }

        public Criteria andProjectApprovalLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_approval <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectApprovalIn(List<Integer> values) {
            addCriterion("project_approval in", values, "projectApproval");
            return (Criteria) this;
        }

        public Criteria andProjectApprovalNotIn(List<Integer> values) {
            addCriterion("project_approval not in", values, "projectApproval");
            return (Criteria) this;
        }

        public Criteria andProjectApprovalBetween(Integer value1, Integer value2) {
            addCriterion("project_approval between", value1, value2, "projectApproval");
            return (Criteria) this;
        }

        public Criteria andProjectApprovalNotBetween(Integer value1, Integer value2) {
            addCriterion("project_approval not between", value1, value2, "projectApproval");
            return (Criteria) this;
        }

        public Criteria andRecordPutIsNull() {
            addCriterion("record_put is null");
            return (Criteria) this;
        }

        public Criteria andRecordPutIsNotNull() {
            addCriterion("record_put is not null");
            return (Criteria) this;
        }

        public Criteria andRecordPutEqualTo(String value) {
            addCriterion("record_put =", value, "recordPut");
            return (Criteria) this;
        }

        public Criteria andRecordPutEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("record_put = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecordPutNotEqualTo(String value) {
            addCriterion("record_put <>", value, "recordPut");
            return (Criteria) this;
        }

        public Criteria andRecordPutNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("record_put <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecordPutGreaterThan(String value) {
            addCriterion("record_put >", value, "recordPut");
            return (Criteria) this;
        }

        public Criteria andRecordPutGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("record_put > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecordPutGreaterThanOrEqualTo(String value) {
            addCriterion("record_put >=", value, "recordPut");
            return (Criteria) this;
        }

        public Criteria andRecordPutGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("record_put >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecordPutLessThan(String value) {
            addCriterion("record_put <", value, "recordPut");
            return (Criteria) this;
        }

        public Criteria andRecordPutLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("record_put < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecordPutLessThanOrEqualTo(String value) {
            addCriterion("record_put <=", value, "recordPut");
            return (Criteria) this;
        }

        public Criteria andRecordPutLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("record_put <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecordPutLike(String value) {
            addCriterion("record_put like", value, "recordPut");
            return (Criteria) this;
        }

        public Criteria andRecordPutNotLike(String value) {
            addCriterion("record_put not like", value, "recordPut");
            return (Criteria) this;
        }

        public Criteria andRecordPutIn(List<String> values) {
            addCriterion("record_put in", values, "recordPut");
            return (Criteria) this;
        }

        public Criteria andRecordPutNotIn(List<String> values) {
            addCriterion("record_put not in", values, "recordPut");
            return (Criteria) this;
        }

        public Criteria andRecordPutBetween(String value1, String value2) {
            addCriterion("record_put between", value1, value2, "recordPut");
            return (Criteria) this;
        }

        public Criteria andRecordPutNotBetween(String value1, String value2) {
            addCriterion("record_put not between", value1, value2, "recordPut");
            return (Criteria) this;
        }

        public Criteria andProjectEiaIsNull() {
            addCriterion("project_eia is null");
            return (Criteria) this;
        }

        public Criteria andProjectEiaIsNotNull() {
            addCriterion("project_eia is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEiaEqualTo(String value) {
            addCriterion("project_eia =", value, "projectEia");
            return (Criteria) this;
        }

        public Criteria andProjectEiaEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_eia = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEiaNotEqualTo(String value) {
            addCriterion("project_eia <>", value, "projectEia");
            return (Criteria) this;
        }

        public Criteria andProjectEiaNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_eia <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEiaGreaterThan(String value) {
            addCriterion("project_eia >", value, "projectEia");
            return (Criteria) this;
        }

        public Criteria andProjectEiaGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_eia > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEiaGreaterThanOrEqualTo(String value) {
            addCriterion("project_eia >=", value, "projectEia");
            return (Criteria) this;
        }

        public Criteria andProjectEiaGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_eia >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEiaLessThan(String value) {
            addCriterion("project_eia <", value, "projectEia");
            return (Criteria) this;
        }

        public Criteria andProjectEiaLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_eia < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEiaLessThanOrEqualTo(String value) {
            addCriterion("project_eia <=", value, "projectEia");
            return (Criteria) this;
        }

        public Criteria andProjectEiaLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_eia <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEiaLike(String value) {
            addCriterion("project_eia like", value, "projectEia");
            return (Criteria) this;
        }

        public Criteria andProjectEiaNotLike(String value) {
            addCriterion("project_eia not like", value, "projectEia");
            return (Criteria) this;
        }

        public Criteria andProjectEiaIn(List<String> values) {
            addCriterion("project_eia in", values, "projectEia");
            return (Criteria) this;
        }

        public Criteria andProjectEiaNotIn(List<String> values) {
            addCriterion("project_eia not in", values, "projectEia");
            return (Criteria) this;
        }

        public Criteria andProjectEiaBetween(String value1, String value2) {
            addCriterion("project_eia between", value1, value2, "projectEia");
            return (Criteria) this;
        }

        public Criteria andProjectEiaNotBetween(String value1, String value2) {
            addCriterion("project_eia not between", value1, value2, "projectEia");
            return (Criteria) this;
        }

        public Criteria andProjectGmpIsNull() {
            addCriterion("project_gmp is null");
            return (Criteria) this;
        }

        public Criteria andProjectGmpIsNotNull() {
            addCriterion("project_gmp is not null");
            return (Criteria) this;
        }

        public Criteria andProjectGmpEqualTo(String value) {
            addCriterion("project_gmp =", value, "projectGmp");
            return (Criteria) this;
        }

        public Criteria andProjectGmpEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_gmp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectGmpNotEqualTo(String value) {
            addCriterion("project_gmp <>", value, "projectGmp");
            return (Criteria) this;
        }

        public Criteria andProjectGmpNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_gmp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectGmpGreaterThan(String value) {
            addCriterion("project_gmp >", value, "projectGmp");
            return (Criteria) this;
        }

        public Criteria andProjectGmpGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_gmp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectGmpGreaterThanOrEqualTo(String value) {
            addCriterion("project_gmp >=", value, "projectGmp");
            return (Criteria) this;
        }

        public Criteria andProjectGmpGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_gmp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectGmpLessThan(String value) {
            addCriterion("project_gmp <", value, "projectGmp");
            return (Criteria) this;
        }

        public Criteria andProjectGmpLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_gmp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectGmpLessThanOrEqualTo(String value) {
            addCriterion("project_gmp <=", value, "projectGmp");
            return (Criteria) this;
        }

        public Criteria andProjectGmpLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_gmp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectGmpLike(String value) {
            addCriterion("project_gmp like", value, "projectGmp");
            return (Criteria) this;
        }

        public Criteria andProjectGmpNotLike(String value) {
            addCriterion("project_gmp not like", value, "projectGmp");
            return (Criteria) this;
        }

        public Criteria andProjectGmpIn(List<String> values) {
            addCriterion("project_gmp in", values, "projectGmp");
            return (Criteria) this;
        }

        public Criteria andProjectGmpNotIn(List<String> values) {
            addCriterion("project_gmp not in", values, "projectGmp");
            return (Criteria) this;
        }

        public Criteria andProjectGmpBetween(String value1, String value2) {
            addCriterion("project_gmp between", value1, value2, "projectGmp");
            return (Criteria) this;
        }

        public Criteria andProjectGmpNotBetween(String value1, String value2) {
            addCriterion("project_gmp not between", value1, value2, "projectGmp");
            return (Criteria) this;
        }

        public Criteria andProjectLandIsNull() {
            addCriterion("project_land is null");
            return (Criteria) this;
        }

        public Criteria andProjectLandIsNotNull() {
            addCriterion("project_land is not null");
            return (Criteria) this;
        }

        public Criteria andProjectLandEqualTo(String value) {
            addCriterion("project_land =", value, "projectLand");
            return (Criteria) this;
        }

        public Criteria andProjectLandEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_land = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLandNotEqualTo(String value) {
            addCriterion("project_land <>", value, "projectLand");
            return (Criteria) this;
        }

        public Criteria andProjectLandNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_land <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLandGreaterThan(String value) {
            addCriterion("project_land >", value, "projectLand");
            return (Criteria) this;
        }

        public Criteria andProjectLandGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_land > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLandGreaterThanOrEqualTo(String value) {
            addCriterion("project_land >=", value, "projectLand");
            return (Criteria) this;
        }

        public Criteria andProjectLandGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_land >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLandLessThan(String value) {
            addCriterion("project_land <", value, "projectLand");
            return (Criteria) this;
        }

        public Criteria andProjectLandLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_land < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLandLessThanOrEqualTo(String value) {
            addCriterion("project_land <=", value, "projectLand");
            return (Criteria) this;
        }

        public Criteria andProjectLandLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_land <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLandLike(String value) {
            addCriterion("project_land like", value, "projectLand");
            return (Criteria) this;
        }

        public Criteria andProjectLandNotLike(String value) {
            addCriterion("project_land not like", value, "projectLand");
            return (Criteria) this;
        }

        public Criteria andProjectLandIn(List<String> values) {
            addCriterion("project_land in", values, "projectLand");
            return (Criteria) this;
        }

        public Criteria andProjectLandNotIn(List<String> values) {
            addCriterion("project_land not in", values, "projectLand");
            return (Criteria) this;
        }

        public Criteria andProjectLandBetween(String value1, String value2) {
            addCriterion("project_land between", value1, value2, "projectLand");
            return (Criteria) this;
        }

        public Criteria andProjectLandNotBetween(String value1, String value2) {
            addCriterion("project_land not between", value1, value2, "projectLand");
            return (Criteria) this;
        }

        public Criteria andProjectPlanIsNull() {
            addCriterion("project_plan is null");
            return (Criteria) this;
        }

        public Criteria andProjectPlanIsNotNull() {
            addCriterion("project_plan is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPlanEqualTo(String value) {
            addCriterion("project_plan =", value, "projectPlan");
            return (Criteria) this;
        }

        public Criteria andProjectPlanEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_plan = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPlanNotEqualTo(String value) {
            addCriterion("project_plan <>", value, "projectPlan");
            return (Criteria) this;
        }

        public Criteria andProjectPlanNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_plan <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPlanGreaterThan(String value) {
            addCriterion("project_plan >", value, "projectPlan");
            return (Criteria) this;
        }

        public Criteria andProjectPlanGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_plan > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPlanGreaterThanOrEqualTo(String value) {
            addCriterion("project_plan >=", value, "projectPlan");
            return (Criteria) this;
        }

        public Criteria andProjectPlanGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_plan >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPlanLessThan(String value) {
            addCriterion("project_plan <", value, "projectPlan");
            return (Criteria) this;
        }

        public Criteria andProjectPlanLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_plan < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPlanLessThanOrEqualTo(String value) {
            addCriterion("project_plan <=", value, "projectPlan");
            return (Criteria) this;
        }

        public Criteria andProjectPlanLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_plan <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPlanLike(String value) {
            addCriterion("project_plan like", value, "projectPlan");
            return (Criteria) this;
        }

        public Criteria andProjectPlanNotLike(String value) {
            addCriterion("project_plan not like", value, "projectPlan");
            return (Criteria) this;
        }

        public Criteria andProjectPlanIn(List<String> values) {
            addCriterion("project_plan in", values, "projectPlan");
            return (Criteria) this;
        }

        public Criteria andProjectPlanNotIn(List<String> values) {
            addCriterion("project_plan not in", values, "projectPlan");
            return (Criteria) this;
        }

        public Criteria andProjectPlanBetween(String value1, String value2) {
            addCriterion("project_plan between", value1, value2, "projectPlan");
            return (Criteria) this;
        }

        public Criteria andProjectPlanNotBetween(String value1, String value2) {
            addCriterion("project_plan not between", value1, value2, "projectPlan");
            return (Criteria) this;
        }

        public Criteria andProjectOtherIsNull() {
            addCriterion("project_other is null");
            return (Criteria) this;
        }

        public Criteria andProjectOtherIsNotNull() {
            addCriterion("project_other is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOtherEqualTo(String value) {
            addCriterion("project_other =", value, "projectOther");
            return (Criteria) this;
        }

        public Criteria andProjectOtherEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_other = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectOtherNotEqualTo(String value) {
            addCriterion("project_other <>", value, "projectOther");
            return (Criteria) this;
        }

        public Criteria andProjectOtherNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_other <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectOtherGreaterThan(String value) {
            addCriterion("project_other >", value, "projectOther");
            return (Criteria) this;
        }

        public Criteria andProjectOtherGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_other > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectOtherGreaterThanOrEqualTo(String value) {
            addCriterion("project_other >=", value, "projectOther");
            return (Criteria) this;
        }

        public Criteria andProjectOtherGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_other >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectOtherLessThan(String value) {
            addCriterion("project_other <", value, "projectOther");
            return (Criteria) this;
        }

        public Criteria andProjectOtherLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_other < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectOtherLessThanOrEqualTo(String value) {
            addCriterion("project_other <=", value, "projectOther");
            return (Criteria) this;
        }

        public Criteria andProjectOtherLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_other <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectOtherLike(String value) {
            addCriterion("project_other like", value, "projectOther");
            return (Criteria) this;
        }

        public Criteria andProjectOtherNotLike(String value) {
            addCriterion("project_other not like", value, "projectOther");
            return (Criteria) this;
        }

        public Criteria andProjectOtherIn(List<String> values) {
            addCriterion("project_other in", values, "projectOther");
            return (Criteria) this;
        }

        public Criteria andProjectOtherNotIn(List<String> values) {
            addCriterion("project_other not in", values, "projectOther");
            return (Criteria) this;
        }

        public Criteria andProjectOtherBetween(String value1, String value2) {
            addCriterion("project_other between", value1, value2, "projectOther");
            return (Criteria) this;
        }

        public Criteria andProjectOtherNotBetween(String value1, String value2) {
            addCriterion("project_other not between", value1, value2, "projectOther");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixIsNull() {
            addCriterion("project_appendix is null");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixIsNotNull() {
            addCriterion("project_appendix is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixEqualTo(String value) {
            addCriterion("project_appendix =", value, "projectAppendix");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_appendix = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAppendixNotEqualTo(String value) {
            addCriterion("project_appendix <>", value, "projectAppendix");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_appendix <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAppendixGreaterThan(String value) {
            addCriterion("project_appendix >", value, "projectAppendix");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_appendix > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAppendixGreaterThanOrEqualTo(String value) {
            addCriterion("project_appendix >=", value, "projectAppendix");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_appendix >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAppendixLessThan(String value) {
            addCriterion("project_appendix <", value, "projectAppendix");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_appendix < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAppendixLessThanOrEqualTo(String value) {
            addCriterion("project_appendix <=", value, "projectAppendix");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("project_appendix <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAppendixLike(String value) {
            addCriterion("project_appendix like", value, "projectAppendix");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixNotLike(String value) {
            addCriterion("project_appendix not like", value, "projectAppendix");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixIn(List<String> values) {
            addCriterion("project_appendix in", values, "projectAppendix");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixNotIn(List<String> values) {
            addCriterion("project_appendix not in", values, "projectAppendix");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixBetween(String value1, String value2) {
            addCriterion("project_appendix between", value1, value2, "projectAppendix");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixNotBetween(String value1, String value2) {
            addCriterion("project_appendix not between", value1, value2, "projectAppendix");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("create_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("create_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("create_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("create_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("create_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualToColumn(FundProject.Column column) {
            addCriterion(new StringBuilder("create_date <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private FundProjectExample example;

        protected Criteria(FundProjectExample example) {
            super();
            this.example = example;
        }

        public FundProjectExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(com.sakura.project_manage.entity.example.FundProjectExample example);
    }
}