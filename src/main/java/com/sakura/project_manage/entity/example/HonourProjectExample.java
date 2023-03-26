package com.sakura.project_manage.entity.example;

import com.sakura.project_manage.entity.HonourProject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HonourProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HonourProjectExample() {
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

    public HonourProjectExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public HonourProjectExample orderBy(String ... orderByClauses) {
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
        HonourProjectExample example = new HonourProjectExample();
        return example.createCriteria();
    }

    public HonourProjectExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public HonourProjectExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(HonourProject.Column column) {
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

        public Criteria andProjectPublishIdEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_publish_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdNotEqualTo(Integer value) {
            addCriterion("project_publish_id <>", value, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdNotEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_publish_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdGreaterThan(Integer value) {
            addCriterion("project_publish_id >", value, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdGreaterThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_publish_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_publish_id >=", value, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdGreaterThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_publish_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdLessThan(Integer value) {
            addCriterion("project_publish_id <", value, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdLessThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_publish_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_publish_id <=", value, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdLessThanOrEqualToColumn(HonourProject.Column column) {
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

        public Criteria andProjectStatusIsNull() {
            addCriterion("project_status is null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNotNull() {
            addCriterion("project_status is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusEqualTo(Integer value) {
            addCriterion("project_status =", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotEqualTo(Integer value) {
            addCriterion("project_status <>", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThan(Integer value) {
            addCriterion("project_status >", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_status >=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThan(Integer value) {
            addCriterion("project_status <", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThanOrEqualTo(Integer value) {
            addCriterion("project_status <=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_status <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStatusIn(List<Integer> values) {
            addCriterion("project_status in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotIn(List<Integer> values) {
            addCriterion("project_status not in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusBetween(Integer value1, Integer value2) {
            addCriterion("project_status between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("project_status not between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andHonourNameIsNull() {
            addCriterion("honour_name is null");
            return (Criteria) this;
        }

        public Criteria andHonourNameIsNotNull() {
            addCriterion("honour_name is not null");
            return (Criteria) this;
        }

        public Criteria andHonourNameEqualTo(String value) {
            addCriterion("honour_name =", value, "honourName");
            return (Criteria) this;
        }

        public Criteria andHonourNameEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("honour_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHonourNameNotEqualTo(String value) {
            addCriterion("honour_name <>", value, "honourName");
            return (Criteria) this;
        }

        public Criteria andHonourNameNotEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("honour_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHonourNameGreaterThan(String value) {
            addCriterion("honour_name >", value, "honourName");
            return (Criteria) this;
        }

        public Criteria andHonourNameGreaterThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("honour_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHonourNameGreaterThanOrEqualTo(String value) {
            addCriterion("honour_name >=", value, "honourName");
            return (Criteria) this;
        }

        public Criteria andHonourNameGreaterThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("honour_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHonourNameLessThan(String value) {
            addCriterion("honour_name <", value, "honourName");
            return (Criteria) this;
        }

        public Criteria andHonourNameLessThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("honour_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHonourNameLessThanOrEqualTo(String value) {
            addCriterion("honour_name <=", value, "honourName");
            return (Criteria) this;
        }

        public Criteria andHonourNameLessThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("honour_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHonourNameLike(String value) {
            addCriterion("honour_name like", value, "honourName");
            return (Criteria) this;
        }

        public Criteria andHonourNameNotLike(String value) {
            addCriterion("honour_name not like", value, "honourName");
            return (Criteria) this;
        }

        public Criteria andHonourNameIn(List<String> values) {
            addCriterion("honour_name in", values, "honourName");
            return (Criteria) this;
        }

        public Criteria andHonourNameNotIn(List<String> values) {
            addCriterion("honour_name not in", values, "honourName");
            return (Criteria) this;
        }

        public Criteria andHonourNameBetween(String value1, String value2) {
            addCriterion("honour_name between", value1, value2, "honourName");
            return (Criteria) this;
        }

        public Criteria andHonourNameNotBetween(String value1, String value2) {
            addCriterion("honour_name not between", value1, value2, "honourName");
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

        public Criteria andProjectNameEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualToColumn(HonourProject.Column column) {
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

        public Criteria andProjectBodyEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_body = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyNotEqualTo(String value) {
            addCriterion("project_body <>", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyNotEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_body <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyGreaterThan(String value) {
            addCriterion("project_body >", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyGreaterThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_body > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyGreaterThanOrEqualTo(String value) {
            addCriterion("project_body >=", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyGreaterThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_body >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyLessThan(String value) {
            addCriterion("project_body <", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyLessThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_body < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyLessThanOrEqualTo(String value) {
            addCriterion("project_body <=", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyLessThanOrEqualToColumn(HonourProject.Column column) {
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

        public Criteria andReportTimeEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("report_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(Date value) {
            addCriterion("report_time <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("report_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(Date value) {
            addCriterion("report_time >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("report_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("report_time >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("report_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(Date value) {
            addCriterion("report_time <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("report_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(Date value) {
            addCriterion("report_time <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualToColumn(HonourProject.Column column) {
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

        public Criteria andReportConditionIsNull() {
            addCriterion("report_condition is null");
            return (Criteria) this;
        }

        public Criteria andReportConditionIsNotNull() {
            addCriterion("report_condition is not null");
            return (Criteria) this;
        }

        public Criteria andReportConditionEqualTo(String value) {
            addCriterion("report_condition =", value, "reportCondition");
            return (Criteria) this;
        }

        public Criteria andReportConditionEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("report_condition = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportConditionNotEqualTo(String value) {
            addCriterion("report_condition <>", value, "reportCondition");
            return (Criteria) this;
        }

        public Criteria andReportConditionNotEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("report_condition <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportConditionGreaterThan(String value) {
            addCriterion("report_condition >", value, "reportCondition");
            return (Criteria) this;
        }

        public Criteria andReportConditionGreaterThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("report_condition > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportConditionGreaterThanOrEqualTo(String value) {
            addCriterion("report_condition >=", value, "reportCondition");
            return (Criteria) this;
        }

        public Criteria andReportConditionGreaterThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("report_condition >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportConditionLessThan(String value) {
            addCriterion("report_condition <", value, "reportCondition");
            return (Criteria) this;
        }

        public Criteria andReportConditionLessThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("report_condition < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportConditionLessThanOrEqualTo(String value) {
            addCriterion("report_condition <=", value, "reportCondition");
            return (Criteria) this;
        }

        public Criteria andReportConditionLessThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("report_condition <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportConditionLike(String value) {
            addCriterion("report_condition like", value, "reportCondition");
            return (Criteria) this;
        }

        public Criteria andReportConditionNotLike(String value) {
            addCriterion("report_condition not like", value, "reportCondition");
            return (Criteria) this;
        }

        public Criteria andReportConditionIn(List<String> values) {
            addCriterion("report_condition in", values, "reportCondition");
            return (Criteria) this;
        }

        public Criteria andReportConditionNotIn(List<String> values) {
            addCriterion("report_condition not in", values, "reportCondition");
            return (Criteria) this;
        }

        public Criteria andReportConditionBetween(String value1, String value2) {
            addCriterion("report_condition between", value1, value2, "reportCondition");
            return (Criteria) this;
        }

        public Criteria andReportConditionNotBetween(String value1, String value2) {
            addCriterion("report_condition not between", value1, value2, "reportCondition");
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

        public Criteria andDepartmentIdEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("department_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("department_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("department_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("department_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("department_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualToColumn(HonourProject.Column column) {
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

        public Criteria andProjectLevelEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_level = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLevelNotEqualTo(Integer value) {
            addCriterion("project_level <>", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelNotEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_level <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLevelGreaterThan(Integer value) {
            addCriterion("project_level >", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelGreaterThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_level > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_level >=", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelGreaterThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_level >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLevelLessThan(Integer value) {
            addCriterion("project_level <", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelLessThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_level < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLevelLessThanOrEqualTo(Integer value) {
            addCriterion("project_level <=", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelLessThanOrEqualToColumn(HonourProject.Column column) {
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

        public Criteria andSectionIdEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("section_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSectionIdNotEqualTo(Integer value) {
            addCriterion("section_id <>", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("section_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThan(Integer value) {
            addCriterion("section_id >", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("section_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("section_id >=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("section_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThan(Integer value) {
            addCriterion("section_id <", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("section_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("section_id <=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThanOrEqualToColumn(HonourProject.Column column) {
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

        public Criteria andProjectDescIsNull() {
            addCriterion("project_desc is null");
            return (Criteria) this;
        }

        public Criteria andProjectDescIsNotNull() {
            addCriterion("project_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDescEqualTo(String value) {
            addCriterion("project_desc =", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_desc = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDescNotEqualTo(String value) {
            addCriterion("project_desc <>", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescNotEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_desc <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDescGreaterThan(String value) {
            addCriterion("project_desc >", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescGreaterThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_desc > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDescGreaterThanOrEqualTo(String value) {
            addCriterion("project_desc >=", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescGreaterThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_desc >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDescLessThan(String value) {
            addCriterion("project_desc <", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescLessThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_desc < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDescLessThanOrEqualTo(String value) {
            addCriterion("project_desc <=", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescLessThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_desc <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDescLike(String value) {
            addCriterion("project_desc like", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescNotLike(String value) {
            addCriterion("project_desc not like", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescIn(List<String> values) {
            addCriterion("project_desc in", values, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescNotIn(List<String> values) {
            addCriterion("project_desc not in", values, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescBetween(String value1, String value2) {
            addCriterion("project_desc between", value1, value2, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescNotBetween(String value1, String value2) {
            addCriterion("project_desc not between", value1, value2, "projectDesc");
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

        public Criteria andProjectAppendixEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_appendix = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAppendixNotEqualTo(String value) {
            addCriterion("project_appendix <>", value, "projectAppendix");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixNotEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_appendix <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAppendixGreaterThan(String value) {
            addCriterion("project_appendix >", value, "projectAppendix");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixGreaterThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_appendix > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAppendixGreaterThanOrEqualTo(String value) {
            addCriterion("project_appendix >=", value, "projectAppendix");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixGreaterThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_appendix >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAppendixLessThan(String value) {
            addCriterion("project_appendix <", value, "projectAppendix");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixLessThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("project_appendix < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAppendixLessThanOrEqualTo(String value) {
            addCriterion("project_appendix <=", value, "projectAppendix");
            return (Criteria) this;
        }

        public Criteria andProjectAppendixLessThanOrEqualToColumn(HonourProject.Column column) {
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

        public Criteria andCreateDateEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("create_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("create_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("create_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualToColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("create_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanColumn(HonourProject.Column column) {
            addCriterion(new StringBuilder("create_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualToColumn(HonourProject.Column column) {
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
        private HonourProjectExample example;

        protected Criteria(HonourProjectExample example) {
            super();
            this.example = example;
        }

        public HonourProjectExample example() {
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
        void example(com.sakura.project_manage.entity.example.HonourProjectExample example);
    }
}