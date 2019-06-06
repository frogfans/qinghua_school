package com.bigrabbit.qinghua_school.service;

import com.bigrabbit.qinghua_school.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> findCourseByMid(int mid);
}
