import java.util.Scanner;

class fact{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter number: ");
		int n= s.nextInt();
		
		if(n==0)
			System.out.print("1");
		
		else if(n>0){	
			long f=1;
			for(int i=n;i>1;i--)
				f= f*i;						
			System.out.print("Factorial of "+n+" is: "+f);
		}

		else
			System.out.print("Check your inputs");
	}
}	