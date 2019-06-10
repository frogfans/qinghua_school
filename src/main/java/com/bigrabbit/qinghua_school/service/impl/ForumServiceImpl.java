package com.bigrabbit.qinghua_school.service.impl;

import com.bigrabbit.qinghua_school.dao.ForumMapper;
import com.bigrabbit.qinghua_school.entity.Forum;
import com.bigrabbit.qinghua_school.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumServiceImpl implements ForumService {

    @Autowired(required = false)
    private ForumMapper forumMapper;

    @Override
    public List<Forum> findAll() {
        return forumMapper.findAll();
    }
}
