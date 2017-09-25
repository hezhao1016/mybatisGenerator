package com.oppo.pay.paysettle.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SettleAggregate {
    private Long id;

    private Integer userId;

    private String settleMonth;

    private Long price;

    private BigDecimal channelCost;

    private BigDecimal platformCost;

    private BigDecimal realIncome;

    private Date createTime;

    private Byte status;

    private String adminId;

    private Date operationTime;

    private BigDecimal tenpay;

    private BigDecimal alipay;

    private BigDecimal yeepay;

    private String note;

    private Date submitClearTime;

    private Date updateTime;

    private BigDecimal tenpayIncome;

    private BigDecimal alipayIncome;

    private BigDecimal yeepayIncome;

    private BigDecimal yeepayPlugin;

    private BigDecimal yeepayPluginIncome;

    private BigDecimal szpay;

    private BigDecimal szpayIncome;

    private Byte orderType;

    private BigDecimal smspay;

    private BigDecimal smspayIncome;

    private BigDecimal ratioCost;

    private BigDecimal notClear;

    private String userName;

    private Byte userType;

    private Date checkTime;

    private BigDecimal clearAmount;

    private Long refundAmount;

    private BigDecimal dnapay;

    private BigDecimal dnapayIncome;

    private BigDecimal bankpay;

    private BigDecimal bankpayIncome;

    private BigDecimal pay19pay;

    private BigDecimal pay19payIncome;

    private BigDecimal kebipay;

    private BigDecimal kebipayIncome;

    private BigDecimal nbpay;

    private BigDecimal nbpayIncome;

    private BigDecimal mo9pay;

    private BigDecimal mo9payIncome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSettleMonth() {
        return settleMonth;
    }

    public void setSettleMonth(String settleMonth) {
        this.settleMonth = settleMonth;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public BigDecimal getChannelCost() {
        return channelCost;
    }

    public void setChannelCost(BigDecimal channelCost) {
        this.channelCost = channelCost;
    }

    public BigDecimal getPlatformCost() {
        return platformCost;
    }

    public void setPlatformCost(BigDecimal platformCost) {
        this.platformCost = platformCost;
    }

    public BigDecimal getRealIncome() {
        return realIncome;
    }

    public void setRealIncome(BigDecimal realIncome) {
        this.realIncome = realIncome;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public BigDecimal getTenpay() {
        return tenpay;
    }

    public void setTenpay(BigDecimal tenpay) {
        this.tenpay = tenpay;
    }

    public BigDecimal getAlipay() {
        return alipay;
    }

    public void setAlipay(BigDecimal alipay) {
        this.alipay = alipay;
    }

    public BigDecimal getYeepay() {
        return yeepay;
    }

    public void setYeepay(BigDecimal yeepay) {
        this.yeepay = yeepay;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getSubmitClearTime() {
        return submitClearTime;
    }

    public void setSubmitClearTime(Date submitClearTime) {
        this.submitClearTime = submitClearTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getTenpayIncome() {
        return tenpayIncome;
    }

    public void setTenpayIncome(BigDecimal tenpayIncome) {
        this.tenpayIncome = tenpayIncome;
    }

    public BigDecimal getAlipayIncome() {
        return alipayIncome;
    }

    public void setAlipayIncome(BigDecimal alipayIncome) {
        this.alipayIncome = alipayIncome;
    }

    public BigDecimal getYeepayIncome() {
        return yeepayIncome;
    }

    public void setYeepayIncome(BigDecimal yeepayIncome) {
        this.yeepayIncome = yeepayIncome;
    }

    public BigDecimal getYeepayPlugin() {
        return yeepayPlugin;
    }

    public void setYeepayPlugin(BigDecimal yeepayPlugin) {
        this.yeepayPlugin = yeepayPlugin;
    }

    public BigDecimal getYeepayPluginIncome() {
        return yeepayPluginIncome;
    }

    public void setYeepayPluginIncome(BigDecimal yeepayPluginIncome) {
        this.yeepayPluginIncome = yeepayPluginIncome;
    }

    public BigDecimal getSzpay() {
        return szpay;
    }

    public void setSzpay(BigDecimal szpay) {
        this.szpay = szpay;
    }

    public BigDecimal getSzpayIncome() {
        return szpayIncome;
    }

    public void setSzpayIncome(BigDecimal szpayIncome) {
        this.szpayIncome = szpayIncome;
    }

    public Byte getOrderType() {
        return orderType;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    public BigDecimal getSmspay() {
        return smspay;
    }

    public void setSmspay(BigDecimal smspay) {
        this.smspay = smspay;
    }

    public BigDecimal getSmspayIncome() {
        return smspayIncome;
    }

    public void setSmspayIncome(BigDecimal smspayIncome) {
        this.smspayIncome = smspayIncome;
    }

    public BigDecimal getRatioCost() {
        return ratioCost;
    }

    public void setRatioCost(BigDecimal ratioCost) {
        this.ratioCost = ratioCost;
    }

    public BigDecimal getNotClear() {
        return notClear;
    }

    public void setNotClear(BigDecimal notClear) {
        this.notClear = notClear;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public BigDecimal getClearAmount() {
        return clearAmount;
    }

    public void setClearAmount(BigDecimal clearAmount) {
        this.clearAmount = clearAmount;
    }

    public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    public BigDecimal getDnapay() {
        return dnapay;
    }

    public void setDnapay(BigDecimal dnapay) {
        this.dnapay = dnapay;
    }

    public BigDecimal getDnapayIncome() {
        return dnapayIncome;
    }

    public void setDnapayIncome(BigDecimal dnapayIncome) {
        this.dnapayIncome = dnapayIncome;
    }

    public BigDecimal getBankpay() {
        return bankpay;
    }

    public void setBankpay(BigDecimal bankpay) {
        this.bankpay = bankpay;
    }

    public BigDecimal getBankpayIncome() {
        return bankpayIncome;
    }

    public void setBankpayIncome(BigDecimal bankpayIncome) {
        this.bankpayIncome = bankpayIncome;
    }

    public BigDecimal getPay19pay() {
        return pay19pay;
    }

    public void setPay19pay(BigDecimal pay19pay) {
        this.pay19pay = pay19pay;
    }

    public BigDecimal getPay19payIncome() {
        return pay19payIncome;
    }

    public void setPay19payIncome(BigDecimal pay19payIncome) {
        this.pay19payIncome = pay19payIncome;
    }

    public BigDecimal getKebipay() {
        return kebipay;
    }

    public void setKebipay(BigDecimal kebipay) {
        this.kebipay = kebipay;
    }

    public BigDecimal getKebipayIncome() {
        return kebipayIncome;
    }

    public void setKebipayIncome(BigDecimal kebipayIncome) {
        this.kebipayIncome = kebipayIncome;
    }

    public BigDecimal getNbpay() {
        return nbpay;
    }

    public void setNbpay(BigDecimal nbpay) {
        this.nbpay = nbpay;
    }

    public BigDecimal getNbpayIncome() {
        return nbpayIncome;
    }

    public void setNbpayIncome(BigDecimal nbpayIncome) {
        this.nbpayIncome = nbpayIncome;
    }

    public BigDecimal getMo9pay() {
        return mo9pay;
    }

    public void setMo9pay(BigDecimal mo9pay) {
        this.mo9pay = mo9pay;
    }

    public BigDecimal getMo9payIncome() {
        return mo9payIncome;
    }

    public void setMo9payIncome(BigDecimal mo9payIncome) {
        this.mo9payIncome = mo9payIncome;
    }
}