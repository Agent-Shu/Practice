import java.io.*;

public class file_write{
	public static void main(String args[]){
		byte buffer[]=new byte[64];
		try{	
			System.out.print("\n Enter something :\n\n");
			System.in.read(buffer,0,64);
  			FileOutputStream f=new FileOutputStream("C:\\shubhojit\\3.10\\file\\test_write.txt");
                	f.write(buffer);   
			f.close();         	
		}
		catch(Exception e){
			System.out.print("Error"+e.getMessage());
		}		
	}
}