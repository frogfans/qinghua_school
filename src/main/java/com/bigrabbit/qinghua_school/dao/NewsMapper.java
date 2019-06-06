package com.bigrabbit.qinghua_school.dao;

import com.bigrabbit.qinghua_school.entity.News;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer nid);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
}