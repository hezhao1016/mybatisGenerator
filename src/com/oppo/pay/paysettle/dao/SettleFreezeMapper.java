package com.oppo.pay.paysettle.dao;

import com.oppo.pay.paysettle.entity.SettleFreeze;

public interface SettleFreezeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SettleFreeze record);

    int insertSelective(SettleFreeze record);

    SettleFreeze selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SettleFreeze record);

    int updateByPrimaryKey(SettleFreeze record);
}