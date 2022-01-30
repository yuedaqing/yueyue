package com.yue.controller;

import com.yue.pojo.Student;
import com.yue.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 岳岳
 * version  1.0
 */
@Controller
public class StudentCon {
    @Resource(name = "studentService")
    private StudentService studentService;
    @RequestMapping(method = RequestMethod.GET,value = "/student/query.do")
    public ModelAndView query(HttpSession session){

        Object userno1 = session.getAttribute("userno");
        Integer userno = new Integer((Integer) userno1);
        System.out.println("userno = " + userno);
            //调用service
        List<Student> students = studentService.query(userno);
        //创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("student",students);
        modelAndView.setViewName("/student/list.jsp");
        return modelAndView;
    }

    /**
     * 添加选手学生信息
     * @param student
     * @return
     */
    @RequestMapping(method = RequestMethod.POST,value = "/student/add.do")
    public String add(Student student){
        studentService.add(student);
        return "redirect:/student/query.do";
    }
}
