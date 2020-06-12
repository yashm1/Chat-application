package com.mycompany.data;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;

public class chat {
    private boolean userFound;
    private boolean adminFound;
    public chat(String _username,String _password) throws SQLException, ClassNotFoundException, ServletException {
        try {
            Connection con = DatabaseConnection.initializeDatabase();

            Statement stmt = con.createStatement();
        String uname=_username;
        String msg=_password;
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat sdf2=new SimpleDateFormat("hh-mm-ss a");
        String emtDate=sdf.format(date);
        String emttime=sdf2.format(date);
       // INSERT INTO `newdb`.`chat` (`username`, `message`, `date`, `time`) VALUES ('wer', 'asd', 'das', 'ads');
//        "INSERT INTO `time_entry`(pid,tid,rid,tspend,description) VALUE ('"+pid+"','"+tid+"','"+rid+"',"+tspent+",'"+des+"')");
        String str="INSERT INTO `chat` (`username`, `message`, `date`, `time`) VALUES ('"+uname+"','"+msg+"','"+emtDate+"','"+emttime+"')";
       
    
        int rows = stmt.executeUpdate(str);
      System.out.println("Rows impacted : " + rows );

        con.close();


           
                
        }
        catch (SQLException | ClassNotFoundException ex) {
            throw new ServletException("Login failed", ex);
        }
    }
    
 
}
    
