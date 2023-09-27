import java.util.Scanner;

class sorting1{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n=s.nextInt();
		
		int arr[]= new int[n];
		System.out.println("Enter elements of array");
		for(int i=0; i<n; i++)
			arr[i]=s.nextInt();

		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(arr[j]>=arr[i]){
					int x= arr[j];
					arr[j]=arr[i];
					arr[i]=x;	
				}
			}
		}
		
		System.out.println("Elements of array are:");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+",");
		s.close();
	}
}