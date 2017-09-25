package com.oppo.pay.paysettle.dao;

import com.oppo.pay.paysettle.entity.SettleThirdParty;

public interface SettleThirdPartyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SettleThirdParty record);

    int insertSelective(SettleThirdParty record);

    SettleThirdParty selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SettleThirdParty record);

    int updateByPrimaryKey(SettleThirdParty record);
}