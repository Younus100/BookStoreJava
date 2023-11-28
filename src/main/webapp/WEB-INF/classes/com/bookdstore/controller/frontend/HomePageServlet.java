package com.bookdstore.controller.frontend;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("")
public class HomePageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet at : " + req.getContextPath());
        req.getRequestDispatcher("frontend/index.jsp").forward(req,resp);
//        resp.sendRedirect("frontend/index.jsp");
        //Test branch //Main
    }
}
