package Pattern;
import java.util.Scanner;

class pattern1{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a number of lines: ");
		int n= s.nextInt();

		int i= 0, j= 0;
		int counter = ((2*n)-1)/2;

		while(i< n){
			while(j< counter){
				System.out.print(" ");
				j++;
			}

			for(int a=0; a<2*i+1 ;a++)
				System.out.print("*");
				
			System.out.println("");
			j=0;
			i= i+1;
			counter= counter-1;
		} 
		s.close();
	}
}