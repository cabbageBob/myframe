package com.wzf.modules.system.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JeecgMonthlyGrowthAnalysisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JeecgMonthlyGrowthAnalysisExample() {
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

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
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

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
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

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("month like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("month not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMainIncomeIsNull() {
            addCriterion("main_income is null");
            return (Criteria) this;
        }

        public Criteria andMainIncomeIsNotNull() {
            addCriterion("main_income is not null");
            return (Criteria) this;
        }

        public Criteria andMainIncomeEqualTo(BigDecimal value) {
            addCriterion("main_income =", value, "mainIncome");
            return (Criteria) this;
        }

        public Criteria andMainIncomeNotEqualTo(BigDecimal value) {
            addCriterion("main_income <>", value, "mainIncome");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGreaterThan(BigDecimal value) {
            addCriterion("main_income >", value, "mainIncome");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("main_income >=", value, "mainIncome");
            return (Criteria) this;
        }

        public Criteria andMainIncomeLessThan(BigDecimal value) {
            addCriterion("main_income <", value, "mainIncome");
            return (Criteria) this;
        }

        public Criteria andMainIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("main_income <=", value, "mainIncome");
            return (Criteria) this;
        }

        public Criteria andMainIncomeIn(List<BigDecimal> values) {
            addCriterion("main_income in", values, "mainIncome");
            return (Criteria) this;
        }

        public Criteria andMainIncomeNotIn(List<BigDecimal> values) {
            addCriterion("main_income not in", values, "mainIncome");
            return (Criteria) this;
        }

        public Criteria andMainIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("main_income between", value1, value2, "mainIncome");
            return (Criteria) this;
        }

        public Criteria andMainIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("main_income not between", value1, value2, "mainIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeIsNull() {
            addCriterion("other_income is null");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeIsNotNull() {
            addCriterion("other_income is not null");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeEqualTo(BigDecimal value) {
            addCriterion("other_income =", value, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeNotEqualTo(BigDecimal value) {
            addCriterion("other_income <>", value, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeGreaterThan(BigDecimal value) {
            addCriterion("other_income >", value, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("other_income >=", value, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeLessThan(BigDecimal value) {
            addCriterion("other_income <", value, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("other_income <=", value, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeIn(List<BigDecimal> values) {
            addCriterion("other_income in", values, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeNotIn(List<BigDecimal> values) {
            addCriterion("other_income not in", values, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other_income between", value1, value2, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other_income not between", value1, value2, "otherIncome");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
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
}