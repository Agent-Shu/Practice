import java.util.Scanner;

class profitloss{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Cost Price:");
		int cp= s.nextInt();
		System.out.print("Enter Selling Price:");
		int sp= s.nextInt();

		if(sp>=0 && cp>=0)
			if(sp>cp)
				System.out.println("It's profit by margin of: "+(sp-cp));	
			else if(cp>sp)
				System.out.println("It's Loss by margin of: "+(cp-sp));
			else
				System.out.println("Neither profit or loss");
		else
			System.out.println("Invalid Inputs");
	}
}

