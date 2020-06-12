package com.mycompany.data;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class chatreload {
    public ResultSet chatreload () 
        throws SQLException, ClassNotFoundException 
    { 
         Connection con = DatabaseConnection.initializeDatabase();

            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery("SELECT * FROM chat");
             
             
            con.close();
            return rst;
    } 
}
