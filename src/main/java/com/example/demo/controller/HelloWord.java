package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 张康磊 on 2017/9/3.
 */
@RestController
public class HelloWord {

    @RequestMapping("hello")
    public String say(){
        return "hello spring boot";
    }

}
