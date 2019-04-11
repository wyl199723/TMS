package com.wyl.tms.dao;

import com.wyl.tms.model.UserTheaterInfo;
import com.wyl.tms.model.UserTheaterInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTheaterInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    long countByExample(UserTheaterInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int deleteByExample(UserTheaterInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int deleteByPrimaryKey(Integer userTheaterInfoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int insert(UserTheaterInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int insertSelective(UserTheaterInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    List<UserTheaterInfo> selectByExample(UserTheaterInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    UserTheaterInfo selectByPrimaryKey(Integer userTheaterInfoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserTheaterInfo record, @Param("example") UserTheaterInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByExample(@Param("record") UserTheaterInfo record, @Param("example") UserTheaterInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByPrimaryKeySelective(UserTheaterInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_theater_info
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByPrimaryKey(UserTheaterInfo record);
}