package Pattern;
import java.util.Scanner;

class number_pattern2{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter number of lines: ");
		int n=s.nextInt();
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j+"");
			}
			for(int j=i-1; j>0; j--){
				System.out.print(j+"");
			}
			System.out.print("\n");
		}
		s.close();
	}
}
			