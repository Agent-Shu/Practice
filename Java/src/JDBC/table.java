import java.util.*;
import java.sql.*;


public class table{
	public static void main(String[] args) {
		try{
	     	Scanner sc=new Scanner(System.in);
	     	Connection con;
	     	Statement stmt;
	     	String nam,sql,c;	     	
	     	int code;
	     	double mrks;    	
	
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");  	    
	     	
	     	System.out.print("Enter id :");
	     	code=sc.nextInt();
	     	c=sc.nextLine();
	     	System.out.print("Enter name :");
	     	nam=sc.nextLine();	
	     	c=sc.nextLine();
	     	System.out.print("Enter marks :");
	     	mrks=sc.nextDouble();
	     	c=sc.nextLine();
	     	stmt=con.createStatement();
	     	sql="insert into student values("+code+",'"+nam+"',"+mrks+")";
	     	stmt.executeUpdate(sql);
	     	
	     	sc.close();
	     	System.out.println("Record Inserted");		     	
		}	
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}   
	}
}

//	create database debalena;
//	use debalena;

//	create table Student
//	(
//   	id int primary key,
//   	name varchar(30),
//   	marks double
//	);

//	desc Student;
//	select * from Student;

