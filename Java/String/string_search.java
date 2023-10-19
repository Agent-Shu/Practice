package String;
import java.util.Scanner;

class string_search{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str= s.nextLine();
		System.out.print("Enter a char to serach: ");
		String x= s.nextLine();
		int flag=0;

		for(int i=0; i<str.length(); i++)
			if(str.charAt(i) == x.charAt(0)){
				System.out.println("Char present at :"+(i+1));
				flag= 1;
			}
		if(flag==0)
			System.out.print("Char is not present");
		s.close();
	}
}