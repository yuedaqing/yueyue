package com.yue.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 岳岳
 * version  1.0
 * 实现过滤器接口
 */
public class CheckIsLoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        //将所有请求与响应转为它的子类
        HttpServletRequest request= (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
       //得到请求路径
        String url = request.getRequestURI();
        //输出所有请求的路径
        System.out.println("url = " + url);
        //判断是否应该放行
        if(url.endsWith("/user/login.do")||url.endsWith("/user/reg.do")){
            //放行
            filterChain.doFilter(req,resp);
        }else{
            //判断session中的值是否为null，为null跳转登录页面。
            HttpSession session = request.getSession();
            Object userno = session.getAttribute("userno");
            if(userno != null){
                //放行
                filterChain.doFilter(req,resp);
            }else{
               response.sendRedirect("/view/login.jsp");
            }
        }
    }

    @Override
    public void destroy() {

    }
}
