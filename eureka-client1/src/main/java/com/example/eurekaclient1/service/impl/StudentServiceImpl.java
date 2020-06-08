package com.example.eurekaclient1.service.impl;

import com.example.eurekaclient1.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String getMessage() {
        return "这是调用本地的方法";
    }

    @Override
    public String getStudentNumber(int id) {
        return "这个学生的编号:"+ id;
    }
}
