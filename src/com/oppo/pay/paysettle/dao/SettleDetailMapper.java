package com.oppo.pay.paysettle.dao;

import com.oppo.pay.paysettle.entity.SettleDetail;

public interface SettleDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SettleDetail record);

    int insertSelective(SettleDetail record);

    SettleDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SettleDetail record);

    int updateByPrimaryKey(SettleDetail record);
}