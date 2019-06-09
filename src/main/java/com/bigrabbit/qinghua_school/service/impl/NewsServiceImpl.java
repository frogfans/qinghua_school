package com.bigrabbit.qinghua_school.service.impl;

import com.bigrabbit.qinghua_school.dao.NewsMapper;
import com.bigrabbit.qinghua_school.entity.News;
import com.bigrabbit.qinghua_school.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired(required = false)
    private NewsMapper newsDao;

    @Override
    public Map<String, Object> findIndexAndSize(int mid, int page, int limit) {
        int index = (page - 1) * limit;
        List<News> list = newsDao.findIndexAndSize(mid, index, limit);
        int count = newsDao.count(mid);

        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data", list);

        return map;
    }
}
