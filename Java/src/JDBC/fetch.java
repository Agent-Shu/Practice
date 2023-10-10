import java.sql.*;

public class fetch {
	public static void main(String[] args) {
		try{
		    Connection con;
		    Statement stmt;
		    ResultSet rs;
		    String nam;
		     	
		    int code;
		    double mrks;
		     	
	        Class.forName("com.mysql.jdbc.Driver");
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");  
		     	
		    stmt=con.createStatement();  
	        rs=stmt.executeQuery("select * from student");  
	            
	        while(rs.next()){
	            code=rs.getInt(1);
	            nam=rs.getString(2);
	            mrks=rs.getDouble(3);
	            
	            System.out.println("ID: "+code+" Name: "+nam+" Marks: "+mrks);  
	        }
	        con.close(); 	     		     	
		}	
		catch(Exception ex){
		  	System.out.println(ex.getMessage());
		}   
	}
}
