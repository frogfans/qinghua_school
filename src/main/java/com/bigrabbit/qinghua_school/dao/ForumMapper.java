package com.bigrabbit.qinghua_school.dao;

import com.bigrabbit.qinghua_school.entity.Forum;

import java.util.List;

public interface ForumMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Forum record);

    int insertSelective(Forum record);

    Forum selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Forum record);

    int updateByPrimaryKey(Forum record);

    public List<Forum> findAll();
}