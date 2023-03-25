package com.sakura.project_manage.entity.example;

import com.sakura.project_manage.entity.OperateLogDetail;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperateLogDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperateLogDetailExample() {
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

    public OperateLogDetailExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public OperateLogDetailExample orderBy(String ... orderByClauses) {
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
        OperateLogDetailExample example = new OperateLogDetailExample();
        return example.createCriteria();
    }

    public OperateLogDetailExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public OperateLogDetailExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(OperateLogDetail.Column column) {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOperateFunctionIsNull() {
            addCriterion("operate_function is null");
            return (Criteria) this;
        }

        public Criteria andOperateFunctionIsNotNull() {
            addCriterion("operate_function is not null");
            return (Criteria) this;
        }

        public Criteria andOperateFunctionEqualTo(String value) {
            addCriterion("operate_function =", value, "operateFunction");
            return (Criteria) this;
        }

        public Criteria andOperateFunctionEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("operate_function = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateFunctionNotEqualTo(String value) {
            addCriterion("operate_function <>", value, "operateFunction");
            return (Criteria) this;
        }

        public Criteria andOperateFunctionNotEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("operate_function <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateFunctionGreaterThan(String value) {
            addCriterion("operate_function >", value, "operateFunction");
            return (Criteria) this;
        }

        public Criteria andOperateFunctionGreaterThanColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("operate_function > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("operate_function >=", value, "operateFunction");
            return (Criteria) this;
        }

        public Criteria andOperateFunctionGreaterThanOrEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("operate_function >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateFunctionLessThan(String value) {
            addCriterion("operate_function <", value, "operateFunction");
            return (Criteria) this;
        }

        public Criteria andOperateFunctionLessThanColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("operate_function < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateFunctionLessThanOrEqualTo(String value) {
            addCriterion("operate_function <=", value, "operateFunction");
            return (Criteria) this;
        }

        public Criteria andOperateFunctionLessThanOrEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("operate_function <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateFunctionLike(String value) {
            addCriterion("operate_function like", value, "operateFunction");
            return (Criteria) this;
        }

        public Criteria andOperateFunctionNotLike(String value) {
            addCriterion("operate_function not like", value, "operateFunction");
            return (Criteria) this;
        }

        public Criteria andOperateFunctionIn(List<String> values) {
            addCriterion("operate_function in", values, "operateFunction");
            return (Criteria) this;
        }

        public Criteria andOperateFunctionNotIn(List<String> values) {
            addCriterion("operate_function not in", values, "operateFunction");
            return (Criteria) this;
        }

        public Criteria andOperateFunctionBetween(String value1, String value2) {
            addCriterion("operate_function between", value1, value2, "operateFunction");
            return (Criteria) this;
        }

        public Criteria andOperateFunctionNotBetween(String value1, String value2) {
            addCriterion("operate_function not between", value1, value2, "operateFunction");
            return (Criteria) this;
        }

        public Criteria andIpLocationIsNull() {
            addCriterion("ip_location is null");
            return (Criteria) this;
        }

        public Criteria andIpLocationIsNotNull() {
            addCriterion("ip_location is not null");
            return (Criteria) this;
        }

        public Criteria andIpLocationEqualTo(String value) {
            addCriterion("ip_location =", value, "ipLocation");
            return (Criteria) this;
        }

        public Criteria andIpLocationEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("ip_location = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpLocationNotEqualTo(String value) {
            addCriterion("ip_location <>", value, "ipLocation");
            return (Criteria) this;
        }

        public Criteria andIpLocationNotEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("ip_location <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpLocationGreaterThan(String value) {
            addCriterion("ip_location >", value, "ipLocation");
            return (Criteria) this;
        }

        public Criteria andIpLocationGreaterThanColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("ip_location > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpLocationGreaterThanOrEqualTo(String value) {
            addCriterion("ip_location >=", value, "ipLocation");
            return (Criteria) this;
        }

        public Criteria andIpLocationGreaterThanOrEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("ip_location >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpLocationLessThan(String value) {
            addCriterion("ip_location <", value, "ipLocation");
            return (Criteria) this;
        }

        public Criteria andIpLocationLessThanColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("ip_location < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpLocationLessThanOrEqualTo(String value) {
            addCriterion("ip_location <=", value, "ipLocation");
            return (Criteria) this;
        }

        public Criteria andIpLocationLessThanOrEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("ip_location <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpLocationLike(String value) {
            addCriterion("ip_location like", value, "ipLocation");
            return (Criteria) this;
        }

        public Criteria andIpLocationNotLike(String value) {
            addCriterion("ip_location not like", value, "ipLocation");
            return (Criteria) this;
        }

        public Criteria andIpLocationIn(List<String> values) {
            addCriterion("ip_location in", values, "ipLocation");
            return (Criteria) this;
        }

        public Criteria andIpLocationNotIn(List<String> values) {
            addCriterion("ip_location not in", values, "ipLocation");
            return (Criteria) this;
        }

        public Criteria andIpLocationBetween(String value1, String value2) {
            addCriterion("ip_location between", value1, value2, "ipLocation");
            return (Criteria) this;
        }

        public Criteria andIpLocationNotBetween(String value1, String value2) {
            addCriterion("ip_location not between", value1, value2, "ipLocation");
            return (Criteria) this;
        }

        public Criteria andOperateDescIsNull() {
            addCriterion("operate_desc is null");
            return (Criteria) this;
        }

        public Criteria andOperateDescIsNotNull() {
            addCriterion("operate_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOperateDescEqualTo(String value) {
            addCriterion("operate_desc =", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("operate_desc = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateDescNotEqualTo(String value) {
            addCriterion("operate_desc <>", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescNotEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("operate_desc <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateDescGreaterThan(String value) {
            addCriterion("operate_desc >", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescGreaterThanColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("operate_desc > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateDescGreaterThanOrEqualTo(String value) {
            addCriterion("operate_desc >=", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescGreaterThanOrEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("operate_desc >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateDescLessThan(String value) {
            addCriterion("operate_desc <", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescLessThanColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("operate_desc < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateDescLessThanOrEqualTo(String value) {
            addCriterion("operate_desc <=", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescLessThanOrEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("operate_desc <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateDescLike(String value) {
            addCriterion("operate_desc like", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescNotLike(String value) {
            addCriterion("operate_desc not like", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescIn(List<String> values) {
            addCriterion("operate_desc in", values, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescNotIn(List<String> values) {
            addCriterion("operate_desc not in", values, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescBetween(String value1, String value2) {
            addCriterion("operate_desc between", value1, value2, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescNotBetween(String value1, String value2) {
            addCriterion("operate_desc not between", value1, value2, "operateDesc");
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

        public Criteria andCreateDateEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("create_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("create_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("create_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualToColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("create_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanColumn(OperateLogDetail.Column column) {
            addCriterion(new StringBuilder("create_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualToColumn(OperateLogDetail.Column column) {
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
        private OperateLogDetailExample example;

        protected Criteria(OperateLogDetailExample example) {
            super();
            this.example = example;
        }

        public OperateLogDetailExample example() {
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
        void example(com.sakura.project_manage.entity.example.OperateLogDetailExample example);
    }
}