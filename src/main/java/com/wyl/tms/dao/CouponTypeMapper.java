package com.wyl.tms.dao;

import com.wyl.tms.model.CouponType;
import com.wyl.tms.model.CouponTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_type
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    long countByExample(CouponTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_type
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int deleteByExample(CouponTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_type
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int deleteByPrimaryKey(Integer couponTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_type
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int insert(CouponType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_type
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int insertSelective(CouponType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_type
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    List<CouponType> selectByExample(CouponTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_type
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    CouponType selectByPrimaryKey(Integer couponTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_type
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") CouponType record, @Param("example") CouponTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_type
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByExample(@Param("record") CouponType record, @Param("example") CouponTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_type
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByPrimaryKeySelective(CouponType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_type
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByPrimaryKey(CouponType record);
}