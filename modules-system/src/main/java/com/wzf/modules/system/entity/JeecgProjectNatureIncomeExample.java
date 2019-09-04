package com.wzf.modules.system.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JeecgProjectNatureIncomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JeecgProjectNatureIncomeExample() {
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

        public Criteria andNatureIsNull() {
            addCriterion("nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(String value) {
            addCriterion("nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(String value) {
            addCriterion("nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(String value) {
            addCriterion("nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(String value) {
            addCriterion("nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(String value) {
            addCriterion("nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(String value) {
            addCriterion("nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLike(String value) {
            addCriterion("nature like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotLike(String value) {
            addCriterion("nature not like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<String> values) {
            addCriterion("nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<String> values) {
            addCriterion("nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(String value1, String value2) {
            addCriterion("nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(String value1, String value2) {
            addCriterion("nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeIsNull() {
            addCriterion("insurance_fee is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeIsNotNull() {
            addCriterion("insurance_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeEqualTo(BigDecimal value) {
            addCriterion("insurance_fee =", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeNotEqualTo(BigDecimal value) {
            addCriterion("insurance_fee <>", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeGreaterThan(BigDecimal value) {
            addCriterion("insurance_fee >", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_fee >=", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeLessThan(BigDecimal value) {
            addCriterion("insurance_fee <", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_fee <=", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeIn(List<BigDecimal> values) {
            addCriterion("insurance_fee in", values, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeNotIn(List<BigDecimal> values) {
            addCriterion("insurance_fee not in", values, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_fee between", value1, value2, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_fee not between", value1, value2, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andRiskConsultingFeeIsNull() {
            addCriterion("risk_consulting_fee is null");
            return (Criteria) this;
        }

        public Criteria andRiskConsultingFeeIsNotNull() {
            addCriterion("risk_consulting_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRiskConsultingFeeEqualTo(BigDecimal value) {
            addCriterion("risk_consulting_fee =", value, "riskConsultingFee");
            return (Criteria) this;
        }

        public Criteria andRiskConsultingFeeNotEqualTo(BigDecimal value) {
            addCriterion("risk_consulting_fee <>", value, "riskConsultingFee");
            return (Criteria) this;
        }

        public Criteria andRiskConsultingFeeGreaterThan(BigDecimal value) {
            addCriterion("risk_consulting_fee >", value, "riskConsultingFee");
            return (Criteria) this;
        }

        public Criteria andRiskConsultingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("risk_consulting_fee >=", value, "riskConsultingFee");
            return (Criteria) this;
        }

        public Criteria andRiskConsultingFeeLessThan(BigDecimal value) {
            addCriterion("risk_consulting_fee <", value, "riskConsultingFee");
            return (Criteria) this;
        }

        public Criteria andRiskConsultingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("risk_consulting_fee <=", value, "riskConsultingFee");
            return (Criteria) this;
        }

        public Criteria andRiskConsultingFeeIn(List<BigDecimal> values) {
            addCriterion("risk_consulting_fee in", values, "riskConsultingFee");
            return (Criteria) this;
        }

        public Criteria andRiskConsultingFeeNotIn(List<BigDecimal> values) {
            addCriterion("risk_consulting_fee not in", values, "riskConsultingFee");
            return (Criteria) this;
        }

        public Criteria andRiskConsultingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("risk_consulting_fee between", value1, value2, "riskConsultingFee");
            return (Criteria) this;
        }

        public Criteria andRiskConsultingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("risk_consulting_fee not between", value1, value2, "riskConsultingFee");
            return (Criteria) this;
        }

        public Criteria andEvaluationFeeIsNull() {
            addCriterion("evaluation_fee is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationFeeIsNotNull() {
            addCriterion("evaluation_fee is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationFeeEqualTo(BigDecimal value) {
            addCriterion("evaluation_fee =", value, "evaluationFee");
            return (Criteria) this;
        }

        public Criteria andEvaluationFeeNotEqualTo(BigDecimal value) {
            addCriterion("evaluation_fee <>", value, "evaluationFee");
            return (Criteria) this;
        }

        public Criteria andEvaluationFeeGreaterThan(BigDecimal value) {
            addCriterion("evaluation_fee >", value, "evaluationFee");
            return (Criteria) this;
        }

        public Criteria andEvaluationFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("evaluation_fee >=", value, "evaluationFee");
            return (Criteria) this;
        }

        public Criteria andEvaluationFeeLessThan(BigDecimal value) {
            addCriterion("evaluation_fee <", value, "evaluationFee");
            return (Criteria) this;
        }

        public Criteria andEvaluationFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("evaluation_fee <=", value, "evaluationFee");
            return (Criteria) this;
        }

        public Criteria andEvaluationFeeIn(List<BigDecimal> values) {
            addCriterion("evaluation_fee in", values, "evaluationFee");
            return (Criteria) this;
        }

        public Criteria andEvaluationFeeNotIn(List<BigDecimal> values) {
            addCriterion("evaluation_fee not in", values, "evaluationFee");
            return (Criteria) this;
        }

        public Criteria andEvaluationFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("evaluation_fee between", value1, value2, "evaluationFee");
            return (Criteria) this;
        }

        public Criteria andEvaluationFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("evaluation_fee not between", value1, value2, "evaluationFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceEvaluationFeeIsNull() {
            addCriterion("insurance_evaluation_fee is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEvaluationFeeIsNotNull() {
            addCriterion("insurance_evaluation_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEvaluationFeeEqualTo(BigDecimal value) {
            addCriterion("insurance_evaluation_fee =", value, "insuranceEvaluationFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceEvaluationFeeNotEqualTo(BigDecimal value) {
            addCriterion("insurance_evaluation_fee <>", value, "insuranceEvaluationFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceEvaluationFeeGreaterThan(BigDecimal value) {
            addCriterion("insurance_evaluation_fee >", value, "insuranceEvaluationFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceEvaluationFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_evaluation_fee >=", value, "insuranceEvaluationFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceEvaluationFeeLessThan(BigDecimal value) {
            addCriterion("insurance_evaluation_fee <", value, "insuranceEvaluationFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceEvaluationFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_evaluation_fee <=", value, "insuranceEvaluationFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceEvaluationFeeIn(List<BigDecimal> values) {
            addCriterion("insurance_evaluation_fee in", values, "insuranceEvaluationFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceEvaluationFeeNotIn(List<BigDecimal> values) {
            addCriterion("insurance_evaluation_fee not in", values, "insuranceEvaluationFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceEvaluationFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_evaluation_fee between", value1, value2, "insuranceEvaluationFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceEvaluationFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_evaluation_fee not between", value1, value2, "insuranceEvaluationFee");
            return (Criteria) this;
        }

        public Criteria andBiddingConsultingFeeIsNull() {
            addCriterion("bidding_consulting_fee is null");
            return (Criteria) this;
        }

        public Criteria andBiddingConsultingFeeIsNotNull() {
            addCriterion("bidding_consulting_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBiddingConsultingFeeEqualTo(BigDecimal value) {
            addCriterion("bidding_consulting_fee =", value, "biddingConsultingFee");
            return (Criteria) this;
        }

        public Criteria andBiddingConsultingFeeNotEqualTo(BigDecimal value) {
            addCriterion("bidding_consulting_fee <>", value, "biddingConsultingFee");
            return (Criteria) this;
        }

        public Criteria andBiddingConsultingFeeGreaterThan(BigDecimal value) {
            addCriterion("bidding_consulting_fee >", value, "biddingConsultingFee");
            return (Criteria) this;
        }

        public Criteria andBiddingConsultingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bidding_consulting_fee >=", value, "biddingConsultingFee");
            return (Criteria) this;
        }

        public Criteria andBiddingConsultingFeeLessThan(BigDecimal value) {
            addCriterion("bidding_consulting_fee <", value, "biddingConsultingFee");
            return (Criteria) this;
        }

        public Criteria andBiddingConsultingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bidding_consulting_fee <=", value, "biddingConsultingFee");
            return (Criteria) this;
        }

        public Criteria andBiddingConsultingFeeIn(List<BigDecimal> values) {
            addCriterion("bidding_consulting_fee in", values, "biddingConsultingFee");
            return (Criteria) this;
        }

        public Criteria andBiddingConsultingFeeNotIn(List<BigDecimal> values) {
            addCriterion("bidding_consulting_fee not in", values, "biddingConsultingFee");
            return (Criteria) this;
        }

        public Criteria andBiddingConsultingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bidding_consulting_fee between", value1, value2, "biddingConsultingFee");
            return (Criteria) this;
        }

        public Criteria andBiddingConsultingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bidding_consulting_fee not between", value1, value2, "biddingConsultingFee");
            return (Criteria) this;
        }

        public Criteria andInterolConsultingFeeIsNull() {
            addCriterion("interol_consulting_fee is null");
            return (Criteria) this;
        }

        public Criteria andInterolConsultingFeeIsNotNull() {
            addCriterion("interol_consulting_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInterolConsultingFeeEqualTo(BigDecimal value) {
            addCriterion("interol_consulting_fee =", value, "interolConsultingFee");
            return (Criteria) this;
        }

        public Criteria andInterolConsultingFeeNotEqualTo(BigDecimal value) {
            addCriterion("interol_consulting_fee <>", value, "interolConsultingFee");
            return (Criteria) this;
        }

        public Criteria andInterolConsultingFeeGreaterThan(BigDecimal value) {
            addCriterion("interol_consulting_fee >", value, "interolConsultingFee");
            return (Criteria) this;
        }

        public Criteria andInterolConsultingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interol_consulting_fee >=", value, "interolConsultingFee");
            return (Criteria) this;
        }

        public Criteria andInterolConsultingFeeLessThan(BigDecimal value) {
            addCriterion("interol_consulting_fee <", value, "interolConsultingFee");
            return (Criteria) this;
        }

        public Criteria andInterolConsultingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interol_consulting_fee <=", value, "interolConsultingFee");
            return (Criteria) this;
        }

        public Criteria andInterolConsultingFeeIn(List<BigDecimal> values) {
            addCriterion("interol_consulting_fee in", values, "interolConsultingFee");
            return (Criteria) this;
        }

        public Criteria andInterolConsultingFeeNotIn(List<BigDecimal> values) {
            addCriterion("interol_consulting_fee not in", values, "interolConsultingFee");
            return (Criteria) this;
        }

        public Criteria andInterolConsultingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interol_consulting_fee between", value1, value2, "interolConsultingFee");
            return (Criteria) this;
        }

        public Criteria andInterolConsultingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interol_consulting_fee not between", value1, value2, "interolConsultingFee");
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