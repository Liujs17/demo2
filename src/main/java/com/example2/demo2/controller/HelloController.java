package com.example2.demo2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Value("${demo2.className}")
    private String className;
    @Value("${demo2.count}")
    private int count;
    @RequestMapping("hello")
    @ResponseBody //json格式返回
    public String hello(){
        return "课程名字："+className+ "人数： "+count +" "+"hello word";
    }
}
