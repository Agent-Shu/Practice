package Matrix;
import java.util.Scanner;

class row_sum{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter row and col of matrix: ");
		int m= s.nextInt();
		int n= s.nextInt();
		int ar[][]=new int[m][n];
		
		System.out.print("Enter elements of matrix: ");
		for(int i=0; i<m; i++)
			for(int j=0; j<n; j++)
				ar[i][j]= s.nextInt();
		
		for(int i=0; i<m; i++){
			int sum= 0;
			for(int j=0; j<n; j++)
				sum= sum+ ar[i][j];
			System.out.println("Sum of row "+(i+1)+" : "+sum);
		}
		s.close();
	}
}
			