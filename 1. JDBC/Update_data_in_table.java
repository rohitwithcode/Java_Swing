
package com.jdbc.coder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
/**
 *
 * @author Rohit Coder
 */
public class Update_data_in_table {
    public static void main(String[] args) {
        
        try {
            Connection con=MyConnection.getConnection();
            
            String query="update code set tName=? , tCity=? where cId=?";
            
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter your name : ");
            String name=br.readLine();
            
            System.out.println("Enter you city name  : ");
            String city=br.readLine();
            
            System.out.println("Enter your id : ");
            int id=Integer.parseInt(br.readLine());
            
            PreparedStatement pstmt=con.prepareStatement(query);
            
            pstmt.setString(1, name);
            pstmt.setString(2,city);
            pstmt.setInt(3,id);
            
            pstmt.executeUpdate();
            System.out.println("Done");
            
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
