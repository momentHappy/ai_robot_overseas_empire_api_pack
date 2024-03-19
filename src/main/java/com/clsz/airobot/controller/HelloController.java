package com.clsz.airobot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        //调用 sl4j 的 info() 方法，而非调用 logback 的方法
        log.info("*****************   hello ai robot *****************");
        return "hello world";
    }


    @RequestMapping("/")
    public String test() {
        return "success";
    }


    @RequestMapping("/getTable")
    public String getTable() {


        return "OK !!!";
    }

}
