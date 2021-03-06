package com.wyl.tms.model;

import java.util.ArrayList;
import java.util.List;

public class FilmHallInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table film_hall_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table film_hall_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table film_hall_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_hall_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public FilmHallInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_hall_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_hall_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_hall_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_hall_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_hall_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_hall_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_hall_info
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
     * This method corresponds to the database table film_hall_info
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
     * This method corresponds to the database table film_hall_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_hall_info
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
     * This class corresponds to the database table film_hall_info
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

        public Criteria andFilmHallNameIsNull() {
            addCriterion("filmHallName is null");
            return (Criteria) this;
        }

        public Criteria andFilmHallNameIsNotNull() {
            addCriterion("filmHallName is not null");
            return (Criteria) this;
        }

        public Criteria andFilmHallNameEqualTo(String value) {
            addCriterion("filmHallName =", value, "filmHallName");
            return (Criteria) this;
        }

        public Criteria andFilmHallNameNotEqualTo(String value) {
            addCriterion("filmHallName <>", value, "filmHallName");
            return (Criteria) this;
        }

        public Criteria andFilmHallNameGreaterThan(String value) {
            addCriterion("filmHallName >", value, "filmHallName");
            return (Criteria) this;
        }

        public Criteria andFilmHallNameGreaterThanOrEqualTo(String value) {
            addCriterion("filmHallName >=", value, "filmHallName");
            return (Criteria) this;
        }

        public Criteria andFilmHallNameLessThan(String value) {
            addCriterion("filmHallName <", value, "filmHallName");
            return (Criteria) this;
        }

        public Criteria andFilmHallNameLessThanOrEqualTo(String value) {
            addCriterion("filmHallName <=", value, "filmHallName");
            return (Criteria) this;
        }

        public Criteria andFilmHallNameLike(String value) {
            addCriterion("filmHallName like", value, "filmHallName");
            return (Criteria) this;
        }

        public Criteria andFilmHallNameNotLike(String value) {
            addCriterion("filmHallName not like", value, "filmHallName");
            return (Criteria) this;
        }

        public Criteria andFilmHallNameIn(List<String> values) {
            addCriterion("filmHallName in", values, "filmHallName");
            return (Criteria) this;
        }

        public Criteria andFilmHallNameNotIn(List<String> values) {
            addCriterion("filmHallName not in", values, "filmHallName");
            return (Criteria) this;
        }

        public Criteria andFilmHallNameBetween(String value1, String value2) {
            addCriterion("filmHallName between", value1, value2, "filmHallName");
            return (Criteria) this;
        }

        public Criteria andFilmHallNameNotBetween(String value1, String value2) {
            addCriterion("filmHallName not between", value1, value2, "filmHallName");
            return (Criteria) this;
        }

        public Criteria andSeatQuantityIsNull() {
            addCriterion("seatQuantity is null");
            return (Criteria) this;
        }

        public Criteria andSeatQuantityIsNotNull() {
            addCriterion("seatQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andSeatQuantityEqualTo(Integer value) {
            addCriterion("seatQuantity =", value, "seatQuantity");
            return (Criteria) this;
        }

        public Criteria andSeatQuantityNotEqualTo(Integer value) {
            addCriterion("seatQuantity <>", value, "seatQuantity");
            return (Criteria) this;
        }

        public Criteria andSeatQuantityGreaterThan(Integer value) {
            addCriterion("seatQuantity >", value, "seatQuantity");
            return (Criteria) this;
        }

        public Criteria andSeatQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("seatQuantity >=", value, "seatQuantity");
            return (Criteria) this;
        }

        public Criteria andSeatQuantityLessThan(Integer value) {
            addCriterion("seatQuantity <", value, "seatQuantity");
            return (Criteria) this;
        }

        public Criteria andSeatQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("seatQuantity <=", value, "seatQuantity");
            return (Criteria) this;
        }

        public Criteria andSeatQuantityIn(List<Integer> values) {
            addCriterion("seatQuantity in", values, "seatQuantity");
            return (Criteria) this;
        }

        public Criteria andSeatQuantityNotIn(List<Integer> values) {
            addCriterion("seatQuantity not in", values, "seatQuantity");
            return (Criteria) this;
        }

        public Criteria andSeatQuantityBetween(Integer value1, Integer value2) {
            addCriterion("seatQuantity between", value1, value2, "seatQuantity");
            return (Criteria) this;
        }

        public Criteria andSeatQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("seatQuantity not between", value1, value2, "seatQuantity");
            return (Criteria) this;
        }

        public Criteria andTheaterIdIsNull() {
            addCriterion("theaterId is null");
            return (Criteria) this;
        }

        public Criteria andTheaterIdIsNotNull() {
            addCriterion("theaterId is not null");
            return (Criteria) this;
        }

        public Criteria andTheaterIdEqualTo(Integer value) {
            addCriterion("theaterId =", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdNotEqualTo(Integer value) {
            addCriterion("theaterId <>", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdGreaterThan(Integer value) {
            addCriterion("theaterId >", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("theaterId >=", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdLessThan(Integer value) {
            addCriterion("theaterId <", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("theaterId <=", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdIn(List<Integer> values) {
            addCriterion("theaterId in", values, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdNotIn(List<Integer> values) {
            addCriterion("theaterId not in", values, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdBetween(Integer value1, Integer value2) {
            addCriterion("theaterId between", value1, value2, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("theaterId not between", value1, value2, "theaterId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table film_hall_info
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
     * This class corresponds to the database table film_hall_info
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