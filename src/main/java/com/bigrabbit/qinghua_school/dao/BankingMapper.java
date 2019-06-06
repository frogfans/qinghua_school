package com.bigrabbit.qinghua_school.dao;

import com.bigrabbit.qinghua_school.entity.Banking;

public interface BankingMapper {
    int deleteByPrimaryKey(Integer bid);

    int insert(Banking record);

    int insertSelective(Banking record);

    Banking selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Banking record);

    int updateByPrimaryKeyWithBLOBs(Banking record);

    int updateByPrimaryKey(Banking record);
}