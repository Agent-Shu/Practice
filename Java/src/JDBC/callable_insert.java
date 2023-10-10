import java.util.*;
import java.sql.*;

public class callable_insert{
	public static void main(String[] args) {
		try
	     {
	     	Scanner sc=new Scanner(System.in);
	     	CallableStatement csmt;
	     	Connection con;	     
	     	String nam,ch,sql;	     	
	     	String code;
	     	double mrks;
	     	
            Class.forName("com.mysql.jdbc.Driver");  	            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");     

	     	System.out.print("Enter id :");
	     	code=sc.nextLine();
	     	ch=sc.nextLine();
	     	System.out.print("Enter name :");
	     	nam=sc.nextLine();	
	     	ch=sc.nextLine(); 
	     	System.out.print("Enter marks :");
	     	mrks=sc.nextDouble();
	     	ch=sc.nextLine();
	     	sql="{call record_insert(?,?,?)}";			
		    csmt=con.prepareCall(sql);
			
         	csmt.setString(1,code);
		    csmt.setString(2,nam);
		    csmt.setDouble(3,mrks);		
			
		    csmt.executeUpdate();
		    sc.close();
	     	System.out.println("Record Inserted");	     		     	
	     }	
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}


//	DELIMITER //
//	CREATE PROCEDURE record_insert(
//    	IN code varchar(5) ,
//	    IN nam varchar(30),
// 		IN mrks double
//	)
//	BEGIN
// 	   insert into student(id,name,marks) values(code,nam,mrks);
//	END //
//	DELIMITER ;
