public class HowToConnectDatabase{
	public static void main(String args []){
		
		//STEPS OF FOLLOW TO CONNECT THE DATABASE 
		/*
		
			step 1 -> Load the driver :
			
					step I ->  Class.forName("com.mysql.cj.jdbc.Driver");
					
					step II -> DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			step 2 -> Create a Connection :
					
					// DriverManager returns the Connection Type
					//Connection con=DriverManager.getConnection("url","user","password");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","CoderRohit","Radhey@725386");
			
				
			step 3 -> create query,Statement,PreparedStatement,CallableStatement
				
					
					simpleQuery        -> Fire by Statement
					paremeterizedQuery -> Fire by PreparedStatement
					StoredProcesser    -> Fire by CallableStatement
					
					String query="select * from students";
					
					Statement stmt=con.createStatement();
					
					stmt.execute(); // if 
					ResultSet set=stmt.executeQuery(); // if a query is select 
					stmt.executeUpdate(); //if a query is Update,delete,Update
					
			step 4 -> Process the data
			
					while(set.next()){
						int id=set.getInt(column or "columnName");
						String name=set.getString(column or "columnName");
						
						System.out.println(id);
						System.out.println(name);
					}
					
		*/		
	}
}