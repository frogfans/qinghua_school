package com.bigrabbit.qinghua_school.dao;

import com.bigrabbit.qinghua_school.entity.TypeNews;

public interface TypeNewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TypeNews record);

    int insertSelective(TypeNews record);

    TypeNews selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TypeNews record);

    int updateByPrimaryKey(TypeNews record);
}