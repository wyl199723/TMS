package com.wyl.tms.model;

import java.util.ArrayList;
import java.util.List;

public class SeatInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public SeatInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
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
     * This method corresponds to the database table seat_info
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
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
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
     * This class corresponds to the database table seat_info
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

        public Criteria andFilmHallNumberIsNull() {
            addCriterion("filmHallNumber is null");
            return (Criteria) this;
        }

        public Criteria andFilmHallNumberIsNotNull() {
            addCriterion("filmHallNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFilmHallNumberEqualTo(Integer value) {
            addCriterion("filmHallNumber =", value, "filmHallNumber");
            return (Criteria) this;
        }

        public Criteria andFilmHallNumberNotEqualTo(Integer value) {
            addCriterion("filmHallNumber <>", value, "filmHallNumber");
            return (Criteria) this;
        }

        public Criteria andFilmHallNumberGreaterThan(Integer value) {
            addCriterion("filmHallNumber >", value, "filmHallNumber");
            return (Criteria) this;
        }

        public Criteria andFilmHallNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("filmHallNumber >=", value, "filmHallNumber");
            return (Criteria) this;
        }

        public Criteria andFilmHallNumberLessThan(Integer value) {
            addCriterion("filmHallNumber <", value, "filmHallNumber");
            return (Criteria) this;
        }

        public Criteria andFilmHallNumberLessThanOrEqualTo(Integer value) {
            addCriterion("filmHallNumber <=", value, "filmHallNumber");
            return (Criteria) this;
        }

        public Criteria andFilmHallNumberIn(List<Integer> values) {
            addCriterion("filmHallNumber in", values, "filmHallNumber");
            return (Criteria) this;
        }

        public Criteria andFilmHallNumberNotIn(List<Integer> values) {
            addCriterion("filmHallNumber not in", values, "filmHallNumber");
            return (Criteria) this;
        }

        public Criteria andFilmHallNumberBetween(Integer value1, Integer value2) {
            addCriterion("filmHallNumber between", value1, value2, "filmHallNumber");
            return (Criteria) this;
        }

        public Criteria andFilmHallNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("filmHallNumber not between", value1, value2, "filmHallNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNull() {
            addCriterion("sequence is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull() {
            addCriterion("sequence is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(Integer value) {
            addCriterion("sequence =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(Integer value) {
            addCriterion("sequence <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(Integer value) {
            addCriterion("sequence >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("sequence >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(Integer value) {
            addCriterion("sequence <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("sequence <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(List<Integer> values) {
            addCriterion("sequence in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(List<Integer> values) {
            addCriterion("sequence not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(Integer value1, Integer value2) {
            addCriterion("sequence between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("sequence not between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSeatRowIsNull() {
            addCriterion("seatRow is null");
            return (Criteria) this;
        }

        public Criteria andSeatRowIsNotNull() {
            addCriterion("seatRow is not null");
            return (Criteria) this;
        }

        public Criteria andSeatRowEqualTo(Boolean value) {
            addCriterion("seatRow =", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowNotEqualTo(Boolean value) {
            addCriterion("seatRow <>", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowGreaterThan(Boolean value) {
            addCriterion("seatRow >", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("seatRow >=", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowLessThan(Boolean value) {
            addCriterion("seatRow <", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowLessThanOrEqualTo(Boolean value) {
            addCriterion("seatRow <=", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowIn(List<Boolean> values) {
            addCriterion("seatRow in", values, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowNotIn(List<Boolean> values) {
            addCriterion("seatRow not in", values, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowBetween(Boolean value1, Boolean value2) {
            addCriterion("seatRow between", value1, value2, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("seatRow not between", value1, value2, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatColumnIsNull() {
            addCriterion("seatColumn is null");
            return (Criteria) this;
        }

        public Criteria andSeatColumnIsNotNull() {
            addCriterion("seatColumn is not null");
            return (Criteria) this;
        }

        public Criteria andSeatColumnEqualTo(Boolean value) {
            addCriterion("seatColumn =", value, "seatColumn");
            return (Criteria) this;
        }

        public Criteria andSeatColumnNotEqualTo(Boolean value) {
            addCriterion("seatColumn <>", value, "seatColumn");
            return (Criteria) this;
        }

        public Criteria andSeatColumnGreaterThan(Boolean value) {
            addCriterion("seatColumn >", value, "seatColumn");
            return (Criteria) this;
        }

        public Criteria andSeatColumnGreaterThanOrEqualTo(Boolean value) {
            addCriterion("seatColumn >=", value, "seatColumn");
            return (Criteria) this;
        }

        public Criteria andSeatColumnLessThan(Boolean value) {
            addCriterion("seatColumn <", value, "seatColumn");
            return (Criteria) this;
        }

        public Criteria andSeatColumnLessThanOrEqualTo(Boolean value) {
            addCriterion("seatColumn <=", value, "seatColumn");
            return (Criteria) this;
        }

        public Criteria andSeatColumnIn(List<Boolean> values) {
            addCriterion("seatColumn in", values, "seatColumn");
            return (Criteria) this;
        }

        public Criteria andSeatColumnNotIn(List<Boolean> values) {
            addCriterion("seatColumn not in", values, "seatColumn");
            return (Criteria) this;
        }

        public Criteria andSeatColumnBetween(Boolean value1, Boolean value2) {
            addCriterion("seatColumn between", value1, value2, "seatColumn");
            return (Criteria) this;
        }

        public Criteria andSeatColumnNotBetween(Boolean value1, Boolean value2) {
            addCriterion("seatColumn not between", value1, value2, "seatColumn");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNull() {
            addCriterion("isEnabled is null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNotNull() {
            addCriterion("isEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledEqualTo(Boolean value) {
            addCriterion("isEnabled =", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotEqualTo(Boolean value) {
            addCriterion("isEnabled <>", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThan(Boolean value) {
            addCriterion("isEnabled >", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isEnabled >=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThan(Boolean value) {
            addCriterion("isEnabled <", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("isEnabled <=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIn(List<Boolean> values) {
            addCriterion("isEnabled in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotIn(List<Boolean> values) {
            addCriterion("isEnabled not in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("isEnabled between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isEnabled not between", value1, value2, "isEnabled");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table seat_info
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
     * This class corresponds to the database table seat_info
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