import java.util.Scanner;

class disorium{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n= s.nextInt();
		
		int len=0, temp=n;
		double count=0;
		while(temp >0){
			len= len+1;
			temp= temp/10;
		}

		temp= n;
		while(temp >0){
			count= count + Math.pow((temp%10),len);
			len= len-1;
			temp= temp/10;
		}


		if(n == count)
			System.out.print("It is a disorium number");
		else
			System.out.print("It is not a disorium number");
	}

}