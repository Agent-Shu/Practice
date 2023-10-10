import java.util.*;
import java.sql.*;

public class prepare_insert {
	public static void main(String[] args) {
		try{
	     	Scanner sc=new Scanner(System.in);	     	
	     	Connection con;
	     	String nam,ch,sql;	     	
	     	int code;
	     	double mrks;	     	
	     	
            Class.forName("com.mysql.jdbc.Driver");  	            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");  
	     	
	     	System.out.print("Enter id :");
	     	code=sc.nextInt();
	     	
	     	ch=sc.nextLine();
	     	System.out.print("Enter name :");
	     	nam=sc.nextLine();
	     		
	     	ch=sc.nextLine(); 
	     	System.out.print("Enter marks :");
	     	mrks=sc.nextDouble();	     	
	     	ch=sc.nextLine();	     		     	    	

		    sql="insert into student values(?,?,?)";
		    PreparedStatement psmt=con.prepareStatement(sql);
		    psmt.setInt(1,code);
		    psmt.setString(2,nam);		    
		    psmt.setDouble(3,mrks);
	
		    psmt.executeUpdate();
		    
		    System.out.print("\n\n Record Inserted \n\n");
		    System.out.print("\n");
		   
		    con.close();
		    sc.close();
		}
		catch(Exception se){
		      System.out.println("\n\n\nSQL EXCEPTION : "+se.getMessage());
		}
   	}
}
