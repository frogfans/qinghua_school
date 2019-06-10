package com.bigrabbit.qinghua_school.controller;

import com.bigrabbit.qinghua_school.service.BankingService;
import com.bigrabbit.qinghua_school.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "金融平台",tags = "金融平台") //修饰是类 标记类是做什么的
@RestController
@RequestMapping("/banking")
public class BankingController {

    @Autowired
    private BankingService bankingService;

    @CrossOrigin//允许跨域
    @ApiOperation(value = "金融平台",notes = "展示所有的金融平台的数据")
    @GetMapping("/list.do")
    public R findAll(){
        return R.setOK("OK", bankingService.findAll());
    }
}
