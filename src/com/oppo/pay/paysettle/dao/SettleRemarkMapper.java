package com.oppo.pay.paysettle.dao;

import com.oppo.pay.paysettle.entity.SettleRemark;

public interface SettleRemarkMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SettleRemark record);

    int insertSelective(SettleRemark record);

    SettleRemark selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SettleRemark record);

    int updateByPrimaryKey(SettleRemark record);
}