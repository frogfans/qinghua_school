package com.bigrabbit.qinghua_school.dao;

import com.bigrabbit.qinghua_school.entity.ZiChan;

import java.util.List;

public interface ZiChanMapper {

    int deleteByPrimaryKey(Integer zid);

    int insert(ZiChan record);

    int insertSelective(ZiChan record);

    ZiChan selectByPrimaryKey(Integer zid);

    int updateByPrimaryKeySelective(ZiChan record);

    int updateByPrimaryKeyWithBLOBs(ZiChan record);

    int updateByPrimaryKey(ZiChan record);

    public List<ZiChan> findAll();
}