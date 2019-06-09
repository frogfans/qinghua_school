package com.bigrabbit.qinghua_school.service.impl;

import com.bigrabbit.qinghua_school.dao.ZiChanMapper;
import com.bigrabbit.qinghua_school.entity.ZiChan;
import com.bigrabbit.qinghua_school.service.ZiChanService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ZiChanServiceImpl implements ZiChanService {
    @Autowired(required = false)
    private ZiChanMapper ziChanDao;

    @Override
    public List<ZiChan> findAllZiChan() {
        return ziChanDao.findAll();
    }
}
