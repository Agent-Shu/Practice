import java.util.Scanner;

class fibonacci{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n= s.nextInt();
		
		int a=0,b=1,c=1;
		
		if(n<3){
			if(n==1)
				System.out.print(a);
			else if(n==2)
				System.out.print(a+","+b);
			else
				System.out.print("Check your inputs");	
		}
		
		else if(n>2){
			System.out.print(a+","+b);
			for(int i=2;i<n;i++){
				c = a+b;
				a = b;
				b = c;
				System.out.print(","+c);		
			}
		}

		else
			System.out.print("Check your inputs");	
		s.close();
	}
}





