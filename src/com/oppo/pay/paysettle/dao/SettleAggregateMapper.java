package com.oppo.pay.paysettle.dao;

import com.oppo.pay.paysettle.entity.SettleAggregate;

public interface SettleAggregateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SettleAggregate record);

    int insertSelective(SettleAggregate record);

    SettleAggregate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SettleAggregate record);

    int updateByPrimaryKey(SettleAggregate record);
}