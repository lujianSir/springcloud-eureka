package com.example.eurekaclient1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "SPRING-CLOUD-CLIENT",name = "SPRING-CLOUD-CLIENT")
public interface UserFreign {

    @GetMapping(value = "/info")
    public String Hello();

    @GetMapping(value = "/user/{id}")
    public String user(@PathVariable("id") String id);
}

