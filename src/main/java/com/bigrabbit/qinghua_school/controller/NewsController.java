package com.bigrabbit.qinghua_school.controller;

import com.bigrabbit.qinghua_school.service.NewsService;
import com.bigrabbit.qinghua_school.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "新闻分类",tags = "新闻分类") //修饰是类 标记类是做什么的
@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;


    @CrossOrigin//允许跨域
    @ApiOperation(value = "新闻分页",notes = "这是一个实现分页功能，需要的参数")
    @GetMapping("/list.do")
    public R findIndexAndSize(int mid, int page, int limit){
        return R.setOK("OK",  newsService.findIndexAndSize(mid, page, limit));
    }


}
