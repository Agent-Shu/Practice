import java.util.Scanner;

class palindrome{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a range: ");
		int a= s.nextInt();
		int b= s.nextInt();
		
		int x=0, y=0;
		for(int i=a;i<=b;i++){
			x= i;
			y= 0;
			while(x>0){
				y= y*10;
				y= y+ x%10;
				x= x/10;
			}		
			if(i==y)
				System.out.print(y+",");
		}
		s.close();
	}

}