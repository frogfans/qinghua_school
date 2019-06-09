package com.bigrabbit.qinghua_school.controller;

import com.bigrabbit.qinghua_school.service.ForumService;
import com.bigrabbit.qinghua_school.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "产业平台",tags = "产业平台") //修饰是类 标记类是做什么的
@RestController
@RequestMapping("/forum")
public class ForumController {

    @Autowired
    private ForumService forumService;

    @CrossOrigin//允许跨域
    @ApiOperation(value = "产业详情",notes = "这是一个展示产业详情的分类")
    @GetMapping("/list.do")
    public R findAll(){
        return R.setOK("OK",forumService.findAll());
    }
}
