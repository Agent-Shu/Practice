import java.util.Scanner;

class lcm{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a= s.nextInt();
		int b= s.nextInt();

		System.out.print("Enter number check terms: ");
		int n= s.nextInt();

		if(a>0 && b>0){
			int l=0;
			for(int i=1;i<=n;i++){				
				for(int j=1;j<=n;j++){
					if(a*i==b*j){
						System.out.println("LCM of "+a+","+b+"is: "+b*j);
						l= b*j;
						break;
					}
					if(l!=0)
						break;
				}
				if(l!=0)
					break;
			}		
			System.out.println("HCF of "+a+","+b+"is: "+((a*b)/l));
		}
		else
			System.out.print("Check your inputs");
	}
}