package com.yue.service;

import com.yue.pojo.Student;

import java.util.List;

/**
 * @author 岳岳
 * version  1.0
 */
public interface StudentService {
    List<Student> query(Integer userno);
    int add(Student student);
}
