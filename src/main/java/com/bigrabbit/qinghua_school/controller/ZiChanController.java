package com.bigrabbit.qinghua_school.controller;

import com.bigrabbit.qinghua_school.service.ZiChanService;
import com.bigrabbit.qinghua_school.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "产业平台操作",tags = "产业平台操作")
@RestController
@RequestMapping("/zichan")
public class ZiChanController {

    @Autowired(required = false)
    private ZiChanService ziChanService;

    @CrossOrigin
    @ApiOperation(value = "查询所有产业",notes = "这是一个实现查询全部产业的方法")
    @GetMapping("/list.do")
    public R findAll() {

        return R.setOK("OK",ziChanService.findAllZiChan());

    }
}
