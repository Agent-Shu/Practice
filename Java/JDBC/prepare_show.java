package jdbc_mysql.src;

import java.util.*;
import java.sql.*;

public class prepare_show {
	public static void main(String[] args) {
		
        try{
	     	Scanner sc=new Scanner(System.in);	     	
	     	Connection con;
	     	String nam;
	     	
	     	int code;
	     	double mrks;
	     		     	
	     	
            Class.forName("com.mysql.jdbc.Driver");  	      
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");   
	    
		    System.out.print("\nEnter Id: ");
		    code=sc.nextInt();

		    con.setAutoCommit(false);

		    String sel="select name,marks from student where id=?";
		    PreparedStatement psmt=con.prepareStatement(sel);
		    psmt.setInt(1,code);
		    ResultSet rs=psmt.executeQuery();
		    System.out.print("\n Employee Details\n\n");

		    while(rs.next()){
		      nam=rs.getString(1);
		      mrks=rs.getDouble(2);
		      System.out.print("\n"+code+"\t"+nam+"\t"+mrks);
		    }
		        System.out.print("\n");
		        con.commit();
		        con.close();
                sc.close();
		}
		catch(Exception se){
		    System.out.println("\n\n\nSQL EXCEPTION : "+se.getMessage());
		}	
	}
}
