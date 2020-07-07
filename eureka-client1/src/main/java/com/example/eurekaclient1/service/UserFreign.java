package com.example.eurekaclient1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(value = "SPRING-CLOUD-CLIENT", fallback= UserFallback.class)
public interface UserFreign {

    @RequestMapping(value = "/info" ,method = RequestMethod.GET)
    public String Hello();

    @GetMapping(value = "/user/{id}")
    public String user(@PathVariable("id") String id);
}

