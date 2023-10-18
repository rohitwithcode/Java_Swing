package com.jdbc.coder;
import java.sql.*;
/**
 *
 * @author Rohit Coder
 */
public class Retrieve_data_from_database_using_select_command {
    public static void main(String[] args) {
        int count=0;
        try {
            Connection con=MyConnection.getConnection();
            
            String query="select * from code";
            
            Statement stmt=con.createStatement();
            
//            set is at start in 0 index
            
            ResultSet set=stmt.executeQuery(query);
            
            while(set.next()){
                count++;
                int id=set.getInt(1);
                String name=set.getString("tName");
                String city=set.getString(3);
                System.out.println("Information given below Student : "+count);
                System.out.println("Id : "+id+"\nName : "+name+"\nCity : "+city);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
