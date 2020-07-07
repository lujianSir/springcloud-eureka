package com.example.eurekaclient.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @RequestMapping(value = "/info" ,method = RequestMethod.GET)
    public String Hello(){
        return "hello xxx，this is eureka-client messge";
    }

    @RequestMapping(value = "/user/{id}" ,method = RequestMethod.GET)
    public String user(@PathVariable("id") String id){
        return "测试成功啦啦啦啦啦啦"+id;
    }
}
