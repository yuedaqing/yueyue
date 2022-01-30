package com.yue.dao;

import com.yue.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 岳岳
 * version  1.0
 */
@Repository
public interface UserDao {
    @Select("select * from user where userid=#{userid}and userpassword=#{userpassword}")
    User find(User user);
    @Insert("insert into user (userid,userpassword,username,sex)values(#{userid},#{userpassword},#{username},#{sex})")
    int add(User user);
    @Update("update user set userid=#{userid},userpassword=#{userassword}where userid=#{userid}")
    int update(User user);
}
