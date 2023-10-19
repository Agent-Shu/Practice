package String;
import java.util.Scanner;

class string_search1{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str= s.nextLine();
		System.out.print("Enter a char to serach: ");
		String x= s.nextLine();
		int flag=-1;

		flag= str.indexOf(x);

		if(flag==-1)
			System.out.print("Char not found");
		else
			System.out.print("Char found at:"+flag);
		s.close();
	}
}