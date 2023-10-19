package jdbc_mysql.src;

import java.util.*;
import java.sql.*;

public class callable_fetch {
	public static void main(String[] args) {
	      try{
		     	Scanner sc=new Scanner(System.in);
		     	CallableStatement csmt;
		     	Connection con;
		     	String nam,sql;	     	
		     	int code;
		     	double mrks;
		     	
	            Class.forName("com.mysql.jdbc.Driver");  	            
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root",""); 
	            
		     	System.out.print("Enter id :");
		     	code=sc.nextInt();	     	
		     	sql="{call fetch_rec2(?,?,?)}";			
			    csmt=con.prepareCall(sql);
				
	            csmt.setInt(1,code);
			    csmt.registerOutParameter(2,java.sql.Types.VARCHAR);
	            csmt.registerOutParameter(3,java.sql.Types.DOUBLE);
	            csmt.execute();
	            nam=csmt.getString(2);
	            mrks = csmt.getDouble(3);
	            System.out.print("\n\n"+nam+"\t"+mrks+"\n");
	            
	    	    csmt.close();
		        con.close(); 
		        sc.close();
		    }	
		  	catch(Exception ex){
		  		System.out.println(ex.getMessage());
		  	}	
		}
}


//	DELIMITER //
//	CREATE PROCEDURE fetch_rec2(
//       IN code varchar(5) ,
//       OUT nam varchar(30),
//       OUT mrks double
//)
//	BEGIN
//    	SELECT name,marks into nam,mrks FROM student WHERE id = code;
//	END //
