package com.wyl.tms.dao;

import com.wyl.tms.model.UserGoodsOrder;
import com.wyl.tms.model.UserGoodsOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGoodsOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_goods_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    long countByExample(UserGoodsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_goods_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int deleteByExample(UserGoodsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_goods_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int deleteByPrimaryKey(Integer goodsOrderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_goods_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int insert(UserGoodsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_goods_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int insertSelective(UserGoodsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_goods_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    List<UserGoodsOrder> selectByExample(UserGoodsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_goods_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    UserGoodsOrder selectByPrimaryKey(Integer goodsOrderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_goods_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserGoodsOrder record, @Param("example") UserGoodsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_goods_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByExample(@Param("record") UserGoodsOrder record, @Param("example") UserGoodsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_goods_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByPrimaryKeySelective(UserGoodsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_goods_order
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    int updateByPrimaryKey(UserGoodsOrder record);
}