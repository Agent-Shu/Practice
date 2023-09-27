import java.util.Scanner;

class search1{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n= s.nextInt();
		
		int arr[]= new int[n];
		System.out.println("Enter elements of array");
		for(int i=0; i<n; i++)
			arr[i]= s.nextInt();

		System.out.print("Enter element to search: ");
		int sr= s.nextInt();
		
		int flag= -1;
		for(int i=0; i<n; i++)
			if(arr[i]== sr){
				flag=i+1;
				break;
			}

		if(flag==-1)
			System.out.println("Element isnt present");
		else if(flag!=-1)
			System.out.println("Element is present at pos: "+flag);
		s.close();
	}
}
