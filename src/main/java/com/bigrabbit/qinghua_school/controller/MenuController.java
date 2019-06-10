package com.bigrabbit.qinghua_school.controller;

import com.bigrabbit.qinghua_school.service.MenuService;
import com.bigrabbit.qinghua_school.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "菜单分类",tags = "菜单分类") //修饰是类 标记类是做什么的
@RestController
@RequestMapping("/menus")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @CrossOrigin//允许跨域
    @ApiOperation(value = "菜单分类",notes = "这是一个展示菜单导航的分类")
    @GetMapping("/list.do")
    public R findAll(){
        return R.setOK("OK",menuService.findAll());
    }

}
