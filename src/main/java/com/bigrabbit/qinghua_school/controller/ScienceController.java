package com.bigrabbit.qinghua_school.controller;

import com.bigrabbit.qinghua_school.service.ScienceService;
import com.bigrabbit.qinghua_school.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "科研平台操作", tags = "科研平台操作")
@RestController
@RequestMapping("/science")
public class ScienceController {

    @Autowired
    private ScienceService scienceService;

    @CrossOrigin // 跨域
    @ApiOperation(value = "查询科研", notes = "这个是根据一级菜单编号查询信息从而查询出二级菜单信息")
    @GetMapping("/findScienceBySid.do")
    public R findScienceBySid(int sid) {

        return R.setOK("OK", scienceService.findScienceBySid(sid));
    }

    @CrossOrigin // 跨域
    @ApiOperation(value = "查询科研",notes = "这个是根据id编号查询出科研平台中的二级菜单信息")
    @GetMapping("/findSinfoByInfoid.do")
    public R findSinfoByInfoid(int infoid){

        return R.setOK("OK",scienceService.findSinfoByInfoid(infoid));
    }
}
