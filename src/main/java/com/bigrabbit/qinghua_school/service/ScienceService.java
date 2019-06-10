package com.bigrabbit.qinghua_school.service;

import com.bigrabbit.qinghua_school.entity.Sinfo;
import com.bigrabbit.qinghua_school.vo.ScienceVo;

import java.util.List;

public interface ScienceService {

    public List<ScienceVo> findScienceBySid(int sid);
    public List<Sinfo> findSinfoByInfoid(int infoid);
}
