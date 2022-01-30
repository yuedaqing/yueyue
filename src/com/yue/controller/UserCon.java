package com.yue.controller;

import com.yue.pojo.User;
import com.yue.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author 岳岳
 * version  1.0
 */
@Controller
public class UserCon {
    @Resource(name = "userService")
    private UserService userService;
    @RequestMapping(method = RequestMethod.POST,value="/user/login.do")
    public String login(User user, HttpSession session){
        //调用service
        User login = userService.login(user);
        System.out.println("login = " + login);
        if(login==null){
            return "/view/fall.jsp";
        }

        session.setAttribute("userno",login.getUserno());
        //登录成功将保存 到Session对象
        Integer userno = login.getUserno();
        System.out.println("userno = " + userno);
        return "redirect:/student/query.do";
    }
    @RequestMapping(method = RequestMethod.POST,value = "/user/reg.do")
    public String reg(User user){
        Integer reg = userService.reg(user);
        if (reg == null){
            return "/view/reg.jsp";
        }else{
            return "/view/login.jsp";
        }
    }

    /**
     * 注销用户登录
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value = "/user/zx.do")
    public String zx(HttpSession session){
        session.removeAttribute("userno");
        return "redirect:/view/login.jsp";
    }
}
