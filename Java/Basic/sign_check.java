import java.util.Scanner;

class sign_check{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x= s.nextInt();

		if(x<0)
			System.out.println("It is negative");
		else if(x>0)
			System.out.println("It is positive");
		else
			System.out.println("Neutal");
		s.close();
	}
}	