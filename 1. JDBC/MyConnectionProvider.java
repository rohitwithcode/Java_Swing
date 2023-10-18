package com.jdbc.coder;
import java.sql.*;
/**
 *
 * @author Rohit Coder
 */
public class MyConnectionProvider {
    private static Connection con;
    
    public static Connection getConnection(){
        
        if(con==null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/coder","CoderRohit","Radhey@725386");
                
            } catch (ClassNotFoundException ex) {
                System.out.println("Driver not found");
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return con;
    }
}
