package com.bigrabbit.qinghua_school.controller;

import com.bigrabbit.qinghua_school.entity.Student;
import com.bigrabbit.qinghua_school.service.StudentService;
import com.bigrabbit.qinghua_school.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(value = "学生操作",tags = "学生操作")
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @CrossOrigin
    @ApiOperation(value = "添加学生",notes = "这是一个添加学生的操作")
    @GetMapping("/addStudent.do")
    public R addStudent(Student student) {
        studentService.addStudent(student);
        return R.setOK();
    }

}
