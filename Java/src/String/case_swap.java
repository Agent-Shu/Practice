package String;
import java.util.Scanner;

class case_swap{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a string in lower case: ");
		String x= s.nextLine();
		x= x.toUpperCase();

		System.out.print("Enter upper case string is: "+x);
		s.close();
	}
}