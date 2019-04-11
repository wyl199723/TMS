package com.wyl.tms.dao;

import com.wyl.tms.model.TheaterInfo;
import com.wyl.tms.model.TheaterInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TheaterInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    long countByExample(TheaterInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int deleteByExample(TheaterInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int deleteByPrimaryKey(Integer theaterId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int insert(TheaterInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int insertSelective(TheaterInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    List<TheaterInfo> selectByExample(TheaterInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    TheaterInfo selectByPrimaryKey(Integer theaterId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") TheaterInfo record, @Param("example") TheaterInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByExample(@Param("record") TheaterInfo record, @Param("example") TheaterInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByPrimaryKeySelective(TheaterInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByPrimaryKey(TheaterInfo record);
}