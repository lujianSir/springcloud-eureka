package com.example.eurekaclient1.service;

import org.springframework.stereotype.Component;

@Component
public class UserFallback implements UserFreign {


    @Override
    public String Hello() {
        String msg="服务调用失败";
        return msg;
    }

    @Override
    public String user(String id) {
        String msg="服务调用失败";
        return msg;
    }
}
