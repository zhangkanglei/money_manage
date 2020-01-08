package com.example.demo.controller;

import com.example.demo.po.Member;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by 张康磊 on 2017/9/3.
 */
@RestController
@Api(tags = "测试相关接口")
@RequestMapping("/test")
public class HelloWord {

    Member member;

    @GetMapping("/hello")
    @ApiOperation("添加用户的接口")
    public String say(){
        return "hello spring boot";
    }

}
