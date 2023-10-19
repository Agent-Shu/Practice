import java.util.Scanner;

class array_print{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n= s.nextInt();
		int temp[]= new int[n];
		System.out.print("Enter elements of array: ");
		for(int i=0; i<n; i++)
			temp[i]=s.nextInt();
		
		System.out.println("The elements of array are: ");
		for(int i=0; i<n; i++)
			System.out.print(temp[i]+",");
		s.close();
	}
}