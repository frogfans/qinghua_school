package com.bigrabbit.qinghua_school.dao;

import com.bigrabbit.qinghua_school.entity.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}