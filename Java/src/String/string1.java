package String;
import java.util.Scanner;

class string1{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str= s.nextLine();
		
		for(int i=0, j=str.length()-1; j>=0; i++, j--)
			System.out.print(str.charAt(i));

		s.close();
	}
}