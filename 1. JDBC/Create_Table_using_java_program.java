import java.sql.*;

public class Create_Table_using_java_program{
	public static void main(String args []){
		
		try{
			//Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Create Connection
		String url="jdbc:mysql://localhost:3306/coder";
		String password="Radhey@725386";
		String user="CoderRohit";
		
		Connection con=DriverManager.getConnection(url,user,password);
	
		//Create Queary
		
		String query="create table code(cId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(200))";
		
		//Create Statement
		
		Statement stmt=con.createStatement();
		
		//Execute the statement
		stmt.executeUpdate(query);
		System.out.println("Table created successfully in Database");
		
		//Close the Connection
		con.close();
/*	
	if(con.isClosed()){
		System.out.println("Connection Failed");
	}
	else{
		System.out.println("Connection Created");
	}
*/
	}catch(ClassNotFoundException e){
		System.out.println("Driver not found");
	}catch(SQLException e){
		e.printStackTrace();
	}
	}
}
