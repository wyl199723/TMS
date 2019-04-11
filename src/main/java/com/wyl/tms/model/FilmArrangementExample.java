package com.wyl.tms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FilmArrangementExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table film_arrangement
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table film_arrangement
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table film_arrangement
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_arrangement
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public FilmArrangementExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_arrangement
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_arrangement
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_arrangement
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_arrangement
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_arrangement
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_arrangement
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_arrangement
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
     * This method corresponds to the database table film_arrangement
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
     * This method corresponds to the database table film_arrangement
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_arrangement
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
     * This class corresponds to the database table film_arrangement
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

        public Criteria andFilmIdIsNull() {
            addCriterion("filmId is null");
            return (Criteria) this;
        }

        public Criteria andFilmIdIsNotNull() {
            addCriterion("filmId is not null");
            return (Criteria) this;
        }

        public Criteria andFilmIdEqualTo(Integer value) {
            addCriterion("filmId =", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotEqualTo(Integer value) {
            addCriterion("filmId <>", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdGreaterThan(Integer value) {
            addCriterion("filmId >", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("filmId >=", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdLessThan(Integer value) {
            addCriterion("filmId <", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdLessThanOrEqualTo(Integer value) {
            addCriterion("filmId <=", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdIn(List<Integer> values) {
            addCriterion("filmId in", values, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotIn(List<Integer> values) {
            addCriterion("filmId not in", values, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdBetween(Integer value1, Integer value2) {
            addCriterion("filmId between", value1, value2, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("filmId not between", value1, value2, "filmId");
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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table film_arrangement
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
     * This class corresponds to the database table film_arrangement
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