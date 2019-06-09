package com.bigrabbit.qinghua_school.service;

import java.util.Map;

public interface NewsService {

    public Map<String,Object> findIndexAndSize(int mid, int page, int limit);

}
