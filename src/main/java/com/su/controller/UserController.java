package com.su.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(produces = "Java接口编辑文档",value = "接口文档")
@RestController
public class UserController {
    //查询数据
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"数量"}, value = "获取数量接口")
    @GetMapping("/datalist.do")
    public List<String> query1(@ApiParam(value = "数量") int count){
        List<String> strs = new ArrayList<String>();
        for (int i = 1 ; i <= count; i++) {
            strs.add("第"+i+"名");
        }
        return strs;
    }
}
