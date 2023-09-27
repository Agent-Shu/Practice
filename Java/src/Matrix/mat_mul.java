package Matrix;
import java.util.Scanner;

class mat_mul{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter row and col of matrix's: ");
		int m= s.nextInt();
		int n= s.nextInt();
		int ar1[][]=new int[m][n], ar2[][]=new int[m][n], ar3[][]=new int[m][n];
		
		System.out.print("Enter elements of matrix 1: ");
		for(int i=0; i<m; i++)
			for(int j=0; j<n; j++)
				ar1[i][j]= s.nextInt();
		
		System.out.print("Enter elements of matrix 2: ");
		for(int i=0; i<m; i++)
			for(int j=0; j<n; j++)
				ar2[i][j]= s.nextInt();

		for(int i=0; i<m; i++)
			for(int j=0; j<n; j++){
				int temp=0;
				for(int a=0; a<m; a++)
					temp = temp + (ar1[i][a]*ar2[a][j]);	
				
				ar3[i][j] = temp;
			}
			
		for(int i=0; i<m; i++){
			System.out.print("|");
			for(int j=0; j<n; j++)		
				System.out.print(ar3[i][j]+" | ");
			System.out.println("");
		}
		s.close();	
	}
}
			