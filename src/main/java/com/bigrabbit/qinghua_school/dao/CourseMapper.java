package com.bigrabbit.qinghua_school.dao;

import com.bigrabbit.qinghua_school.entity.Course;

import java.util.List;

public interface CourseMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

    public List<Course> selectByMid(int mid);

    public List<Course> selectAll();
}