import java.io.*;

class file_append{
	public static void main(String[] args){
		try{
			RandomAccessFile r= new RandomAccessFile("C:\\shubhojit\\3.10\\file\\test_append.txt","rw");
			r.seek(r.length());
			r.writeBytes("\n Hello, this is a test");
			r.close();
		}
		catch(Exception err){
			System.out.print("Error: "+err.getMessage());
		}
	}
}