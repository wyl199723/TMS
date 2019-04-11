package com.wyl.tms.model;

public class GoodsInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_info.goodsId
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_info.theaterId
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    private Integer theaterId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_info.goodsName
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    private String goodsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_info.goodsType
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    private Boolean goodsType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_info.goodsDescription
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    private String goodsDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_info.goodsPrice
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    private Double goodsPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_info.goodsPictureURL
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    private String goodsPictureURL;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_info.goodsId
     *
     * @return the value of goods_info.goodsId
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_info.goodsId
     *
     * @param goodsId the value for goods_info.goodsId
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_info.theaterId
     *
     * @return the value of goods_info.theaterId
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public Integer getTheaterId() {
        return theaterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_info.theaterId
     *
     * @param theaterId the value for goods_info.theaterId
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setTheaterId(Integer theaterId) {
        this.theaterId = theaterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_info.goodsName
     *
     * @return the value of goods_info.goodsName
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_info.goodsName
     *
     * @param goodsName the value for goods_info.goodsName
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_info.goodsType
     *
     * @return the value of goods_info.goodsType
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public Boolean getGoodsType() {
        return goodsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_info.goodsType
     *
     * @param goodsType the value for goods_info.goodsType
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setGoodsType(Boolean goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_info.goodsDescription
     *
     * @return the value of goods_info.goodsDescription
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_info.goodsDescription
     *
     * @param goodsDescription the value for goods_info.goodsDescription
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription == null ? null : goodsDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_info.goodsPrice
     *
     * @return the value of goods_info.goodsPrice
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public Double getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_info.goodsPrice
     *
     * @param goodsPrice the value for goods_info.goodsPrice
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_info.goodsPictureURL
     *
     * @return the value of goods_info.goodsPictureURL
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public String getGoodsPictureURL() {
        return goodsPictureURL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_info.goodsPictureURL
     *
     * @param goodsPictureURL the value for goods_info.goodsPictureURL
     *
     * @mbg.generated Wed Apr 10 11:04:15 CST 2019
     */
    public void setGoodsPictureURL(String goodsPictureURL) {
        this.goodsPictureURL = goodsPictureURL == null ? null : goodsPictureURL.trim();
    }
}