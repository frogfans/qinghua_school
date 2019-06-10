package com.bigrabbit.qinghua_school.dao;

import com.bigrabbit.qinghua_school.entity.Student;

public interface StudentMapper {

    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    public void addStudent(Student student);
}