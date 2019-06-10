package com.bigrabbit.qinghua_school.service.impl;

import com.bigrabbit.qinghua_school.dao.BankingMapper;
import com.bigrabbit.qinghua_school.entity.Banking;
import com.bigrabbit.qinghua_school.service.BankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankingServiceImpl implements BankingService {

    @Autowired(required = false)
    private BankingMapper bankingMapper;

    @Override
    public List<Banking> findAll() {
        return bankingMapper.findAll();
    }
}
