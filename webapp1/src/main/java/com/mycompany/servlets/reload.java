package com.mycompany.servlets;



import com.mycompany.data.DatabaseConnection;
import com.mycompany.data.chatreload;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class reload extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try
        {
            response.setContentType("text/html;charset=UTF-8");
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        // Database name to access 
        String dbName = "newdb"; 
        String dbUsername = "root"; 
        String dbPassword = "Yash1234*"; 
  
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(dbURL + dbName, dbUsername, dbPassword);

            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery("SELECT * FROM chat");
             
           
            while(rst.next()) {
               String uname=rst.getString(2);
               String msg=rst.getString(3);
               String date=rst.getString(4);
               String time=rst.getString(5);
               PrintWriter out=response.getWriter();
               out.print("<p>"+uname+"-<g>"+msg+"</g><br><small>"+date+" "+time+"</small></p>");
            }
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
