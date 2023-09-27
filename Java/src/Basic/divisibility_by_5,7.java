import java.util.Scanner;

class divisi{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num= s.nextInt();
		
		if(num%5==0 && num%7==0)
			System.out.print("Divisible by 5 & 7");
		else if(num%5==0)
			System.out.print("Divisible by 5");
		else if(num%7==0)
			System.out.print("Divisible by 7");				
		else
			System.out.print("Not divisble by 5 & 7");
		s.close();
	}
}
