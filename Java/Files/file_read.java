import java.io.FileInputStream;

class file_read{
 	public static void main(String args[]){
 	 	try{
  			FileInputStream f= new FileInputStream("C:\\shubhojit\\3.10\\file\\test.txt");
 	 		byte b[]=new byte[32]; 	 	
 	 		f.read(b,0,32); 	 	
 	 		String s=new String(b,0); 	 	
 	 		System.out.print(s);
 	 		System.out.print("\n\n"); 	 	
 	 	} 	 
 	 	catch(Exception e){
 	 	 	System.out.print(e.getMessage());
 	 	}
 	 }
}