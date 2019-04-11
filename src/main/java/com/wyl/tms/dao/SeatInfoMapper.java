package com.wyl.tms.dao;

import com.wyl.tms.model.SeatInfo;
import com.wyl.tms.model.SeatInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeatInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    long countByExample(SeatInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int deleteByExample(SeatInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int deleteByPrimaryKey(Integer seatId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int insert(SeatInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int insertSelective(SeatInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    List<SeatInfo> selectByExample(SeatInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    SeatInfo selectByPrimaryKey(Integer seatId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") SeatInfo record, @Param("example") SeatInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByExample(@Param("record") SeatInfo record, @Param("example") SeatInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByPrimaryKeySelective(SeatInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByPrimaryKey(SeatInfo record);
}