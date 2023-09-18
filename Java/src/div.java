import java.util.Scanner;

class div{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter number to be divided: ");
		int num= s.nextInt();
		System.out.print("Enter divisor: ");
		int divisor= s.nextInt();

		System.out.println("Quotient: "+num/divisor);	
		System.out.println("Remainder: "+num%divisor);
	}
}
