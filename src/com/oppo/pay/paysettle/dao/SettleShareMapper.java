package com.oppo.pay.paysettle.dao;

import com.oppo.pay.paysettle.entity.SettleShare;

public interface SettleShareMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SettleShare record);

    int insertSelective(SettleShare record);

    SettleShare selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SettleShare record);

    int updateByPrimaryKey(SettleShare record);
}