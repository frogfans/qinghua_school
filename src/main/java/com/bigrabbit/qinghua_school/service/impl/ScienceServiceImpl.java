package com.bigrabbit.qinghua_school.service.impl;

import com.bigrabbit.qinghua_school.dao.ScienceMapper;
import com.bigrabbit.qinghua_school.dao.SinfoMapper;
import com.bigrabbit.qinghua_school.entity.Science;
import com.bigrabbit.qinghua_school.entity.Sinfo;
import com.bigrabbit.qinghua_school.service.ScienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScienceServiceImpl implements ScienceService {

    @Autowired(required = false)
    private ScienceMapper scienceDao;
    @Autowired(required = false)
    private SinfoMapper sinfoDao;

    @Override
    public List<Science> findScienceBySid(int sid) {

        return scienceDao.selectBySid(sid);
    }

    @Override
    public List<Sinfo> findSinfoByInfoid(int infoid) {
        return sinfoDao.selectByInfoid(infoid);
    }
}
