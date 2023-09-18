import java.util.Scanner;

class discount{
	static int disc(int price){
		if(price>0 && price <=2000)
			return 0;	
		else if(price>2000 && price <=5000)
			return 10;
		else if(price>5000 && price <=9000)
			return 15;
		else if(price>9000)
			return 25;
		else
			return -1;
	}

	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the price:");
		int price= s.nextInt();
		int dis= disc(price);
		if(dis == -1)
			System.out.println("Invalid Input");
		else{
			int price1= price- price*dis/100;
			System.out.println("Netprice is: "+price1+
			" & discount is:  "+price*dis/100);	
		}
	}
}