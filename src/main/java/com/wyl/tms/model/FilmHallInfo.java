package com.wyl.tms.model;

public class FilmHallInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_hall_info.filmHallNumber
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    private Integer filmHallNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_hall_info.filmHallName
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    private String filmHallName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_hall_info.seatQuantity
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    private Integer seatQuantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_hall_info.theaterId
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    private Integer theaterId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_hall_info.filmHallNumber
     *
     * @return the value of film_hall_info.filmHallNumber
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public Integer getFilmHallNumber() {
        return filmHallNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_hall_info.filmHallNumber
     *
     * @param filmHallNumber the value for film_hall_info.filmHallNumber
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setFilmHallNumber(Integer filmHallNumber) {
        this.filmHallNumber = filmHallNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_hall_info.filmHallName
     *
     * @return the value of film_hall_info.filmHallName
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public String getFilmHallName() {
        return filmHallName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_hall_info.filmHallName
     *
     * @param filmHallName the value for film_hall_info.filmHallName
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setFilmHallName(String filmHallName) {
        this.filmHallName = filmHallName == null ? null : filmHallName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_hall_info.seatQuantity
     *
     * @return the value of film_hall_info.seatQuantity
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public Integer getSeatQuantity() {
        return seatQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_hall_info.seatQuantity
     *
     * @param seatQuantity the value for film_hall_info.seatQuantity
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setSeatQuantity(Integer seatQuantity) {
        this.seatQuantity = seatQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_hall_info.theaterId
     *
     * @return the value of film_hall_info.theaterId
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public Integer getTheaterId() {
        return theaterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_hall_info.theaterId
     *
     * @param theaterId the value for film_hall_info.theaterId
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setTheaterId(Integer theaterId) {
        this.theaterId = theaterId;
    }
}