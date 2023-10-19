package Pattern;
import java.util.Scanner;

class number_pattern{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter limit: ");
		int n=s.nextInt();
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(i+" ");
			}
			System.out.print("\n");
		}
		s.close();
	}
}
			