package com.bigrabbit.qinghua_school.service;

import com.bigrabbit.qinghua_school.entity.Science;
import com.bigrabbit.qinghua_school.entity.Sinfo;

import java.util.List;

public interface ScienceService {
    public List<Science> findScienceBySid(int sid);
    public List<Sinfo> findSinfoByInfoid(int infoid);
}
