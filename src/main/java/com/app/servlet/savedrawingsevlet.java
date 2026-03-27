package com.app.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.app.dao.DrawingDAO;

public class SaveDrawingServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        BufferedReader reader = req.getReader();
        String data = reader.readLine();

        DrawingDAO.save(data);

        res.getWriter().write("Saved Successfully");
    }
}