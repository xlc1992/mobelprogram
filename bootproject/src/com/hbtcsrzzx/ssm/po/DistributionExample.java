package com.hbtcsrzzx.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DistributionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DistributionExample() {
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

        public Criteria andDistributionLevelIsNull() {
            addCriterion("distribution_level is null");
            return (Criteria) this;
        }

        public Criteria andDistributionLevelIsNotNull() {
            addCriterion("distribution_level is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionLevelEqualTo(String value) {
            addCriterion("distribution_level =", value, "distributionLevel");
            return (Criteria) this;
        }

        public Criteria andDistributionLevelNotEqualTo(String value) {
            addCriterion("distribution_level <>", value, "distributionLevel");
            return (Criteria) this;
        }

        public Criteria andDistributionLevelGreaterThan(String value) {
            addCriterion("distribution_level >", value, "distributionLevel");
            return (Criteria) this;
        }

        public Criteria andDistributionLevelGreaterThanOrEqualTo(String value) {
            addCriterion("distribution_level >=", value, "distributionLevel");
            return (Criteria) this;
        }

        public Criteria andDistributionLevelLessThan(String value) {
            addCriterion("distribution_level <", value, "distributionLevel");
            return (Criteria) this;
        }

        public Criteria andDistributionLevelLessThanOrEqualTo(String value) {
            addCriterion("distribution_level <=", value, "distributionLevel");
            return (Criteria) this;
        }

        public Criteria andDistributionLevelLike(String value) {
            addCriterion("distribution_level like", value, "distributionLevel");
            return (Criteria) this;
        }

        public Criteria andDistributionLevelNotLike(String value) {
            addCriterion("distribution_level not like", value, "distributionLevel");
            return (Criteria) this;
        }

        public Criteria andDistributionLevelIn(List<String> values) {
            addCriterion("distribution_level in", values, "distributionLevel");
            return (Criteria) this;
        }

        public Criteria andDistributionLevelNotIn(List<String> values) {
            addCriterion("distribution_level not in", values, "distributionLevel");
            return (Criteria) this;
        }

        public Criteria andDistributionLevelBetween(String value1, String value2) {
            addCriterion("distribution_level between", value1, value2, "distributionLevel");
            return (Criteria) this;
        }

        public Criteria andDistributionLevelNotBetween(String value1, String value2) {
            addCriterion("distribution_level not between", value1, value2, "distributionLevel");
            return (Criteria) this;
        }

        public Criteria andRecommenderLevelIsNull() {
            addCriterion("recommender_level is null");
            return (Criteria) this;
        }

        public Criteria andRecommenderLevelIsNotNull() {
            addCriterion("recommender_level is not null");
            return (Criteria) this;
        }

        public Criteria andRecommenderLevelEqualTo(String value) {
            addCriterion("recommender_level =", value, "recommenderLevel");
            return (Criteria) this;
        }

        public Criteria andRecommenderLevelNotEqualTo(String value) {
            addCriterion("recommender_level <>", value, "recommenderLevel");
            return (Criteria) this;
        }

        public Criteria andRecommenderLevelGreaterThan(String value) {
            addCriterion("recommender_level >", value, "recommenderLevel");
            return (Criteria) this;
        }

        public Criteria andRecommenderLevelGreaterThanOrEqualTo(String value) {
            addCriterion("recommender_level >=", value, "recommenderLevel");
            return (Criteria) this;
        }

        public Criteria andRecommenderLevelLessThan(String value) {
            addCriterion("recommender_level <", value, "recommenderLevel");
            return (Criteria) this;
        }

        public Criteria andRecommenderLevelLessThanOrEqualTo(String value) {
            addCriterion("recommender_level <=", value, "recommenderLevel");
            return (Criteria) this;
        }

        public Criteria andRecommenderLevelLike(String value) {
            addCriterion("recommender_level like", value, "recommenderLevel");
            return (Criteria) this;
        }

        public Criteria andRecommenderLevelNotLike(String value) {
            addCriterion("recommender_level not like", value, "recommenderLevel");
            return (Criteria) this;
        }

        public Criteria andRecommenderLevelIn(List<String> values) {
            addCriterion("recommender_level in", values, "recommenderLevel");
            return (Criteria) this;
        }

        public Criteria andRecommenderLevelNotIn(List<String> values) {
            addCriterion("recommender_level not in", values, "recommenderLevel");
            return (Criteria) this;
        }

        public Criteria andRecommenderLevelBetween(String value1, String value2) {
            addCriterion("recommender_level between", value1, value2, "recommenderLevel");
            return (Criteria) this;
        }

        public Criteria andRecommenderLevelNotBetween(String value1, String value2) {
            addCriterion("recommender_level not between", value1, value2, "recommenderLevel");
            return (Criteria) this;
        }

        public Criteria andReturnProportionIsNull() {
            addCriterion("return_proportion is null");
            return (Criteria) this;
        }

        public Criteria andReturnProportionIsNotNull() {
            addCriterion("return_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andReturnProportionEqualTo(Integer value) {
            addCriterion("return_proportion =", value, "returnProportion");
            return (Criteria) this;
        }

        public Criteria andReturnProportionNotEqualTo(Integer value) {
            addCriterion("return_proportion <>", value, "returnProportion");
            return (Criteria) this;
        }

        public Criteria andReturnProportionGreaterThan(Integer value) {
            addCriterion("return_proportion >", value, "returnProportion");
            return (Criteria) this;
        }

        public Criteria andReturnProportionGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_proportion >=", value, "returnProportion");
            return (Criteria) this;
        }

        public Criteria andReturnProportionLessThan(Integer value) {
            addCriterion("return_proportion <", value, "returnProportion");
            return (Criteria) this;
        }

        public Criteria andReturnProportionLessThanOrEqualTo(Integer value) {
            addCriterion("return_proportion <=", value, "returnProportion");
            return (Criteria) this;
        }

        public Criteria andReturnProportionIn(List<Integer> values) {
            addCriterion("return_proportion in", values, "returnProportion");
            return (Criteria) this;
        }

        public Criteria andReturnProportionNotIn(List<Integer> values) {
            addCriterion("return_proportion not in", values, "returnProportion");
            return (Criteria) this;
        }

        public Criteria andReturnProportionBetween(Integer value1, Integer value2) {
            addCriterion("return_proportion between", value1, value2, "returnProportion");
            return (Criteria) this;
        }

        public Criteria andReturnProportionNotBetween(Integer value1, Integer value2) {
            addCriterion("return_proportion not between", value1, value2, "returnProportion");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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