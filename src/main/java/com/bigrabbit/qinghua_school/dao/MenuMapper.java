package com.bigrabbit.qinghua_school.dao;

import com.bigrabbit.qinghua_school.entity.Menu;
import com.bigrabbit.qinghua_school.vo.VMenu;

import java.util.List;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    public List<VMenu> findAll();

}