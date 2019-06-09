package com.bigrabbit.qinghua_school.dao;

import com.bigrabbit.qinghua_school.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface NewsMapper {
    int deleteByPrimaryKey(Integer nid);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    public List<News> findIndexAndSize(@Param("mid") int mid,@Param("index") int index,@Param("size") int size);

    public int count(int mid);
}