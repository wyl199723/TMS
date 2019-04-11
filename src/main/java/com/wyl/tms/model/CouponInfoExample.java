package com.wyl.tms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CouponInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coupon_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coupon_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coupon_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public CouponInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_info
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
     * This method corresponds to the database table coupon_info
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
     * This method corresponds to the database table coupon_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_info
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
     * This class corresponds to the database table coupon_info
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("couponId is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("couponId is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(Integer value) {
            addCriterion("couponId =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(Integer value) {
            addCriterion("couponId <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(Integer value) {
            addCriterion("couponId >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("couponId >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(Integer value) {
            addCriterion("couponId <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(Integer value) {
            addCriterion("couponId <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<Integer> values) {
            addCriterion("couponId in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<Integer> values) {
            addCriterion("couponId not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(Integer value1, Integer value2) {
            addCriterion("couponId between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(Integer value1, Integer value2) {
            addCriterion("couponId not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdIsNull() {
            addCriterion("couponTypeId is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdIsNotNull() {
            addCriterion("couponTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdEqualTo(Integer value) {
            addCriterion("couponTypeId =", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdNotEqualTo(Integer value) {
            addCriterion("couponTypeId <>", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdGreaterThan(Integer value) {
            addCriterion("couponTypeId >", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("couponTypeId >=", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdLessThan(Integer value) {
            addCriterion("couponTypeId <", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("couponTypeId <=", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdIn(List<Integer> values) {
            addCriterion("couponTypeId in", values, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdNotIn(List<Integer> values) {
            addCriterion("couponTypeId not in", values, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("couponTypeId between", value1, value2, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("couponTypeId not between", value1, value2, "couponTypeId");
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

        public Criteria andReceiveDateIsNull() {
            addCriterion("receiveDate is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNotNull() {
            addCriterion("receiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateEqualTo(Date value) {
            addCriterionForJDBCDate("receiveDate =", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("receiveDate <>", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("receiveDate >", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("receiveDate >=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThan(Date value) {
            addCriterionForJDBCDate("receiveDate <", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("receiveDate <=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIn(List<Date> values) {
            addCriterionForJDBCDate("receiveDate in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("receiveDate not in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("receiveDate between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("receiveDate not between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIsNull() {
            addCriterion("invalidDate is null");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIsNotNull() {
            addCriterion("invalidDate is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidDateEqualTo(Date value) {
            addCriterionForJDBCDate("invalidDate =", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("invalidDate <>", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateGreaterThan(Date value) {
            addCriterionForJDBCDate("invalidDate >", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("invalidDate >=", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateLessThan(Date value) {
            addCriterionForJDBCDate("invalidDate <", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("invalidDate <=", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIn(List<Date> values) {
            addCriterionForJDBCDate("invalidDate in", values, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("invalidDate not in", values, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("invalidDate between", value1, value2, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("invalidDate not between", value1, value2, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andCouponStatusIsNull() {
            addCriterion("couponStatus is null");
            return (Criteria) this;
        }

        public Criteria andCouponStatusIsNotNull() {
            addCriterion("couponStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStatusEqualTo(Boolean value) {
            addCriterion("couponStatus =", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotEqualTo(Boolean value) {
            addCriterion("couponStatus <>", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusGreaterThan(Boolean value) {
            addCriterion("couponStatus >", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("couponStatus >=", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusLessThan(Boolean value) {
            addCriterion("couponStatus <", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("couponStatus <=", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusIn(List<Boolean> values) {
            addCriterion("couponStatus in", values, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotIn(List<Boolean> values) {
            addCriterion("couponStatus not in", values, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("couponStatus between", value1, value2, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("couponStatus not between", value1, value2, "couponStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table coupon_info
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
     * This class corresponds to the database table coupon_info
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