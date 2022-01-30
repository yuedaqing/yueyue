package com.yue.test;

import com.yue.dao.StudentDao;
import com.yue.dao.UserDao;
import com.yue.pojo.Student;
import com.yue.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author 岳岳
 * version  1.0
 */
public class Test01 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApllicationContext.xml");
        StudentDao studentDao = (StudentDao) applicationContext.getBean("studentDao");
        List<Student> query = studentDao.query(1);
        System.out.println("query = " + query);
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("ApllicationContext.xml");
        UserDao userDao = (UserDao) applicationContext1.getBean("userDao");
        User user = new User();
        user.setUserid("lol");
        user.setUserpassword("07563a3fe3bbe7e3ba84431ad9d055af");
        User user1 = userDao.find(user);
        System.out.println("user1 = " + user1);
    }
}
