package com.mycompany.data;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;

public class loginDetails {
    private boolean userFound;
    private boolean adminFound;
    public loginDetails(String _username,String _password) throws SQLException, ClassNotFoundException, ServletException {
        try {
            Connection con = DatabaseConnection.initializeDatabase();

            Statement stmt = con.createStatement();
            ResultSet userDetails = stmt.executeQuery("SELECT * FROM logindetailsuser");

            while(userDetails.next()) {
                if(userDetails.getString(1).equals(_username)) {
                    if(userDetails.getString(2).equals(_password)) {
                        this.setUserFound(true);
                        break;
                    }
                }
            }

            ResultSet adminDetails = stmt.executeQuery("SELECT * FROM logindetailsadmin");
            if(!getUserFound())
                while(adminDetails.next()) {
                    if(adminDetails.getString(1).equals(_username)) {
                        if(adminDetails.getString(2).equals(_password)) {
                            this.setAdminFound(true);
                            break;
                        }
                    }
                }
        }
        catch (SQLException | ClassNotFoundException ex) {
            throw new ServletException("Login failed", ex);
        }
    }
    
    public void setUserFound(boolean value) {
        userFound = value;
    }
    
    public boolean getUserFound() {
        return userFound;
    }
    
    public void setAdminFound(boolean value) {
        adminFound = value;
    }
    
    public boolean getAdminFound() {
        return adminFound;
    }
}
    
