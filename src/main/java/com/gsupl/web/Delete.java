package com.gsupl.web;

import com.gsupl.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteServlet")
public class Delete extends HttpServlet {

    BrandService service = new BrandService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 接收id
        String id = req.getParameter("id");
        //2. 调用service查询
        service.delete(Integer.parseInt(id));
        //4. 转发到selectAllServlet
        req.getRequestDispatcher("/selectAllServlet").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
