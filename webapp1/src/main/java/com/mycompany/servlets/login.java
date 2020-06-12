
package com.mycompany.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String _username = request.getParameter("username");
            String _password = request.getParameter("password");
            if(_username != null && _password != null) {
                if(_username.equals("admin") && _password.equals("admin")) {
                    response.sendRedirect("welcome.jsp");
                }
                else {
                    out.println("Invalid user or password");
                }
            }
            else {
                out.println("Empty user or password");
            }
        }
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

  
}
