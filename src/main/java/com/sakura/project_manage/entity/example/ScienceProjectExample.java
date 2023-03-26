package com.sakura.project_manage.entity.example;

import com.sakura.project_manage.entity.ScienceProject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScienceProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScienceProjectExample() {
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

    public ScienceProjectExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public ScienceProjectExample orderBy(String ... orderByClauses) {
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
        ScienceProjectExample example = new ScienceProjectExample();
        return example.createCriteria();
    }

    public ScienceProjectExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public ScienceProjectExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(ScienceProject.Column column) {
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

        public Criteria andProjectPublishIdEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_publish_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdNotEqualTo(Integer value) {
            addCriterion("project_publish_id <>", value, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_publish_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdGreaterThan(Integer value) {
            addCriterion("project_publish_id >", value, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_publish_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_publish_id >=", value, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_publish_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdLessThan(Integer value) {
            addCriterion("project_publish_id <", value, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_publish_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_publish_id <=", value, "projectPublishId");
            return (Criteria) this;
        }

        public Criteria andProjectPublishIdLessThanOrEqualToColumn(ScienceProject.Column column) {
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

        public Criteria andProjectStatusEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotEqualTo(Integer value) {
            addCriterion("project_status <>", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThan(Integer value) {
            addCriterion("project_status >", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_status >=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThan(Integer value) {
            addCriterion("project_status <", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThanOrEqualTo(Integer value) {
            addCriterion("project_status <=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThanOrEqualToColumn(ScienceProject.Column column) {
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

        public Criteria andProjectNameEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualToColumn(ScienceProject.Column column) {
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

        public Criteria andProjectCourseIsNull() {
            addCriterion("project_course is null");
            return (Criteria) this;
        }

        public Criteria andProjectCourseIsNotNull() {
            addCriterion("project_course is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCourseEqualTo(String value) {
            addCriterion("project_course =", value, "projectCourse");
            return (Criteria) this;
        }

        public Criteria andProjectCourseEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_course = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCourseNotEqualTo(String value) {
            addCriterion("project_course <>", value, "projectCourse");
            return (Criteria) this;
        }

        public Criteria andProjectCourseNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_course <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCourseGreaterThan(String value) {
            addCriterion("project_course >", value, "projectCourse");
            return (Criteria) this;
        }

        public Criteria andProjectCourseGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_course > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCourseGreaterThanOrEqualTo(String value) {
            addCriterion("project_course >=", value, "projectCourse");
            return (Criteria) this;
        }

        public Criteria andProjectCourseGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_course >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCourseLessThan(String value) {
            addCriterion("project_course <", value, "projectCourse");
            return (Criteria) this;
        }

        public Criteria andProjectCourseLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_course < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCourseLessThanOrEqualTo(String value) {
            addCriterion("project_course <=", value, "projectCourse");
            return (Criteria) this;
        }

        public Criteria andProjectCourseLessThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_course <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCourseLike(String value) {
            addCriterion("project_course like", value, "projectCourse");
            return (Criteria) this;
        }

        public Criteria andProjectCourseNotLike(String value) {
            addCriterion("project_course not like", value, "projectCourse");
            return (Criteria) this;
        }

        public Criteria andProjectCourseIn(List<String> values) {
            addCriterion("project_course in", values, "projectCourse");
            return (Criteria) this;
        }

        public Criteria andProjectCourseNotIn(List<String> values) {
            addCriterion("project_course not in", values, "projectCourse");
            return (Criteria) this;
        }

        public Criteria andProjectCourseBetween(String value1, String value2) {
            addCriterion("project_course between", value1, value2, "projectCourse");
            return (Criteria) this;
        }

        public Criteria andProjectCourseNotBetween(String value1, String value2) {
            addCriterion("project_course not between", value1, value2, "projectCourse");
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedIsNull() {
            addCriterion("project_specialized is null");
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedIsNotNull() {
            addCriterion("project_specialized is not null");
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedEqualTo(String value) {
            addCriterion("project_specialized =", value, "projectSpecialized");
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_specialized = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedNotEqualTo(String value) {
            addCriterion("project_specialized <>", value, "projectSpecialized");
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_specialized <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedGreaterThan(String value) {
            addCriterion("project_specialized >", value, "projectSpecialized");
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_specialized > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedGreaterThanOrEqualTo(String value) {
            addCriterion("project_specialized >=", value, "projectSpecialized");
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_specialized >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedLessThan(String value) {
            addCriterion("project_specialized <", value, "projectSpecialized");
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_specialized < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedLessThanOrEqualTo(String value) {
            addCriterion("project_specialized <=", value, "projectSpecialized");
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedLessThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_specialized <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedLike(String value) {
            addCriterion("project_specialized like", value, "projectSpecialized");
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedNotLike(String value) {
            addCriterion("project_specialized not like", value, "projectSpecialized");
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedIn(List<String> values) {
            addCriterion("project_specialized in", values, "projectSpecialized");
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedNotIn(List<String> values) {
            addCriterion("project_specialized not in", values, "projectSpecialized");
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedBetween(String value1, String value2) {
            addCriterion("project_specialized between", value1, value2, "projectSpecialized");
            return (Criteria) this;
        }

        public Criteria andProjectSpecializedNotBetween(String value1, String value2) {
            addCriterion("project_specialized not between", value1, value2, "projectSpecialized");
            return (Criteria) this;
        }

        public Criteria andBudgetFundsIsNull() {
            addCriterion("budget_funds is null");
            return (Criteria) this;
        }

        public Criteria andBudgetFundsIsNotNull() {
            addCriterion("budget_funds is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetFundsEqualTo(BigDecimal value) {
            addCriterion("budget_funds =", value, "budgetFunds");
            return (Criteria) this;
        }

        public Criteria andBudgetFundsEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("budget_funds = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBudgetFundsNotEqualTo(BigDecimal value) {
            addCriterion("budget_funds <>", value, "budgetFunds");
            return (Criteria) this;
        }

        public Criteria andBudgetFundsNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("budget_funds <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBudgetFundsGreaterThan(BigDecimal value) {
            addCriterion("budget_funds >", value, "budgetFunds");
            return (Criteria) this;
        }

        public Criteria andBudgetFundsGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("budget_funds > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBudgetFundsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("budget_funds >=", value, "budgetFunds");
            return (Criteria) this;
        }

        public Criteria andBudgetFundsGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("budget_funds >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBudgetFundsLessThan(BigDecimal value) {
            addCriterion("budget_funds <", value, "budgetFunds");
            return (Criteria) this;
        }

        public Criteria andBudgetFundsLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("budget_funds < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBudgetFundsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("budget_funds <=", value, "budgetFunds");
            return (Criteria) this;
        }

        public Criteria andBudgetFundsLessThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("budget_funds <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBudgetFundsIn(List<BigDecimal> values) {
            addCriterion("budget_funds in", values, "budgetFunds");
            return (Criteria) this;
        }

        public Criteria andBudgetFundsNotIn(List<BigDecimal> values) {
            addCriterion("budget_funds not in", values, "budgetFunds");
            return (Criteria) this;
        }

        public Criteria andBudgetFundsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("budget_funds between", value1, value2, "budgetFunds");
            return (Criteria) this;
        }

        public Criteria andBudgetFundsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("budget_funds not between", value1, value2, "budgetFunds");
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

        public Criteria andProjectStartDateEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_start_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStartDateNotEqualTo(Date value) {
            addCriterion("project_start_date <>", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_start_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStartDateGreaterThan(Date value) {
            addCriterion("project_start_date >", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_start_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("project_start_date >=", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_start_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStartDateLessThan(Date value) {
            addCriterion("project_start_date <", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_start_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStartDateLessThanOrEqualTo(Date value) {
            addCriterion("project_start_date <=", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateLessThanOrEqualToColumn(ScienceProject.Column column) {
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

        public Criteria andProjectEndDateEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_end_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEndDateNotEqualTo(Date value) {
            addCriterion("project_end_date <>", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_end_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEndDateGreaterThan(Date value) {
            addCriterion("project_end_date >", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_end_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("project_end_date >=", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_end_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEndDateLessThan(Date value) {
            addCriterion("project_end_date <", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("project_end_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEndDateLessThanOrEqualTo(Date value) {
            addCriterion("project_end_date <=", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateLessThanOrEqualToColumn(ScienceProject.Column column) {
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

        public Criteria andExpectedResultsIsNull() {
            addCriterion("expected_results is null");
            return (Criteria) this;
        }

        public Criteria andExpectedResultsIsNotNull() {
            addCriterion("expected_results is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedResultsEqualTo(String value) {
            addCriterion("expected_results =", value, "expectedResults");
            return (Criteria) this;
        }

        public Criteria andExpectedResultsEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("expected_results = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpectedResultsNotEqualTo(String value) {
            addCriterion("expected_results <>", value, "expectedResults");
            return (Criteria) this;
        }

        public Criteria andExpectedResultsNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("expected_results <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpectedResultsGreaterThan(String value) {
            addCriterion("expected_results >", value, "expectedResults");
            return (Criteria) this;
        }

        public Criteria andExpectedResultsGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("expected_results > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpectedResultsGreaterThanOrEqualTo(String value) {
            addCriterion("expected_results >=", value, "expectedResults");
            return (Criteria) this;
        }

        public Criteria andExpectedResultsGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("expected_results >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpectedResultsLessThan(String value) {
            addCriterion("expected_results <", value, "expectedResults");
            return (Criteria) this;
        }

        public Criteria andExpectedResultsLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("expected_results < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpectedResultsLessThanOrEqualTo(String value) {
            addCriterion("expected_results <=", value, "expectedResults");
            return (Criteria) this;
        }

        public Criteria andExpectedResultsLessThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("expected_results <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpectedResultsLike(String value) {
            addCriterion("expected_results like", value, "expectedResults");
            return (Criteria) this;
        }

        public Criteria andExpectedResultsNotLike(String value) {
            addCriterion("expected_results not like", value, "expectedResults");
            return (Criteria) this;
        }

        public Criteria andExpectedResultsIn(List<String> values) {
            addCriterion("expected_results in", values, "expectedResults");
            return (Criteria) this;
        }

        public Criteria andExpectedResultsNotIn(List<String> values) {
            addCriterion("expected_results not in", values, "expectedResults");
            return (Criteria) this;
        }

        public Criteria andExpectedResultsBetween(String value1, String value2) {
            addCriterion("expected_results between", value1, value2, "expectedResults");
            return (Criteria) this;
        }

        public Criteria andExpectedResultsNotBetween(String value1, String value2) {
            addCriterion("expected_results not between", value1, value2, "expectedResults");
            return (Criteria) this;
        }

        public Criteria andHostUnitIsNull() {
            addCriterion("host_unit is null");
            return (Criteria) this;
        }

        public Criteria andHostUnitIsNotNull() {
            addCriterion("host_unit is not null");
            return (Criteria) this;
        }

        public Criteria andHostUnitEqualTo(String value) {
            addCriterion("host_unit =", value, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("host_unit = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHostUnitNotEqualTo(String value) {
            addCriterion("host_unit <>", value, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("host_unit <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHostUnitGreaterThan(String value) {
            addCriterion("host_unit >", value, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("host_unit > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHostUnitGreaterThanOrEqualTo(String value) {
            addCriterion("host_unit >=", value, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("host_unit >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHostUnitLessThan(String value) {
            addCriterion("host_unit <", value, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("host_unit < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHostUnitLessThanOrEqualTo(String value) {
            addCriterion("host_unit <=", value, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitLessThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("host_unit <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHostUnitLike(String value) {
            addCriterion("host_unit like", value, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitNotLike(String value) {
            addCriterion("host_unit not like", value, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitIn(List<String> values) {
            addCriterion("host_unit in", values, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitNotIn(List<String> values) {
            addCriterion("host_unit not in", values, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitBetween(String value1, String value2) {
            addCriterion("host_unit between", value1, value2, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitNotBetween(String value1, String value2) {
            addCriterion("host_unit not between", value1, value2, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIsNull() {
            addCriterion("unit_type is null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIsNotNull() {
            addCriterion("unit_type is not null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeEqualTo(String value) {
            addCriterion("unit_type =", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("unit_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotEqualTo(String value) {
            addCriterion("unit_type <>", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("unit_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThan(String value) {
            addCriterion("unit_type >", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("unit_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("unit_type >=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("unit_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThan(String value) {
            addCriterion("unit_type <", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("unit_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThanOrEqualTo(String value) {
            addCriterion("unit_type <=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("unit_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitTypeLike(String value) {
            addCriterion("unit_type like", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotLike(String value) {
            addCriterion("unit_type not like", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIn(List<String> values) {
            addCriterion("unit_type in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotIn(List<String> values) {
            addCriterion("unit_type not in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeBetween(String value1, String value2) {
            addCriterion("unit_type between", value1, value2, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotBetween(String value1, String value2) {
            addCriterion("unit_type not between", value1, value2, "unitType");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIsNull() {
            addCriterion("person_charge is null");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIsNotNull() {
            addCriterion("person_charge is not null");
            return (Criteria) this;
        }

        public Criteria andPersonChargeEqualTo(String value) {
            addCriterion("person_charge =", value, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeNotEqualTo(String value) {
            addCriterion("person_charge <>", value, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeGreaterThan(String value) {
            addCriterion("person_charge >", value, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeGreaterThanOrEqualTo(String value) {
            addCriterion("person_charge >=", value, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeLessThan(String value) {
            addCriterion("person_charge <", value, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeLessThanOrEqualTo(String value) {
            addCriterion("person_charge <=", value, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeLessThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeLike(String value) {
            addCriterion("person_charge like", value, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeNotLike(String value) {
            addCriterion("person_charge not like", value, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIn(List<String> values) {
            addCriterion("person_charge in", values, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeNotIn(List<String> values) {
            addCriterion("person_charge not in", values, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeBetween(String value1, String value2) {
            addCriterion("person_charge between", value1, value2, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeNotBetween(String value1, String value2) {
            addCriterion("person_charge not between", value1, value2, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneIsNull() {
            addCriterion("person_charge_phone is null");
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneIsNotNull() {
            addCriterion("person_charge_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneEqualTo(String value) {
            addCriterion("person_charge_phone =", value, "personChargePhone");
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_phone = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneNotEqualTo(String value) {
            addCriterion("person_charge_phone <>", value, "personChargePhone");
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_phone <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneGreaterThan(String value) {
            addCriterion("person_charge_phone >", value, "personChargePhone");
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_phone > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("person_charge_phone >=", value, "personChargePhone");
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_phone >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneLessThan(String value) {
            addCriterion("person_charge_phone <", value, "personChargePhone");
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_phone < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneLessThanOrEqualTo(String value) {
            addCriterion("person_charge_phone <=", value, "personChargePhone");
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneLessThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_phone <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneLike(String value) {
            addCriterion("person_charge_phone like", value, "personChargePhone");
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneNotLike(String value) {
            addCriterion("person_charge_phone not like", value, "personChargePhone");
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneIn(List<String> values) {
            addCriterion("person_charge_phone in", values, "personChargePhone");
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneNotIn(List<String> values) {
            addCriterion("person_charge_phone not in", values, "personChargePhone");
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneBetween(String value1, String value2) {
            addCriterion("person_charge_phone between", value1, value2, "personChargePhone");
            return (Criteria) this;
        }

        public Criteria andPersonChargePhoneNotBetween(String value1, String value2) {
            addCriterion("person_charge_phone not between", value1, value2, "personChargePhone");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityIsNull() {
            addCriterion("person_charge_identity is null");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityIsNotNull() {
            addCriterion("person_charge_identity is not null");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityEqualTo(String value) {
            addCriterion("person_charge_identity =", value, "personChargeIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_identity = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityNotEqualTo(String value) {
            addCriterion("person_charge_identity <>", value, "personChargeIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_identity <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityGreaterThan(String value) {
            addCriterion("person_charge_identity >", value, "personChargeIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_identity > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("person_charge_identity >=", value, "personChargeIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_identity >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityLessThan(String value) {
            addCriterion("person_charge_identity <", value, "personChargeIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_identity < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityLessThanOrEqualTo(String value) {
            addCriterion("person_charge_identity <=", value, "personChargeIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityLessThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_identity <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityLike(String value) {
            addCriterion("person_charge_identity like", value, "personChargeIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityNotLike(String value) {
            addCriterion("person_charge_identity not like", value, "personChargeIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityIn(List<String> values) {
            addCriterion("person_charge_identity in", values, "personChargeIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityNotIn(List<String> values) {
            addCriterion("person_charge_identity not in", values, "personChargeIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityBetween(String value1, String value2) {
            addCriterion("person_charge_identity between", value1, value2, "personChargeIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIdentityNotBetween(String value1, String value2) {
            addCriterion("person_charge_identity not between", value1, value2, "personChargeIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkIsNull() {
            addCriterion("person_charge_work is null");
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkIsNotNull() {
            addCriterion("person_charge_work is not null");
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkEqualTo(String value) {
            addCriterion("person_charge_work =", value, "personChargeWork");
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_work = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkNotEqualTo(String value) {
            addCriterion("person_charge_work <>", value, "personChargeWork");
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_work <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkGreaterThan(String value) {
            addCriterion("person_charge_work >", value, "personChargeWork");
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_work > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkGreaterThanOrEqualTo(String value) {
            addCriterion("person_charge_work >=", value, "personChargeWork");
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_work >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkLessThan(String value) {
            addCriterion("person_charge_work <", value, "personChargeWork");
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_work < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkLessThanOrEqualTo(String value) {
            addCriterion("person_charge_work <=", value, "personChargeWork");
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkLessThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("person_charge_work <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkLike(String value) {
            addCriterion("person_charge_work like", value, "personChargeWork");
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkNotLike(String value) {
            addCriterion("person_charge_work not like", value, "personChargeWork");
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkIn(List<String> values) {
            addCriterion("person_charge_work in", values, "personChargeWork");
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkNotIn(List<String> values) {
            addCriterion("person_charge_work not in", values, "personChargeWork");
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkBetween(String value1, String value2) {
            addCriterion("person_charge_work between", value1, value2, "personChargeWork");
            return (Criteria) this;
        }

        public Criteria andPersonChargeWorkNotBetween(String value1, String value2) {
            addCriterion("person_charge_work not between", value1, value2, "personChargeWork");
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

        public Criteria andCreateUserEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("create_user = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Integer value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("create_user <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Integer value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("create_user > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("create_user >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Integer value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("create_user < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualToColumn(ScienceProject.Column column) {
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

        public Criteria andCreateDateEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("create_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("create_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("create_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualToColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("create_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanColumn(ScienceProject.Column column) {
            addCriterion(new StringBuilder("create_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualToColumn(ScienceProject.Column column) {
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
        private ScienceProjectExample example;

        protected Criteria(ScienceProjectExample example) {
            super();
            this.example = example;
        }

        public ScienceProjectExample example() {
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
        void example(com.sakura.project_manage.entity.example.ScienceProjectExample example);
    }
}