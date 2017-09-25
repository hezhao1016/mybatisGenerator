package com.oppo.pay.paysettle.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SettleDetail {
    private Long id;

    private String orderNum;

    private Integer userId;

    private Date buyTime;

    private Long price;

    private String productName;

    private String payChannel;

    private BigDecimal channelCost;

    private Double channelRate;

    private BigDecimal platformCost;

    private Double platformRate;

    private Integer buyCount;

    private Double shareRatio;

    private Date createTime;

    private String innerOrderNum;

    private Integer payDevelopId;

    private String packageName;

    private Byte orderType;

    private String appName;

    private String appVersion;

    private BigDecimal realIncome;

    private Double ratioRate;

    private BigDecimal ratioCost;

    private Long notClear;

    private Long clearAmount;

    private Byte refund;

    private Integer mchtId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public BigDecimal getChannelCost() {
        return channelCost;
    }

    public void setChannelCost(BigDecimal channelCost) {
        this.channelCost = channelCost;
    }

    public Double getChannelRate() {
        return channelRate;
    }

    public void setChannelRate(Double channelRate) {
        this.channelRate = channelRate;
    }

    public BigDecimal getPlatformCost() {
        return platformCost;
    }

    public void setPlatformCost(BigDecimal platformCost) {
        this.platformCost = platformCost;
    }

    public Double getPlatformRate() {
        return platformRate;
    }

    public void setPlatformRate(Double platformRate) {
        this.platformRate = platformRate;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public Double getShareRatio() {
        return shareRatio;
    }

    public void setShareRatio(Double shareRatio) {
        this.shareRatio = shareRatio;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getInnerOrderNum() {
        return innerOrderNum;
    }

    public void setInnerOrderNum(String innerOrderNum) {
        this.innerOrderNum = innerOrderNum;
    }

    public Integer getPayDevelopId() {
        return payDevelopId;
    }

    public void setPayDevelopId(Integer payDevelopId) {
        this.payDevelopId = payDevelopId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Byte getOrderType() {
        return orderType;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public BigDecimal getRealIncome() {
        return realIncome;
    }

    public void setRealIncome(BigDecimal realIncome) {
        this.realIncome = realIncome;
    }

    public Double getRatioRate() {
        return ratioRate;
    }

    public void setRatioRate(Double ratioRate) {
        this.ratioRate = ratioRate;
    }

    public BigDecimal getRatioCost() {
        return ratioCost;
    }

    public void setRatioCost(BigDecimal ratioCost) {
        this.ratioCost = ratioCost;
    }

    public Long getNotClear() {
        return notClear;
    }

    public void setNotClear(Long notClear) {
        this.notClear = notClear;
    }

    public Long getClearAmount() {
        return clearAmount;
    }

    public void setClearAmount(Long clearAmount) {
        this.clearAmount = clearAmount;
    }

    public Byte getRefund() {
        return refund;
    }

    public void setRefund(Byte refund) {
        this.refund = refund;
    }

    public Integer getMchtId() {
        return mchtId;
    }

    public void setMchtId(Integer mchtId) {
        this.mchtId = mchtId;
    }
}