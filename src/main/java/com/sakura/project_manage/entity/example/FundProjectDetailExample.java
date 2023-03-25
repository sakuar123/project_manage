package com.sakura.project_manage.entity.example;

import com.sakura.project_manage.entity.FundProjectDetail;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FundProjectDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FundProjectDetailExample() {
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

    public FundProjectDetailExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public FundProjectDetailExample orderBy(String ... orderByClauses) {
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
        FundProjectDetailExample example = new FundProjectDetailExample();
        return example.createCriteria();
    }

    public FundProjectDetailExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public FundProjectDetailExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(FundProjectDetail.Column column) {
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

        public Criteria andProjectFundIdIsNull() {
            addCriterion("project_fund_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectFundIdIsNotNull() {
            addCriterion("project_fund_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectFundIdEqualTo(Integer value) {
            addCriterion("project_fund_id =", value, "projectFundId");
            return (Criteria) this;
        }

        public Criteria andProjectFundIdEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_fund_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundIdNotEqualTo(Integer value) {
            addCriterion("project_fund_id <>", value, "projectFundId");
            return (Criteria) this;
        }

        public Criteria andProjectFundIdNotEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_fund_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundIdGreaterThan(Integer value) {
            addCriterion("project_fund_id >", value, "projectFundId");
            return (Criteria) this;
        }

        public Criteria andProjectFundIdGreaterThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_fund_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_fund_id >=", value, "projectFundId");
            return (Criteria) this;
        }

        public Criteria andProjectFundIdGreaterThanOrEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_fund_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundIdLessThan(Integer value) {
            addCriterion("project_fund_id <", value, "projectFundId");
            return (Criteria) this;
        }

        public Criteria andProjectFundIdLessThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_fund_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_fund_id <=", value, "projectFundId");
            return (Criteria) this;
        }

        public Criteria andProjectFundIdLessThanOrEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_fund_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundIdIn(List<Integer> values) {
            addCriterion("project_fund_id in", values, "projectFundId");
            return (Criteria) this;
        }

        public Criteria andProjectFundIdNotIn(List<Integer> values) {
            addCriterion("project_fund_id not in", values, "projectFundId");
            return (Criteria) this;
        }

        public Criteria andProjectFundIdBetween(Integer value1, Integer value2) {
            addCriterion("project_fund_id between", value1, value2, "projectFundId");
            return (Criteria) this;
        }

        public Criteria andProjectFundIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_fund_id not between", value1, value2, "projectFundId");
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaIsNull() {
            addCriterion("project_fund_quota is null");
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaIsNotNull() {
            addCriterion("project_fund_quota is not null");
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaEqualTo(BigDecimal value) {
            addCriterion("project_fund_quota =", value, "projectFundQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_fund_quota = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaNotEqualTo(BigDecimal value) {
            addCriterion("project_fund_quota <>", value, "projectFundQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaNotEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_fund_quota <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaGreaterThan(BigDecimal value) {
            addCriterion("project_fund_quota >", value, "projectFundQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaGreaterThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_fund_quota > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("project_fund_quota >=", value, "projectFundQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaGreaterThanOrEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_fund_quota >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaLessThan(BigDecimal value) {
            addCriterion("project_fund_quota <", value, "projectFundQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaLessThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_fund_quota < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("project_fund_quota <=", value, "projectFundQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaLessThanOrEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_fund_quota <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaIn(List<BigDecimal> values) {
            addCriterion("project_fund_quota in", values, "projectFundQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaNotIn(List<BigDecimal> values) {
            addCriterion("project_fund_quota not in", values, "projectFundQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_fund_quota between", value1, value2, "projectFundQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundQuotaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_fund_quota not between", value1, value2, "projectFundQuota");
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentIsNull() {
            addCriterion("project_total_investment is null");
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentIsNotNull() {
            addCriterion("project_total_investment is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentEqualTo(BigDecimal value) {
            addCriterion("project_total_investment =", value, "projectTotalInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_total_investment = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentNotEqualTo(BigDecimal value) {
            addCriterion("project_total_investment <>", value, "projectTotalInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentNotEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_total_investment <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentGreaterThan(BigDecimal value) {
            addCriterion("project_total_investment >", value, "projectTotalInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentGreaterThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_total_investment > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("project_total_investment >=", value, "projectTotalInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentGreaterThanOrEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_total_investment >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentLessThan(BigDecimal value) {
            addCriterion("project_total_investment <", value, "projectTotalInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentLessThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_total_investment < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("project_total_investment <=", value, "projectTotalInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentLessThanOrEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_total_investment <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentIn(List<BigDecimal> values) {
            addCriterion("project_total_investment in", values, "projectTotalInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentNotIn(List<BigDecimal> values) {
            addCriterion("project_total_investment not in", values, "projectTotalInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_total_investment between", value1, value2, "projectTotalInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectTotalInvestmentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_total_investment not between", value1, value2, "projectTotalInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentIsNull() {
            addCriterion("project_center_investment is null");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentIsNotNull() {
            addCriterion("project_center_investment is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentEqualTo(BigDecimal value) {
            addCriterion("project_center_investment =", value, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_center_investment = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentNotEqualTo(BigDecimal value) {
            addCriterion("project_center_investment <>", value, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentNotEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_center_investment <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentGreaterThan(BigDecimal value) {
            addCriterion("project_center_investment >", value, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentGreaterThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_center_investment > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("project_center_investment >=", value, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentGreaterThanOrEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_center_investment >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentLessThan(BigDecimal value) {
            addCriterion("project_center_investment <", value, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentLessThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_center_investment < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("project_center_investment <=", value, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentLessThanOrEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_center_investment <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentIn(List<BigDecimal> values) {
            addCriterion("project_center_investment in", values, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentNotIn(List<BigDecimal> values) {
            addCriterion("project_center_investment not in", values, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_center_investment between", value1, value2, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_center_investment not between", value1, value2, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentIsNull() {
            addCriterion("project_part_investment is null");
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentIsNotNull() {
            addCriterion("project_part_investment is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentEqualTo(BigDecimal value) {
            addCriterion("project_part_investment =", value, "projectPartInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_part_investment = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentNotEqualTo(BigDecimal value) {
            addCriterion("project_part_investment <>", value, "projectPartInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentNotEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_part_investment <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentGreaterThan(BigDecimal value) {
            addCriterion("project_part_investment >", value, "projectPartInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentGreaterThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_part_investment > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("project_part_investment >=", value, "projectPartInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentGreaterThanOrEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_part_investment >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentLessThan(BigDecimal value) {
            addCriterion("project_part_investment <", value, "projectPartInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentLessThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_part_investment < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("project_part_investment <=", value, "projectPartInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentLessThanOrEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("project_part_investment <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentIn(List<BigDecimal> values) {
            addCriterion("project_part_investment in", values, "projectPartInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentNotIn(List<BigDecimal> values) {
            addCriterion("project_part_investment not in", values, "projectPartInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_part_investment between", value1, value2, "projectPartInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectPartInvestmentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_part_investment not between", value1, value2, "projectPartInvestment");
            return (Criteria) this;
        }

        public Criteria andBankCreditIsNull() {
            addCriterion("bank_credit is null");
            return (Criteria) this;
        }

        public Criteria andBankCreditIsNotNull() {
            addCriterion("bank_credit is not null");
            return (Criteria) this;
        }

        public Criteria andBankCreditEqualTo(BigDecimal value) {
            addCriterion("bank_credit =", value, "bankCredit");
            return (Criteria) this;
        }

        public Criteria andBankCreditEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("bank_credit = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankCreditNotEqualTo(BigDecimal value) {
            addCriterion("bank_credit <>", value, "bankCredit");
            return (Criteria) this;
        }

        public Criteria andBankCreditNotEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("bank_credit <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankCreditGreaterThan(BigDecimal value) {
            addCriterion("bank_credit >", value, "bankCredit");
            return (Criteria) this;
        }

        public Criteria andBankCreditGreaterThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("bank_credit > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankCreditGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_credit >=", value, "bankCredit");
            return (Criteria) this;
        }

        public Criteria andBankCreditGreaterThanOrEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("bank_credit >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankCreditLessThan(BigDecimal value) {
            addCriterion("bank_credit <", value, "bankCredit");
            return (Criteria) this;
        }

        public Criteria andBankCreditLessThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("bank_credit < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankCreditLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_credit <=", value, "bankCredit");
            return (Criteria) this;
        }

        public Criteria andBankCreditLessThanOrEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("bank_credit <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankCreditIn(List<BigDecimal> values) {
            addCriterion("bank_credit in", values, "bankCredit");
            return (Criteria) this;
        }

        public Criteria andBankCreditNotIn(List<BigDecimal> values) {
            addCriterion("bank_credit not in", values, "bankCredit");
            return (Criteria) this;
        }

        public Criteria andBankCreditBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_credit between", value1, value2, "bankCredit");
            return (Criteria) this;
        }

        public Criteria andBankCreditNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_credit not between", value1, value2, "bankCredit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceIsNull() {
            addCriterion("enterprise_self_finance is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceIsNotNull() {
            addCriterion("enterprise_self_finance is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceEqualTo(BigDecimal value) {
            addCriterion("enterprise_self_finance =", value, "enterpriseSelfFinance");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_self_finance = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceNotEqualTo(BigDecimal value) {
            addCriterion("enterprise_self_finance <>", value, "enterpriseSelfFinance");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceNotEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_self_finance <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceGreaterThan(BigDecimal value) {
            addCriterion("enterprise_self_finance >", value, "enterpriseSelfFinance");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceGreaterThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_self_finance > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("enterprise_self_finance >=", value, "enterpriseSelfFinance");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceGreaterThanOrEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_self_finance >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceLessThan(BigDecimal value) {
            addCriterion("enterprise_self_finance <", value, "enterpriseSelfFinance");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceLessThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_self_finance < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("enterprise_self_finance <=", value, "enterpriseSelfFinance");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceLessThanOrEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("enterprise_self_finance <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceIn(List<BigDecimal> values) {
            addCriterion("enterprise_self_finance in", values, "enterpriseSelfFinance");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceNotIn(List<BigDecimal> values) {
            addCriterion("enterprise_self_finance not in", values, "enterpriseSelfFinance");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enterprise_self_finance between", value1, value2, "enterpriseSelfFinance");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSelfFinanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enterprise_self_finance not between", value1, value2, "enterpriseSelfFinance");
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

        public Criteria andCreateDateEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("create_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("create_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("create_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualToColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("create_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanColumn(FundProjectDetail.Column column) {
            addCriterion(new StringBuilder("create_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualToColumn(FundProjectDetail.Column column) {
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
        private FundProjectDetailExample example;

        protected Criteria(FundProjectDetailExample example) {
            super();
            this.example = example;
        }

        public FundProjectDetailExample example() {
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
        void example(com.sakura.project_manage.entity.example.FundProjectDetailExample example);
    }
}