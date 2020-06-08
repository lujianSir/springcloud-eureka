package com.example.eurekaclient1.controller;

import com.example.eurekaclient1.service.StudentService;
import com.example.eurekaclient1.service.UserFreign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentContrller {

    @Autowired
    private StudentService studentService;

    @Autowired
    private UserFreign userFreign;

    /**
     * 获取信息
     * @return
     */
    @GetMapping(value="/getStudenMessage")
    public String getStudenMessage(){
        return  studentService.getMessage();
    }

    /**
     * 获取学生的编号
     * @param id
     * @return
     */
    @GetMapping(value = "/getStudentNumber/{id}")
    public String getStudentNumber(@PathVariable("id") int id){
        return studentService.getStudentNumber(id);
    }

    /**
     * 通过freign 获取用户的信息
     * @return
     */
    @GetMapping(value = "/getUserMessage")
    public String getUserMessage(){
        return  userFreign.Hello();
    }

    /**
     * 通过Freign获取User信息
     * @param id
     * @return
     */
    @GetMapping(value = "/getUser/{id}")
    public String getUser(@PathVariable("id") String id){
        return  userFreign.user(id);
    }
}
