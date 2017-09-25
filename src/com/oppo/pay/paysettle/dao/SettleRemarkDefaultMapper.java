package com.oppo.pay.paysettle.dao;

import com.oppo.pay.paysettle.entity.SettleRemarkDefault;

public interface SettleRemarkDefaultMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SettleRemarkDefault record);

    int insertSelective(SettleRemarkDefault record);

    SettleRemarkDefault selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SettleRemarkDefault record);

    int updateByPrimaryKey(SettleRemarkDefault record);
}