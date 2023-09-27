package Matrix;
import java.util.Scanner;

class diag1{
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
		int sum= 0;
		for(int i=0; i<m; i++)
			sum= sum+ ar[i][i];
		System.out.println("Sum of left diag: "+sum);

		sum= 0;
		for(int i=m-1, j=0; (i>=0) && (j<n); i--,j++)
			sum= sum+ ar[i][j];
		System.out.println("Sum of right diag: "+sum);	
		s.close();	
	}
}
			