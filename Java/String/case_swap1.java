package String;
import java.util.Scanner;

class case_swap1{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a string in Upper case: ");
		String x= s.nextLine();
		x= x.toLowerCase();

		System.out.print("Enter lower case string is: "+x);
		s.close();
	}
}