import java.sql.*;

public class FirstJdbcConnection{
	public static void main(String args []){
		
		try{
			
			// Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create a Connection
			Connection con;
			
			// Copy url and userName and Password
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/coder","CoderRohit","Radhey@725386");
			
			if(con.isClosed()){
				System.out.println("Connection is closed");
			}
			else{
				System.out.println("Connection created");
			}
		}catch(ClassNotFoundException e){
			System.out.println("Mysql driver is not found : "+e.getMessage());
		}catch(SQLException e){
			System.out.println(e);
			e.printStackTrace();
		}
	}
}