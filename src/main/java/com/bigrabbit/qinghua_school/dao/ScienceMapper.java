package com.bigrabbit.qinghua_school.dao;

import com.bigrabbit.qinghua_school.entity.Science;

public interface ScienceMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Science record);

    int insertSelective(Science record);

    Science selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Science record);

    int updateByPrimaryKey(Science record);
}