import java.util.Scanner;

class prime_fibonacci{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n= s.nextInt();
		
		int a=2,b=3,c=5;
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
			for(int i=2;i<n;){
				c = a+b;
				a = b;
				b = c;

				int flag = 0;
				for(int j=2;j<=c/2;j++)
					if(c%j==0)
						flag= 1;
				if(flag== 1)
					continue;
				else if(flag== 0){
					System.out.print(","+c);					
					i++;
				}
			}
		}
		else
			System.out.print("Check your inputs");	
		s.close();
	}
}





