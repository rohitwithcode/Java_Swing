import java.sql.*;

// PreparedStatement is used for Dynamic Query or Parameterized Query

public class Insert_into_Table_using_java_program{
	public static void main(String args []){
		
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/coder","CoderRohit","Radhey@725386");
		
		String query="insert into code(tName,tCity) values (?,?)";
		
		//Get the PreparedStatement object
		
		PreparedStatement pstmt=con.prepareStatement(query);
		
		//set the value ot query
		
		pstmt.setString(1,"Coder Mohit");
		pstmt.setString(2,"Kunjalpur");
		
		pstmt.executeUpdate();
		System.out.println("Data inserted successfully");
		
		con.close();
		
		}catch(ClassNotFoundException e){
			System.out.println("Driver not found");
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}