package com.bigrabbit.qinghua_school.service.impl;

import com.bigrabbit.qinghua_school.dao.StudentMapper;
import com.bigrabbit.qinghua_school.entity.Student;
import com.bigrabbit.qinghua_school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired(required = false)
    private StudentMapper studentDao;

    @Override
    public void addStudent(Student student) {

        studentDao.addStudent(student);
    }
}
