package com.gsupl.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author LGH
 * @Date 2022/6/17 9:43
 * @Version 1.0
 */
@WebServlet("/axiosServlet")
public class axiosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        System.out.println("get...");
//1. 接收请求参数
        String username = request.getParameter("username");
        System.out.println(username);
//2. 响应数据
        response.getWriter().write("hello Axios~");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        System.out.println("post...");
        this.doGet(request, response);
    }
}

