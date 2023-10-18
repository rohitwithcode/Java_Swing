package com.jdbc.coder;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author Rohit Coder
 */
public class Insert_Large_image_to_Database_using_java_program {
    public static void main(String args []){
        
        try {
           Connection c=MyConnection.getConnection();
           
           String query="insert into images(pic) values (?)";
           
           PreparedStatement pstmt=c.prepareStatement(query);
           
           JFileChooser fjc=new JFileChooser();
           
           fjc.showOpenDialog(null);
           
           File file=fjc.getSelectedFile();
           
            FileInputStream fis=new FileInputStream(file);
            
            pstmt.setBinaryStream(1, fis,fis.available());
                 
            pstmt.executeUpdate();
            
//            System.out.println("Done..........");

            JOptionPane.showMessageDialog(null, "inseted");
                
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
