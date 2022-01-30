package com.yue.service;

import com.yue.dao.StudentDao;
import com.yue.pojo.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 岳岳
 * version  1.0
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource(name = "studentDao")
    private StudentDao studentDao;
    @Override
    public List<Student> query(Integer userno) {
        return studentDao.query(userno);
    }

    @Override
    public int add(Student student) {
        int add = studentDao.add(student);
        return add;
    }
}
