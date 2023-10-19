package Exception;
import java.util.Scanner;

class except1{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter two number: ");
		int x= s.nextInt();
		int y= s.nextInt();

		try{
			int z=x/y;
			System.out.print("Result is: "+z);
		}
		catch(ArithmeticException err){
			System.out.println("Error: "+err);
		}
		finally{
			s.close();
		}
	}
}