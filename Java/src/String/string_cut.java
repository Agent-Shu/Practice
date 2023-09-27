package String;
import java.util.Scanner;

class string_cut{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str= s.nextLine();
		System.out.print("Enter cut position(start and stop): ");
		int m= s.nextInt();
		int n= s.nextInt();

		if(str.length()<n && m>-1 && m<n)
			System.out.print("Not possibe to cut");
		else
			System.out.println(str.substring(m,n));
		s.close();
	}
}