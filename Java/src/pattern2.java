import java.util.Scanner;

class pattern2{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a number of lines: ");
		int n= s.nextInt();

		int i= n, j= 0;

		while(i>0){
			j= 0;
			while(j<n-i){
				System.out.print(" ");
				j= j+1;
			}
			for(int a=0; a<2*i-1 ;a++)
				System.out.print("*");
				
			System.out.println("");
			i= i-1;			
		} 
	}
}