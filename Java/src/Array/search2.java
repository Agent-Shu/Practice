import java.util.Scanner;

class search2{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n= s.nextInt();
		
		int arr[]= new int[n];
		System.out.println("Enter elements of array(sorted)");
		for(int i=0; i<n; i++)
			arr[i]= s.nextInt();

		System.out.print("Enter element to search: ");
		int sr= s.nextInt();
		
		int flag= -1, start= n/2, stop= n;
		
		while(start != stop){
			if(arr[start] == sr){
				flag= start;
				break;
			}
			
			else if(arr[start] > sr){
				stop= start;
				start= start/2;
			}

			else if(arr[start] < sr){
				start= (stop+start)/2+1;
			}
			
			else if(start==stop)
				break;				
		}
			

		if(flag==-1)
			System.out.println("Element isnt present");
		else if(flag!=-1)
			System.out.println("Element is present at pos: "+flag);
		s.close();
	}
}
