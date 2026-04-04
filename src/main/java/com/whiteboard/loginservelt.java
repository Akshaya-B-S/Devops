package com.whiteboard;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        if(user.equals("admin") && pass.equals("123")) {
            res.sendRedirect("dashboard.jsp");
        } else {
            res.getWriter().println("Invalid Login");
        }
    }
}