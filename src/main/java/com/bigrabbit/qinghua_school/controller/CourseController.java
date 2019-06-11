package com.bigrabbit.qinghua_school.controller;

import com.bigrabbit.qinghua_school.service.CourseService;
import com.bigrabbit.qinghua_school.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "课程操作",tags = "课程操作") //修饰是类 标记类是做什么的
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @CrossOrigin//允许跨域
    @ApiOperation(value = "查询课程",notes = "这是一个实现查询2级菜单对应的所有课程的方法，需要参数信息")
    @GetMapping("/findByMid.do")
    public R findCourseByMid(int mid){

        return R.setOK("OK", courseService.findCourseByMid(mid));
    }
    @CrossOrigin//允许跨域
    @ApiOperation(value = "查询前6个课程",notes = "这是一个实现查询前6条数据的方法")
    @GetMapping("/findByPage.do")
    public R findCourseByPage(){
        return R.setOK("OK", courseService.findCourseByPage());
    }
}
