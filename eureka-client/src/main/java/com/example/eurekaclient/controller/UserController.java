package com.example.eurekaclient.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping(value = "/info" )
    public String Hello(){
        return "hello xxx，this is eureka-client messge";
    }

    @GetMapping(value = "/user/{id}" )
    public String user(@PathVariable("id") String id){
        return "测试成功啦啦啦啦啦啦"+id;
    }
}
