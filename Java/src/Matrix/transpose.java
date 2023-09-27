package Matrix;
import java.util.Scanner;

class transpose{
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
			System.out.print("|");
			for(int j=0; j<n; j++)		
				System.out.print(ar[i][j]+" | ");
			System.out.println("");
		}

		for(int i=0; i<m; i++)
			for(int j=0; j<i; j++){
				int temp= ar[i][j];
				ar[i][j]= ar[j][i];
				ar[j][i]= temp;	
			}
		
		System.out.println("After Transpose: ");
		for(int i=0; i<m; i++){
			System.out.print("|");
			for(int j=0; j<n; j++)		
				System.out.print(ar[i][j]+" | ");
			System.out.println("");
		}
		s.close();
	}
}
			