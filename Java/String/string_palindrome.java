package String;
import java.util.Scanner;

class string_palindrome{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String x= s.nextLine();
		
		int len= x.length();
		int flag= 0;
		for(int i=0; i<=(len-1)/2; i++)
			if(x.charAt(i)!=x.charAt(len-1-i)){
				flag=1;
				break;
			}

		if(flag==0)
			System.out.print("It is a plindrome");
		else if(flag==1)
			System.out.print("It is not a plindrome");
		s.close();
	}
}