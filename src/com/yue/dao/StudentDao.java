package com.yue.dao;

import com.yue.pojo.Student;
import com.yue.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 岳岳
 * version  1.0
 */
@Repository
public interface StudentDao {
    @Select("select * from student where userno=#{userno}")
    List<Student> query(Integer userno);
    @Select("select * from student")
    User find(Integer userno);
    @Insert("insert into student (stuname,sex,birthday,userno)values(#{stuname},#{sex},#{birthday},#{userno})")
    int add(Student student);
    int update (Student student);
    int delete (Integer stuno);
}
