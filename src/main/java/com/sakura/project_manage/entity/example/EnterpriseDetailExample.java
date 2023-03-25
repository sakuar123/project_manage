package com.sakura.project_manage.entity.example;

import com.sakura.project_manage.entity.EnterpriseDetail;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnterpriseDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseDetailExample() {
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

    public EnterpriseDetailExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public EnterpriseDetailExample orderBy(String ... orderByClauses) {
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
        EnterpriseDetailExample example = new EnterpriseDetailExample();
        return example.createCriteria();
    }

    public EnterpriseDetailExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public EnterpriseDetailExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(EnterpriseDetail.Column column) {
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

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("enterprise_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("enterprise_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("enterprise_name =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("enterprise_name <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("enterprise_name >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_name >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("enterprise_name <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_name <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("enterprise_name like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("enterprise_name not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("enterprise_name in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("enterprise_name not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("enterprise_name between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_name not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateIsNull() {
            addCriterion("enterprise_corporate is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateIsNotNull() {
            addCriterion("enterprise_corporate is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateEqualTo(String value) {
            addCriterion("enterprise_corporate =", value, "enterpriseCorporate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_corporate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateNotEqualTo(String value) {
            addCriterion("enterprise_corporate <>", value, "enterpriseCorporate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateNotEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_corporate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateGreaterThan(String value) {
            addCriterion("enterprise_corporate >", value, "enterpriseCorporate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateGreaterThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_corporate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_corporate >=", value, "enterpriseCorporate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateGreaterThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_corporate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateLessThan(String value) {
            addCriterion("enterprise_corporate <", value, "enterpriseCorporate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateLessThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_corporate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateLessThanOrEqualTo(String value) {
            addCriterion("enterprise_corporate <=", value, "enterpriseCorporate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateLessThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_corporate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateLike(String value) {
            addCriterion("enterprise_corporate like", value, "enterpriseCorporate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateNotLike(String value) {
            addCriterion("enterprise_corporate not like", value, "enterpriseCorporate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateIn(List<String> values) {
            addCriterion("enterprise_corporate in", values, "enterpriseCorporate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateNotIn(List<String> values) {
            addCriterion("enterprise_corporate not in", values, "enterpriseCorporate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateBetween(String value1, String value2) {
            addCriterion("enterprise_corporate between", value1, value2, "enterpriseCorporate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCorporateNotBetween(String value1, String value2) {
            addCriterion("enterprise_corporate not between", value1, value2, "enterpriseCorporate");
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesIsNull() {
            addCriterion("enterprise_properties is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesIsNotNull() {
            addCriterion("enterprise_properties is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesEqualTo(String value) {
            addCriterion("enterprise_properties =", value, "enterpriseProperties");
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_properties = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesNotEqualTo(String value) {
            addCriterion("enterprise_properties <>", value, "enterpriseProperties");
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesNotEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_properties <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesGreaterThan(String value) {
            addCriterion("enterprise_properties >", value, "enterpriseProperties");
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesGreaterThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_properties > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_properties >=", value, "enterpriseProperties");
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesGreaterThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_properties >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesLessThan(String value) {
            addCriterion("enterprise_properties <", value, "enterpriseProperties");
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesLessThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_properties < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesLessThanOrEqualTo(String value) {
            addCriterion("enterprise_properties <=", value, "enterpriseProperties");
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesLessThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_properties <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesLike(String value) {
            addCriterion("enterprise_properties like", value, "enterpriseProperties");
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesNotLike(String value) {
            addCriterion("enterprise_properties not like", value, "enterpriseProperties");
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesIn(List<String> values) {
            addCriterion("enterprise_properties in", values, "enterpriseProperties");
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesNotIn(List<String> values) {
            addCriterion("enterprise_properties not in", values, "enterpriseProperties");
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesBetween(String value1, String value2) {
            addCriterion("enterprise_properties between", value1, value2, "enterpriseProperties");
            return (Criteria) this;
        }

        public Criteria andEnterprisePropertiesNotBetween(String value1, String value2) {
            addCriterion("enterprise_properties not between", value1, value2, "enterpriseProperties");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorIsNull() {
            addCriterion("enterprise_director is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorIsNotNull() {
            addCriterion("enterprise_director is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorEqualTo(String value) {
            addCriterion("enterprise_director =", value, "enterpriseDirector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_director = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorNotEqualTo(String value) {
            addCriterion("enterprise_director <>", value, "enterpriseDirector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorNotEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_director <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorGreaterThan(String value) {
            addCriterion("enterprise_director >", value, "enterpriseDirector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorGreaterThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_director > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_director >=", value, "enterpriseDirector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorGreaterThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_director >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorLessThan(String value) {
            addCriterion("enterprise_director <", value, "enterpriseDirector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorLessThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_director < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorLessThanOrEqualTo(String value) {
            addCriterion("enterprise_director <=", value, "enterpriseDirector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorLessThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_director <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorLike(String value) {
            addCriterion("enterprise_director like", value, "enterpriseDirector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorNotLike(String value) {
            addCriterion("enterprise_director not like", value, "enterpriseDirector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorIn(List<String> values) {
            addCriterion("enterprise_director in", values, "enterpriseDirector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorNotIn(List<String> values) {
            addCriterion("enterprise_director not in", values, "enterpriseDirector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorBetween(String value1, String value2) {
            addCriterion("enterprise_director between", value1, value2, "enterpriseDirector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorNotBetween(String value1, String value2) {
            addCriterion("enterprise_director not between", value1, value2, "enterpriseDirector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneIsNull() {
            addCriterion("enterprise_director_phone is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneIsNotNull() {
            addCriterion("enterprise_director_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneEqualTo(String value) {
            addCriterion("enterprise_director_phone =", value, "enterpriseDirectorPhone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_director_phone = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneNotEqualTo(String value) {
            addCriterion("enterprise_director_phone <>", value, "enterpriseDirectorPhone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneNotEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_director_phone <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneGreaterThan(String value) {
            addCriterion("enterprise_director_phone >", value, "enterpriseDirectorPhone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneGreaterThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_director_phone > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_director_phone >=", value, "enterpriseDirectorPhone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneGreaterThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_director_phone >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneLessThan(String value) {
            addCriterion("enterprise_director_phone <", value, "enterpriseDirectorPhone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneLessThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_director_phone < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneLessThanOrEqualTo(String value) {
            addCriterion("enterprise_director_phone <=", value, "enterpriseDirectorPhone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneLessThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_director_phone <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneLike(String value) {
            addCriterion("enterprise_director_phone like", value, "enterpriseDirectorPhone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneNotLike(String value) {
            addCriterion("enterprise_director_phone not like", value, "enterpriseDirectorPhone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneIn(List<String> values) {
            addCriterion("enterprise_director_phone in", values, "enterpriseDirectorPhone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneNotIn(List<String> values) {
            addCriterion("enterprise_director_phone not in", values, "enterpriseDirectorPhone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneBetween(String value1, String value2) {
            addCriterion("enterprise_director_phone between", value1, value2, "enterpriseDirectorPhone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDirectorPhoneNotBetween(String value1, String value2) {
            addCriterion("enterprise_director_phone not between", value1, value2, "enterpriseDirectorPhone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankIsNull() {
            addCriterion("enterprise_bank is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankIsNotNull() {
            addCriterion("enterprise_bank is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankEqualTo(String value) {
            addCriterion("enterprise_bank =", value, "enterpriseBank");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_bank = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankNotEqualTo(String value) {
            addCriterion("enterprise_bank <>", value, "enterpriseBank");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankNotEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_bank <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankGreaterThan(String value) {
            addCriterion("enterprise_bank >", value, "enterpriseBank");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankGreaterThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_bank > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_bank >=", value, "enterpriseBank");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankGreaterThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_bank >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankLessThan(String value) {
            addCriterion("enterprise_bank <", value, "enterpriseBank");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankLessThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_bank < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankLessThanOrEqualTo(String value) {
            addCriterion("enterprise_bank <=", value, "enterpriseBank");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankLessThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_bank <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankLike(String value) {
            addCriterion("enterprise_bank like", value, "enterpriseBank");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankNotLike(String value) {
            addCriterion("enterprise_bank not like", value, "enterpriseBank");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankIn(List<String> values) {
            addCriterion("enterprise_bank in", values, "enterpriseBank");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankNotIn(List<String> values) {
            addCriterion("enterprise_bank not in", values, "enterpriseBank");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankBetween(String value1, String value2) {
            addCriterion("enterprise_bank between", value1, value2, "enterpriseBank");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankNotBetween(String value1, String value2) {
            addCriterion("enterprise_bank not between", value1, value2, "enterpriseBank");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountIsNull() {
            addCriterion("enterprise_bank_account is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountIsNotNull() {
            addCriterion("enterprise_bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountEqualTo(String value) {
            addCriterion("enterprise_bank_account =", value, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_bank_account = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountNotEqualTo(String value) {
            addCriterion("enterprise_bank_account <>", value, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountNotEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_bank_account <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountGreaterThan(String value) {
            addCriterion("enterprise_bank_account >", value, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountGreaterThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_bank_account > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_bank_account >=", value, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountGreaterThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_bank_account >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountLessThan(String value) {
            addCriterion("enterprise_bank_account <", value, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountLessThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_bank_account < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountLessThanOrEqualTo(String value) {
            addCriterion("enterprise_bank_account <=", value, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountLessThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_bank_account <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountLike(String value) {
            addCriterion("enterprise_bank_account like", value, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountNotLike(String value) {
            addCriterion("enterprise_bank_account not like", value, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountIn(List<String> values) {
            addCriterion("enterprise_bank_account in", values, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountNotIn(List<String> values) {
            addCriterion("enterprise_bank_account not in", values, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountBetween(String value1, String value2) {
            addCriterion("enterprise_bank_account between", value1, value2, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountNotBetween(String value1, String value2) {
            addCriterion("enterprise_bank_account not between", value1, value2, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderIsNull() {
            addCriterion("enterprise_shareholder is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderIsNotNull() {
            addCriterion("enterprise_shareholder is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderEqualTo(String value) {
            addCriterion("enterprise_shareholder =", value, "enterpriseShareholder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_shareholder = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderNotEqualTo(String value) {
            addCriterion("enterprise_shareholder <>", value, "enterpriseShareholder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderNotEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_shareholder <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderGreaterThan(String value) {
            addCriterion("enterprise_shareholder >", value, "enterpriseShareholder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderGreaterThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_shareholder > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_shareholder >=", value, "enterpriseShareholder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderGreaterThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_shareholder >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderLessThan(String value) {
            addCriterion("enterprise_shareholder <", value, "enterpriseShareholder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderLessThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_shareholder < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderLessThanOrEqualTo(String value) {
            addCriterion("enterprise_shareholder <=", value, "enterpriseShareholder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderLessThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_shareholder <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderLike(String value) {
            addCriterion("enterprise_shareholder like", value, "enterpriseShareholder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderNotLike(String value) {
            addCriterion("enterprise_shareholder not like", value, "enterpriseShareholder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderIn(List<String> values) {
            addCriterion("enterprise_shareholder in", values, "enterpriseShareholder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderNotIn(List<String> values) {
            addCriterion("enterprise_shareholder not in", values, "enterpriseShareholder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderBetween(String value1, String value2) {
            addCriterion("enterprise_shareholder between", value1, value2, "enterpriseShareholder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseShareholderNotBetween(String value1, String value2) {
            addCriterion("enterprise_shareholder not between", value1, value2, "enterpriseShareholder");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessIsNull() {
            addCriterion("scope_business is null");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessIsNotNull() {
            addCriterion("scope_business is not null");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessEqualTo(String value) {
            addCriterion("scope_business =", value, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("scope_business = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andScopeBusinessNotEqualTo(String value) {
            addCriterion("scope_business <>", value, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessNotEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("scope_business <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andScopeBusinessGreaterThan(String value) {
            addCriterion("scope_business >", value, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessGreaterThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("scope_business > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andScopeBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("scope_business >=", value, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessGreaterThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("scope_business >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andScopeBusinessLessThan(String value) {
            addCriterion("scope_business <", value, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessLessThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("scope_business < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andScopeBusinessLessThanOrEqualTo(String value) {
            addCriterion("scope_business <=", value, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessLessThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("scope_business <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andScopeBusinessLike(String value) {
            addCriterion("scope_business like", value, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessNotLike(String value) {
            addCriterion("scope_business not like", value, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessIn(List<String> values) {
            addCriterion("scope_business in", values, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessNotIn(List<String> values) {
            addCriterion("scope_business not in", values, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessBetween(String value1, String value2) {
            addCriterion("scope_business between", value1, value2, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessNotBetween(String value1, String value2) {
            addCriterion("scope_business not between", value1, value2, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoIsNull() {
            addCriterion("taxpayer_no is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoIsNotNull() {
            addCriterion("taxpayer_no is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoEqualTo(String value) {
            addCriterion("taxpayer_no =", value, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("taxpayer_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoNotEqualTo(String value) {
            addCriterion("taxpayer_no <>", value, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoNotEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("taxpayer_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoGreaterThan(String value) {
            addCriterion("taxpayer_no >", value, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoGreaterThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("taxpayer_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoGreaterThanOrEqualTo(String value) {
            addCriterion("taxpayer_no >=", value, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoGreaterThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("taxpayer_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoLessThan(String value) {
            addCriterion("taxpayer_no <", value, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoLessThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("taxpayer_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoLessThanOrEqualTo(String value) {
            addCriterion("taxpayer_no <=", value, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoLessThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("taxpayer_no <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoLike(String value) {
            addCriterion("taxpayer_no like", value, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoNotLike(String value) {
            addCriterion("taxpayer_no not like", value, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoIn(List<String> values) {
            addCriterion("taxpayer_no in", values, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoNotIn(List<String> values) {
            addCriterion("taxpayer_no not in", values, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoBetween(String value1, String value2) {
            addCriterion("taxpayer_no between", value1, value2, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoNotBetween(String value1, String value2) {
            addCriterion("taxpayer_no not between", value1, value2, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageIsNull() {
            addCriterion("taxpayer_image is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageIsNotNull() {
            addCriterion("taxpayer_image is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageEqualTo(String value) {
            addCriterion("taxpayer_image =", value, "taxpayerImage");
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("taxpayer_image = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageNotEqualTo(String value) {
            addCriterion("taxpayer_image <>", value, "taxpayerImage");
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageNotEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("taxpayer_image <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageGreaterThan(String value) {
            addCriterion("taxpayer_image >", value, "taxpayerImage");
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageGreaterThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("taxpayer_image > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageGreaterThanOrEqualTo(String value) {
            addCriterion("taxpayer_image >=", value, "taxpayerImage");
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageGreaterThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("taxpayer_image >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageLessThan(String value) {
            addCriterion("taxpayer_image <", value, "taxpayerImage");
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageLessThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("taxpayer_image < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageLessThanOrEqualTo(String value) {
            addCriterion("taxpayer_image <=", value, "taxpayerImage");
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageLessThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("taxpayer_image <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageLike(String value) {
            addCriterion("taxpayer_image like", value, "taxpayerImage");
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageNotLike(String value) {
            addCriterion("taxpayer_image not like", value, "taxpayerImage");
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageIn(List<String> values) {
            addCriterion("taxpayer_image in", values, "taxpayerImage");
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageNotIn(List<String> values) {
            addCriterion("taxpayer_image not in", values, "taxpayerImage");
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageBetween(String value1, String value2) {
            addCriterion("taxpayer_image between", value1, value2, "taxpayerImage");
            return (Criteria) this;
        }

        public Criteria andTaxpayerImageNotBetween(String value1, String value2) {
            addCriterion("taxpayer_image not between", value1, value2, "taxpayerImage");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescIsNull() {
            addCriterion("enterprise_desc is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescIsNotNull() {
            addCriterion("enterprise_desc is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescEqualTo(String value) {
            addCriterion("enterprise_desc =", value, "enterpriseDesc");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_desc = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescNotEqualTo(String value) {
            addCriterion("enterprise_desc <>", value, "enterpriseDesc");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescNotEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_desc <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescGreaterThan(String value) {
            addCriterion("enterprise_desc >", value, "enterpriseDesc");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescGreaterThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_desc > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_desc >=", value, "enterpriseDesc");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescGreaterThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_desc >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescLessThan(String value) {
            addCriterion("enterprise_desc <", value, "enterpriseDesc");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescLessThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_desc < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescLessThanOrEqualTo(String value) {
            addCriterion("enterprise_desc <=", value, "enterpriseDesc");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescLessThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_desc <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescLike(String value) {
            addCriterion("enterprise_desc like", value, "enterpriseDesc");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescNotLike(String value) {
            addCriterion("enterprise_desc not like", value, "enterpriseDesc");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescIn(List<String> values) {
            addCriterion("enterprise_desc in", values, "enterpriseDesc");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescNotIn(List<String> values) {
            addCriterion("enterprise_desc not in", values, "enterpriseDesc");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescBetween(String value1, String value2) {
            addCriterion("enterprise_desc between", value1, value2, "enterpriseDesc");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDescNotBetween(String value1, String value2) {
            addCriterion("enterprise_desc not between", value1, value2, "enterpriseDesc");
            return (Criteria) this;
        }

        public Criteria andLogonTimeIsNull() {
            addCriterion("logon_time is null");
            return (Criteria) this;
        }

        public Criteria andLogonTimeIsNotNull() {
            addCriterion("logon_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogonTimeEqualTo(Date value) {
            addCriterion("logon_time =", value, "logonTime");
            return (Criteria) this;
        }

        public Criteria andLogonTimeEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("logon_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogonTimeNotEqualTo(Date value) {
            addCriterion("logon_time <>", value, "logonTime");
            return (Criteria) this;
        }

        public Criteria andLogonTimeNotEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("logon_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogonTimeGreaterThan(Date value) {
            addCriterion("logon_time >", value, "logonTime");
            return (Criteria) this;
        }

        public Criteria andLogonTimeGreaterThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("logon_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogonTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("logon_time >=", value, "logonTime");
            return (Criteria) this;
        }

        public Criteria andLogonTimeGreaterThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("logon_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogonTimeLessThan(Date value) {
            addCriterion("logon_time <", value, "logonTime");
            return (Criteria) this;
        }

        public Criteria andLogonTimeLessThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("logon_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogonTimeLessThanOrEqualTo(Date value) {
            addCriterion("logon_time <=", value, "logonTime");
            return (Criteria) this;
        }

        public Criteria andLogonTimeLessThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("logon_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogonTimeIn(List<Date> values) {
            addCriterion("logon_time in", values, "logonTime");
            return (Criteria) this;
        }

        public Criteria andLogonTimeNotIn(List<Date> values) {
            addCriterion("logon_time not in", values, "logonTime");
            return (Criteria) this;
        }

        public Criteria andLogonTimeBetween(Date value1, Date value2) {
            addCriterion("logon_time between", value1, value2, "logonTime");
            return (Criteria) this;
        }

        public Criteria andLogonTimeNotBetween(Date value1, Date value2) {
            addCriterion("logon_time not between", value1, value2, "logonTime");
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

        public Criteria andCreateDateEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("create_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("create_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("create_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualToColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("create_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanColumn(EnterpriseDetail.Column column) {
            addCriterion(new StringBuilder("create_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualToColumn(EnterpriseDetail.Column column) {
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
        private EnterpriseDetailExample example;

        protected Criteria(EnterpriseDetailExample example) {
            super();
            this.example = example;
        }

        public EnterpriseDetailExample example() {
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
        void example(com.sakura.project_manage.entity.example.EnterpriseDetailExample example);
    }
}