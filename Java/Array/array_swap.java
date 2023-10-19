import java.util.Scanner;

class array_swap{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter size of array(Even only): ");
		int n=s.nextInt();

		int arr1[]= new int[n];
		int arr2[]= new int[n];

		System.out.println("Enter elements of array");
		for(int i=0; i<n; i++)
			arr1[i]=s.nextInt();

		for(int i=0; i<n; i=i+2){
			arr2[i]= arr1[i+1];
			arr2[i+1]=arr1[i];
		}

		System.out.println("Elements of array 1");
		for(int i=0; i<n; i++)
			System.out.print(arr1[i]+",");

		System.out.print("\n");

		System.out.println("Elements of array 2");
		for(int i=0; i<n; i++){
			System.out.print(arr2[i]+",");
		}	
		s.close();	
	}
}
			