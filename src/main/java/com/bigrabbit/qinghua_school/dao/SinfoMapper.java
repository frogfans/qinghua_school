package com.bigrabbit.qinghua_school.dao;

import com.bigrabbit.qinghua_school.entity.Sinfo;

public interface SinfoMapper {
    int deleteByPrimaryKey(Integer infoid);

    int insert(Sinfo record);

    int insertSelective(Sinfo record);

    Sinfo selectByPrimaryKey(Integer infoid);

    int updateByPrimaryKeySelective(Sinfo record);

    int updateByPrimaryKey(Sinfo record);
}