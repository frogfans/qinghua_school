package com.bigrabbit.qinghua_school.service.impl;

import com.bigrabbit.qinghua_school.dao.MenuMapper;
import com.bigrabbit.qinghua_school.service.MenuService;
import com.bigrabbit.qinghua_school.vo.VMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired(required = false)
    private MenuMapper menuMapper;

    @Override
    public List<VMenu> findAll() {
        return menuMapper.findAll();
    }
}
