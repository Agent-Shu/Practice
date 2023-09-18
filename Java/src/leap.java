import java.util.Scanner;

class leap{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a year: ");
		int y= s.nextInt();

		if((y%4 == 0 && y%100!=0) || (y%400==0))
			System.out.println(y+" is a leap year");
		else	
			System.out.println(y+" is not a leap year");
	}
}