package com.wyl.tms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserFilmOrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_film_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_film_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_film_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_film_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public UserFilmOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_film_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_film_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_film_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_film_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_film_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_film_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_film_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_film_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_film_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_film_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_film_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
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

        public Criteria andFilmOrderIdIsNull() {
            addCriterion("filmOrderId is null");
            return (Criteria) this;
        }

        public Criteria andFilmOrderIdIsNotNull() {
            addCriterion("filmOrderId is not null");
            return (Criteria) this;
        }

        public Criteria andFilmOrderIdEqualTo(Integer value) {
            addCriterion("filmOrderId =", value, "filmOrderId");
            return (Criteria) this;
        }

        public Criteria andFilmOrderIdNotEqualTo(Integer value) {
            addCriterion("filmOrderId <>", value, "filmOrderId");
            return (Criteria) this;
        }

        public Criteria andFilmOrderIdGreaterThan(Integer value) {
            addCriterion("filmOrderId >", value, "filmOrderId");
            return (Criteria) this;
        }

        public Criteria andFilmOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("filmOrderId >=", value, "filmOrderId");
            return (Criteria) this;
        }

        public Criteria andFilmOrderIdLessThan(Integer value) {
            addCriterion("filmOrderId <", value, "filmOrderId");
            return (Criteria) this;
        }

        public Criteria andFilmOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("filmOrderId <=", value, "filmOrderId");
            return (Criteria) this;
        }

        public Criteria andFilmOrderIdIn(List<Integer> values) {
            addCriterion("filmOrderId in", values, "filmOrderId");
            return (Criteria) this;
        }

        public Criteria andFilmOrderIdNotIn(List<Integer> values) {
            addCriterion("filmOrderId not in", values, "filmOrderId");
            return (Criteria) this;
        }

        public Criteria andFilmOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("filmOrderId between", value1, value2, "filmOrderId");
            return (Criteria) this;
        }

        public Criteria andFilmOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("filmOrderId not between", value1, value2, "filmOrderId");
            return (Criteria) this;
        }

        public Criteria andArrangementIdIsNull() {
            addCriterion("arrangementId is null");
            return (Criteria) this;
        }

        public Criteria andArrangementIdIsNotNull() {
            addCriterion("arrangementId is not null");
            return (Criteria) this;
        }

        public Criteria andArrangementIdEqualTo(Integer value) {
            addCriterion("arrangementId =", value, "arrangementId");
            return (Criteria) this;
        }

        public Criteria andArrangementIdNotEqualTo(Integer value) {
            addCriterion("arrangementId <>", value, "arrangementId");
            return (Criteria) this;
        }

        public Criteria andArrangementIdGreaterThan(Integer value) {
            addCriterion("arrangementId >", value, "arrangementId");
            return (Criteria) this;
        }

        public Criteria andArrangementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("arrangementId >=", value, "arrangementId");
            return (Criteria) this;
        }

        public Criteria andArrangementIdLessThan(Integer value) {
            addCriterion("arrangementId <", value, "arrangementId");
            return (Criteria) this;
        }

        public Criteria andArrangementIdLessThanOrEqualTo(Integer value) {
            addCriterion("arrangementId <=", value, "arrangementId");
            return (Criteria) this;
        }

        public Criteria andArrangementIdIn(List<Integer> values) {
            addCriterion("arrangementId in", values, "arrangementId");
            return (Criteria) this;
        }

        public Criteria andArrangementIdNotIn(List<Integer> values) {
            addCriterion("arrangementId not in", values, "arrangementId");
            return (Criteria) this;
        }

        public Criteria andArrangementIdBetween(Integer value1, Integer value2) {
            addCriterion("arrangementId between", value1, value2, "arrangementId");
            return (Criteria) this;
        }

        public Criteria andArrangementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("arrangementId not between", value1, value2, "arrangementId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("userId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("userId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("userId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("userId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdIsNull() {
            addCriterion("parentOrderId is null");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdIsNotNull() {
            addCriterion("parentOrderId is not null");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdEqualTo(Integer value) {
            addCriterion("parentOrderId =", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdNotEqualTo(Integer value) {
            addCriterion("parentOrderId <>", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdGreaterThan(Integer value) {
            addCriterion("parentOrderId >", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentOrderId >=", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdLessThan(Integer value) {
            addCriterion("parentOrderId <", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("parentOrderId <=", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdIn(List<Integer> values) {
            addCriterion("parentOrderId in", values, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdNotIn(List<Integer> values) {
            addCriterion("parentOrderId not in", values, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("parentOrderId between", value1, value2, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parentOrderId not between", value1, value2, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andSeatIdIsNull() {
            addCriterion("seatId is null");
            return (Criteria) this;
        }

        public Criteria andSeatIdIsNotNull() {
            addCriterion("seatId is not null");
            return (Criteria) this;
        }

        public Criteria andSeatIdEqualTo(Integer value) {
            addCriterion("seatId =", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotEqualTo(Integer value) {
            addCriterion("seatId <>", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThan(Integer value) {
            addCriterion("seatId >", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seatId >=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThan(Integer value) {
            addCriterion("seatId <", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThanOrEqualTo(Integer value) {
            addCriterion("seatId <=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdIn(List<Integer> values) {
            addCriterion("seatId in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotIn(List<Integer> values) {
            addCriterion("seatId not in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdBetween(Integer value1, Integer value2) {
            addCriterion("seatId between", value1, value2, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seatId not between", value1, value2, "seatId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("orderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("orderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Boolean value) {
            addCriterion("orderStatus =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Boolean value) {
            addCriterion("orderStatus <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Boolean value) {
            addCriterion("orderStatus >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("orderStatus >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Boolean value) {
            addCriterion("orderStatus <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("orderStatus <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Boolean> values) {
            addCriterion("orderStatus in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Boolean> values) {
            addCriterion("orderStatus not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("orderStatus between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("orderStatus not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("createdTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("createdTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("createdTime =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("createdTime <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("createdTime >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createdTime >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("createdTime <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("createdTime <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("createdTime in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("createdTime not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("createdTime between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("createdTime not between", value1, value2, "createdTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_film_order
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 10 11:04:15 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_film_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
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