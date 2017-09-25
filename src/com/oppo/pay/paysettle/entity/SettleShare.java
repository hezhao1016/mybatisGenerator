package com.oppo.pay.paysettle.entity;

import java.util.Date;

public class SettleShare {
    private Long id;

    private Integer userId;

    private String userName;

    private Double ratioRate;

    private Double channelRate;

    private Double shareRatio;

    private Date updateTime;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getRatioRate() {
        return ratioRate;
    }

    public void setRatioRate(Double ratioRate) {
        this.ratioRate = ratioRate;
    }

    public Double getChannelRate() {
        return channelRate;
    }

    public void setChannelRate(Double channelRate) {
        this.channelRate = channelRate;
    }

    public Double getShareRatio() {
        return shareRatio;
    }

    public void setShareRatio(Double shareRatio) {
        this.shareRatio = shareRatio;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}