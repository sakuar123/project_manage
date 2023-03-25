package com.sakura.project_manage.entity.example;

import com.sakura.project_manage.entity.SustainDetail;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SustainDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SustainDetailExample() {
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

    public SustainDetailExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public SustainDetailExample orderBy(String ... orderByClauses) {
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
        SustainDetailExample example = new SustainDetailExample();
        return example.createCriteria();
    }

    public SustainDetailExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public SustainDetailExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(SustainDetail.Column column) {
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

        public Criteria andSustainNameIsNull() {
            addCriterion("sustain_name is null");
            return (Criteria) this;
        }

        public Criteria andSustainNameIsNotNull() {
            addCriterion("sustain_name is not null");
            return (Criteria) this;
        }

        public Criteria andSustainNameEqualTo(String value) {
            addCriterion("sustain_name =", value, "sustainName");
            return (Criteria) this;
        }

        public Criteria andSustainNameEqualToColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("sustain_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainNameNotEqualTo(String value) {
            addCriterion("sustain_name <>", value, "sustainName");
            return (Criteria) this;
        }

        public Criteria andSustainNameNotEqualToColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("sustain_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainNameGreaterThan(String value) {
            addCriterion("sustain_name >", value, "sustainName");
            return (Criteria) this;
        }

        public Criteria andSustainNameGreaterThanColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("sustain_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainNameGreaterThanOrEqualTo(String value) {
            addCriterion("sustain_name >=", value, "sustainName");
            return (Criteria) this;
        }

        public Criteria andSustainNameGreaterThanOrEqualToColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("sustain_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainNameLessThan(String value) {
            addCriterion("sustain_name <", value, "sustainName");
            return (Criteria) this;
        }

        public Criteria andSustainNameLessThanColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("sustain_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainNameLessThanOrEqualTo(String value) {
            addCriterion("sustain_name <=", value, "sustainName");
            return (Criteria) this;
        }

        public Criteria andSustainNameLessThanOrEqualToColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("sustain_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainNameLike(String value) {
            addCriterion("sustain_name like", value, "sustainName");
            return (Criteria) this;
        }

        public Criteria andSustainNameNotLike(String value) {
            addCriterion("sustain_name not like", value, "sustainName");
            return (Criteria) this;
        }

        public Criteria andSustainNameIn(List<String> values) {
            addCriterion("sustain_name in", values, "sustainName");
            return (Criteria) this;
        }

        public Criteria andSustainNameNotIn(List<String> values) {
            addCriterion("sustain_name not in", values, "sustainName");
            return (Criteria) this;
        }

        public Criteria andSustainNameBetween(String value1, String value2) {
            addCriterion("sustain_name between", value1, value2, "sustainName");
            return (Criteria) this;
        }

        public Criteria andSustainNameNotBetween(String value1, String value2) {
            addCriterion("sustain_name not between", value1, value2, "sustainName");
            return (Criteria) this;
        }

        public Criteria andSustainDescIsNull() {
            addCriterion("sustain_desc is null");
            return (Criteria) this;
        }

        public Criteria andSustainDescIsNotNull() {
            addCriterion("sustain_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSustainDescEqualTo(String value) {
            addCriterion("sustain_desc =", value, "sustainDesc");
            return (Criteria) this;
        }

        public Criteria andSustainDescEqualToColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("sustain_desc = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainDescNotEqualTo(String value) {
            addCriterion("sustain_desc <>", value, "sustainDesc");
            return (Criteria) this;
        }

        public Criteria andSustainDescNotEqualToColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("sustain_desc <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainDescGreaterThan(String value) {
            addCriterion("sustain_desc >", value, "sustainDesc");
            return (Criteria) this;
        }

        public Criteria andSustainDescGreaterThanColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("sustain_desc > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainDescGreaterThanOrEqualTo(String value) {
            addCriterion("sustain_desc >=", value, "sustainDesc");
            return (Criteria) this;
        }

        public Criteria andSustainDescGreaterThanOrEqualToColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("sustain_desc >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainDescLessThan(String value) {
            addCriterion("sustain_desc <", value, "sustainDesc");
            return (Criteria) this;
        }

        public Criteria andSustainDescLessThanColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("sustain_desc < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainDescLessThanOrEqualTo(String value) {
            addCriterion("sustain_desc <=", value, "sustainDesc");
            return (Criteria) this;
        }

        public Criteria andSustainDescLessThanOrEqualToColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("sustain_desc <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSustainDescLike(String value) {
            addCriterion("sustain_desc like", value, "sustainDesc");
            return (Criteria) this;
        }

        public Criteria andSustainDescNotLike(String value) {
            addCriterion("sustain_desc not like", value, "sustainDesc");
            return (Criteria) this;
        }

        public Criteria andSustainDescIn(List<String> values) {
            addCriterion("sustain_desc in", values, "sustainDesc");
            return (Criteria) this;
        }

        public Criteria andSustainDescNotIn(List<String> values) {
            addCriterion("sustain_desc not in", values, "sustainDesc");
            return (Criteria) this;
        }

        public Criteria andSustainDescBetween(String value1, String value2) {
            addCriterion("sustain_desc between", value1, value2, "sustainDesc");
            return (Criteria) this;
        }

        public Criteria andSustainDescNotBetween(String value1, String value2) {
            addCriterion("sustain_desc not between", value1, value2, "sustainDesc");
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

        public Criteria andCreateDateEqualToColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("create_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualToColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("create_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("create_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualToColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("create_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanColumn(SustainDetail.Column column) {
            addCriterion(new StringBuilder("create_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualToColumn(SustainDetail.Column column) {
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
        private SustainDetailExample example;

        protected Criteria(SustainDetailExample example) {
            super();
            this.example = example;
        }

        public SustainDetailExample example() {
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
        void example(com.sakura.project_manage.entity.example.SustainDetailExample example);
    }
}