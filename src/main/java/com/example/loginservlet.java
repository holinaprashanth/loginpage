package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if ("admin".equals(username) && "password".equals(password)) {
            resp.sendRedirect("success.html");
        } else {
            resp.sendRedirect("index.html");
        }
    }
}
