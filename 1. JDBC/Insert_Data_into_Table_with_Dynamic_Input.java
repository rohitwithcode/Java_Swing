import java.sql.*;
import java.util.Scanner;

public class Insert_Data_into_Table_with_Dynamic_Input{
	public static void main(String args []){
		
		Scanner sc=new Scanner(System.in);
		
		try{
		//Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Create Connection
		String url="jdbc:mysql://localhost:3306/coder";
		String user="CoderRohit";
		String pass="Radhey@725386";
		
		Connection con=DriverManager.getConnection(url,user,pass);
		
		//Create Query
		String query="insert into code(tName,tCity) value(?,?)";
		
		System.out.print("Enter your name : ");
		String name=sc.nextLine();
		
		System.out.print("Enter your City : ");
		String city=sc.nextLine();
		
		//getting the object of PreparedStatement
		PreparedStatement pstmt=con.prepareStatement(query);
		
		//Set the values
		pstmt.setString(1,name);
		pstmt.setString(2,city);
		
		// Execute the statement
		pstmt.executeUpdate();
		
		System.out.println("Data inserted in database successfully...");
		
		con.close();
		}catch(ClassNotFoundException e){
			System.out.println("Driver not found");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
}