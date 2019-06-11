package com.bigrabbit.qinghua_school.service.impl;

import com.bigrabbit.qinghua_school.dao.CourseMapper;
import com.bigrabbit.qinghua_school.entity.Course;
import com.bigrabbit.qinghua_school.service.CourseService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConrseServiceImpl implements CourseService {
    @Autowired(required = false)
    private CourseMapper courseDao;
    @Override
    public List<Course> findCourseByMid(int mid) {
        return courseDao.selectByMid(mid);
    }

    @Override
    public List<Course> findCourseByPage() {
        PageHelper.startPage(1, 6);
        List<Course> list = courseDao.selectAll();
        return list;
    }
}
