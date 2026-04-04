package com.app.servlet;

import java.io.*;

import com.app.dao.drawingdao;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/saveDrawing")
public class savedrawingsevlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        BufferedReader reader = req.getReader();
        String data = reader.readLine();

        drawingdao.save(data);

        res.getWriter().write("Saved Successfully");
    }
}