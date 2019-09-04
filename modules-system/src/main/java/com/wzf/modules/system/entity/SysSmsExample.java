package com.wzf.modules.system.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysSmsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysSmsExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEsTitleIsNull() {
            addCriterion("es_title is null");
            return (Criteria) this;
        }

        public Criteria andEsTitleIsNotNull() {
            addCriterion("es_title is not null");
            return (Criteria) this;
        }

        public Criteria andEsTitleEqualTo(String value) {
            addCriterion("es_title =", value, "esTitle");
            return (Criteria) this;
        }

        public Criteria andEsTitleNotEqualTo(String value) {
            addCriterion("es_title <>", value, "esTitle");
            return (Criteria) this;
        }

        public Criteria andEsTitleGreaterThan(String value) {
            addCriterion("es_title >", value, "esTitle");
            return (Criteria) this;
        }

        public Criteria andEsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("es_title >=", value, "esTitle");
            return (Criteria) this;
        }

        public Criteria andEsTitleLessThan(String value) {
            addCriterion("es_title <", value, "esTitle");
            return (Criteria) this;
        }

        public Criteria andEsTitleLessThanOrEqualTo(String value) {
            addCriterion("es_title <=", value, "esTitle");
            return (Criteria) this;
        }

        public Criteria andEsTitleLike(String value) {
            addCriterion("es_title like", value, "esTitle");
            return (Criteria) this;
        }

        public Criteria andEsTitleNotLike(String value) {
            addCriterion("es_title not like", value, "esTitle");
            return (Criteria) this;
        }

        public Criteria andEsTitleIn(List<String> values) {
            addCriterion("es_title in", values, "esTitle");
            return (Criteria) this;
        }

        public Criteria andEsTitleNotIn(List<String> values) {
            addCriterion("es_title not in", values, "esTitle");
            return (Criteria) this;
        }

        public Criteria andEsTitleBetween(String value1, String value2) {
            addCriterion("es_title between", value1, value2, "esTitle");
            return (Criteria) this;
        }

        public Criteria andEsTitleNotBetween(String value1, String value2) {
            addCriterion("es_title not between", value1, value2, "esTitle");
            return (Criteria) this;
        }

        public Criteria andEsTypeIsNull() {
            addCriterion("es_type is null");
            return (Criteria) this;
        }

        public Criteria andEsTypeIsNotNull() {
            addCriterion("es_type is not null");
            return (Criteria) this;
        }

        public Criteria andEsTypeEqualTo(String value) {
            addCriterion("es_type =", value, "esType");
            return (Criteria) this;
        }

        public Criteria andEsTypeNotEqualTo(String value) {
            addCriterion("es_type <>", value, "esType");
            return (Criteria) this;
        }

        public Criteria andEsTypeGreaterThan(String value) {
            addCriterion("es_type >", value, "esType");
            return (Criteria) this;
        }

        public Criteria andEsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("es_type >=", value, "esType");
            return (Criteria) this;
        }

        public Criteria andEsTypeLessThan(String value) {
            addCriterion("es_type <", value, "esType");
            return (Criteria) this;
        }

        public Criteria andEsTypeLessThanOrEqualTo(String value) {
            addCriterion("es_type <=", value, "esType");
            return (Criteria) this;
        }

        public Criteria andEsTypeLike(String value) {
            addCriterion("es_type like", value, "esType");
            return (Criteria) this;
        }

        public Criteria andEsTypeNotLike(String value) {
            addCriterion("es_type not like", value, "esType");
            return (Criteria) this;
        }

        public Criteria andEsTypeIn(List<String> values) {
            addCriterion("es_type in", values, "esType");
            return (Criteria) this;
        }

        public Criteria andEsTypeNotIn(List<String> values) {
            addCriterion("es_type not in", values, "esType");
            return (Criteria) this;
        }

        public Criteria andEsTypeBetween(String value1, String value2) {
            addCriterion("es_type between", value1, value2, "esType");
            return (Criteria) this;
        }

        public Criteria andEsTypeNotBetween(String value1, String value2) {
            addCriterion("es_type not between", value1, value2, "esType");
            return (Criteria) this;
        }

        public Criteria andEsReceiverIsNull() {
            addCriterion("es_receiver is null");
            return (Criteria) this;
        }

        public Criteria andEsReceiverIsNotNull() {
            addCriterion("es_receiver is not null");
            return (Criteria) this;
        }

        public Criteria andEsReceiverEqualTo(String value) {
            addCriterion("es_receiver =", value, "esReceiver");
            return (Criteria) this;
        }

        public Criteria andEsReceiverNotEqualTo(String value) {
            addCriterion("es_receiver <>", value, "esReceiver");
            return (Criteria) this;
        }

        public Criteria andEsReceiverGreaterThan(String value) {
            addCriterion("es_receiver >", value, "esReceiver");
            return (Criteria) this;
        }

        public Criteria andEsReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("es_receiver >=", value, "esReceiver");
            return (Criteria) this;
        }

        public Criteria andEsReceiverLessThan(String value) {
            addCriterion("es_receiver <", value, "esReceiver");
            return (Criteria) this;
        }

        public Criteria andEsReceiverLessThanOrEqualTo(String value) {
            addCriterion("es_receiver <=", value, "esReceiver");
            return (Criteria) this;
        }

        public Criteria andEsReceiverLike(String value) {
            addCriterion("es_receiver like", value, "esReceiver");
            return (Criteria) this;
        }

        public Criteria andEsReceiverNotLike(String value) {
            addCriterion("es_receiver not like", value, "esReceiver");
            return (Criteria) this;
        }

        public Criteria andEsReceiverIn(List<String> values) {
            addCriterion("es_receiver in", values, "esReceiver");
            return (Criteria) this;
        }

        public Criteria andEsReceiverNotIn(List<String> values) {
            addCriterion("es_receiver not in", values, "esReceiver");
            return (Criteria) this;
        }

        public Criteria andEsReceiverBetween(String value1, String value2) {
            addCriterion("es_receiver between", value1, value2, "esReceiver");
            return (Criteria) this;
        }

        public Criteria andEsReceiverNotBetween(String value1, String value2) {
            addCriterion("es_receiver not between", value1, value2, "esReceiver");
            return (Criteria) this;
        }

        public Criteria andEsParamIsNull() {
            addCriterion("es_param is null");
            return (Criteria) this;
        }

        public Criteria andEsParamIsNotNull() {
            addCriterion("es_param is not null");
            return (Criteria) this;
        }

        public Criteria andEsParamEqualTo(String value) {
            addCriterion("es_param =", value, "esParam");
            return (Criteria) this;
        }

        public Criteria andEsParamNotEqualTo(String value) {
            addCriterion("es_param <>", value, "esParam");
            return (Criteria) this;
        }

        public Criteria andEsParamGreaterThan(String value) {
            addCriterion("es_param >", value, "esParam");
            return (Criteria) this;
        }

        public Criteria andEsParamGreaterThanOrEqualTo(String value) {
            addCriterion("es_param >=", value, "esParam");
            return (Criteria) this;
        }

        public Criteria andEsParamLessThan(String value) {
            addCriterion("es_param <", value, "esParam");
            return (Criteria) this;
        }

        public Criteria andEsParamLessThanOrEqualTo(String value) {
            addCriterion("es_param <=", value, "esParam");
            return (Criteria) this;
        }

        public Criteria andEsParamLike(String value) {
            addCriterion("es_param like", value, "esParam");
            return (Criteria) this;
        }

        public Criteria andEsParamNotLike(String value) {
            addCriterion("es_param not like", value, "esParam");
            return (Criteria) this;
        }

        public Criteria andEsParamIn(List<String> values) {
            addCriterion("es_param in", values, "esParam");
            return (Criteria) this;
        }

        public Criteria andEsParamNotIn(List<String> values) {
            addCriterion("es_param not in", values, "esParam");
            return (Criteria) this;
        }

        public Criteria andEsParamBetween(String value1, String value2) {
            addCriterion("es_param between", value1, value2, "esParam");
            return (Criteria) this;
        }

        public Criteria andEsParamNotBetween(String value1, String value2) {
            addCriterion("es_param not between", value1, value2, "esParam");
            return (Criteria) this;
        }

        public Criteria andEsSendTimeIsNull() {
            addCriterion("es_send_time is null");
            return (Criteria) this;
        }

        public Criteria andEsSendTimeIsNotNull() {
            addCriterion("es_send_time is not null");
            return (Criteria) this;
        }

        public Criteria andEsSendTimeEqualTo(Date value) {
            addCriterion("es_send_time =", value, "esSendTime");
            return (Criteria) this;
        }

        public Criteria andEsSendTimeNotEqualTo(Date value) {
            addCriterion("es_send_time <>", value, "esSendTime");
            return (Criteria) this;
        }

        public Criteria andEsSendTimeGreaterThan(Date value) {
            addCriterion("es_send_time >", value, "esSendTime");
            return (Criteria) this;
        }

        public Criteria andEsSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("es_send_time >=", value, "esSendTime");
            return (Criteria) this;
        }

        public Criteria andEsSendTimeLessThan(Date value) {
            addCriterion("es_send_time <", value, "esSendTime");
            return (Criteria) this;
        }

        public Criteria andEsSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("es_send_time <=", value, "esSendTime");
            return (Criteria) this;
        }

        public Criteria andEsSendTimeIn(List<Date> values) {
            addCriterion("es_send_time in", values, "esSendTime");
            return (Criteria) this;
        }

        public Criteria andEsSendTimeNotIn(List<Date> values) {
            addCriterion("es_send_time not in", values, "esSendTime");
            return (Criteria) this;
        }

        public Criteria andEsSendTimeBetween(Date value1, Date value2) {
            addCriterion("es_send_time between", value1, value2, "esSendTime");
            return (Criteria) this;
        }

        public Criteria andEsSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("es_send_time not between", value1, value2, "esSendTime");
            return (Criteria) this;
        }

        public Criteria andEsSendStatusIsNull() {
            addCriterion("es_send_status is null");
            return (Criteria) this;
        }

        public Criteria andEsSendStatusIsNotNull() {
            addCriterion("es_send_status is not null");
            return (Criteria) this;
        }

        public Criteria andEsSendStatusEqualTo(String value) {
            addCriterion("es_send_status =", value, "esSendStatus");
            return (Criteria) this;
        }

        public Criteria andEsSendStatusNotEqualTo(String value) {
            addCriterion("es_send_status <>", value, "esSendStatus");
            return (Criteria) this;
        }

        public Criteria andEsSendStatusGreaterThan(String value) {
            addCriterion("es_send_status >", value, "esSendStatus");
            return (Criteria) this;
        }

        public Criteria andEsSendStatusGreaterThanOrEqualTo(String value) {
            addCriterion("es_send_status >=", value, "esSendStatus");
            return (Criteria) this;
        }

        public Criteria andEsSendStatusLessThan(String value) {
            addCriterion("es_send_status <", value, "esSendStatus");
            return (Criteria) this;
        }

        public Criteria andEsSendStatusLessThanOrEqualTo(String value) {
            addCriterion("es_send_status <=", value, "esSendStatus");
            return (Criteria) this;
        }

        public Criteria andEsSendStatusLike(String value) {
            addCriterion("es_send_status like", value, "esSendStatus");
            return (Criteria) this;
        }

        public Criteria andEsSendStatusNotLike(String value) {
            addCriterion("es_send_status not like", value, "esSendStatus");
            return (Criteria) this;
        }

        public Criteria andEsSendStatusIn(List<String> values) {
            addCriterion("es_send_status in", values, "esSendStatus");
            return (Criteria) this;
        }

        public Criteria andEsSendStatusNotIn(List<String> values) {
            addCriterion("es_send_status not in", values, "esSendStatus");
            return (Criteria) this;
        }

        public Criteria andEsSendStatusBetween(String value1, String value2) {
            addCriterion("es_send_status between", value1, value2, "esSendStatus");
            return (Criteria) this;
        }

        public Criteria andEsSendStatusNotBetween(String value1, String value2) {
            addCriterion("es_send_status not between", value1, value2, "esSendStatus");
            return (Criteria) this;
        }

        public Criteria andEsSendNumIsNull() {
            addCriterion("es_send_num is null");
            return (Criteria) this;
        }

        public Criteria andEsSendNumIsNotNull() {
            addCriterion("es_send_num is not null");
            return (Criteria) this;
        }

        public Criteria andEsSendNumEqualTo(Integer value) {
            addCriterion("es_send_num =", value, "esSendNum");
            return (Criteria) this;
        }

        public Criteria andEsSendNumNotEqualTo(Integer value) {
            addCriterion("es_send_num <>", value, "esSendNum");
            return (Criteria) this;
        }

        public Criteria andEsSendNumGreaterThan(Integer value) {
            addCriterion("es_send_num >", value, "esSendNum");
            return (Criteria) this;
        }

        public Criteria andEsSendNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("es_send_num >=", value, "esSendNum");
            return (Criteria) this;
        }

        public Criteria andEsSendNumLessThan(Integer value) {
            addCriterion("es_send_num <", value, "esSendNum");
            return (Criteria) this;
        }

        public Criteria andEsSendNumLessThanOrEqualTo(Integer value) {
            addCriterion("es_send_num <=", value, "esSendNum");
            return (Criteria) this;
        }

        public Criteria andEsSendNumIn(List<Integer> values) {
            addCriterion("es_send_num in", values, "esSendNum");
            return (Criteria) this;
        }

        public Criteria andEsSendNumNotIn(List<Integer> values) {
            addCriterion("es_send_num not in", values, "esSendNum");
            return (Criteria) this;
        }

        public Criteria andEsSendNumBetween(Integer value1, Integer value2) {
            addCriterion("es_send_num between", value1, value2, "esSendNum");
            return (Criteria) this;
        }

        public Criteria andEsSendNumNotBetween(Integer value1, Integer value2) {
            addCriterion("es_send_num not between", value1, value2, "esSendNum");
            return (Criteria) this;
        }

        public Criteria andEsResultIsNull() {
            addCriterion("es_result is null");
            return (Criteria) this;
        }

        public Criteria andEsResultIsNotNull() {
            addCriterion("es_result is not null");
            return (Criteria) this;
        }

        public Criteria andEsResultEqualTo(String value) {
            addCriterion("es_result =", value, "esResult");
            return (Criteria) this;
        }

        public Criteria andEsResultNotEqualTo(String value) {
            addCriterion("es_result <>", value, "esResult");
            return (Criteria) this;
        }

        public Criteria andEsResultGreaterThan(String value) {
            addCriterion("es_result >", value, "esResult");
            return (Criteria) this;
        }

        public Criteria andEsResultGreaterThanOrEqualTo(String value) {
            addCriterion("es_result >=", value, "esResult");
            return (Criteria) this;
        }

        public Criteria andEsResultLessThan(String value) {
            addCriterion("es_result <", value, "esResult");
            return (Criteria) this;
        }

        public Criteria andEsResultLessThanOrEqualTo(String value) {
            addCriterion("es_result <=", value, "esResult");
            return (Criteria) this;
        }

        public Criteria andEsResultLike(String value) {
            addCriterion("es_result like", value, "esResult");
            return (Criteria) this;
        }

        public Criteria andEsResultNotLike(String value) {
            addCriterion("es_result not like", value, "esResult");
            return (Criteria) this;
        }

        public Criteria andEsResultIn(List<String> values) {
            addCriterion("es_result in", values, "esResult");
            return (Criteria) this;
        }

        public Criteria andEsResultNotIn(List<String> values) {
            addCriterion("es_result not in", values, "esResult");
            return (Criteria) this;
        }

        public Criteria andEsResultBetween(String value1, String value2) {
            addCriterion("es_result between", value1, value2, "esResult");
            return (Criteria) this;
        }

        public Criteria andEsResultNotBetween(String value1, String value2) {
            addCriterion("es_result not between", value1, value2, "esResult");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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