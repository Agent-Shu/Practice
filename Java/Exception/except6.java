package Exception;
import java.util.Scanner;

class except6{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter two number:");
		int x= s.nextInt();
		int y= s.nextInt();
		try{
			if(x >= y)
				System.out.print("Result: "+ x/y);
			else{
				s.close();
				throw new problem("Y is greater than X");
			}
		}
		catch(problem err){
			System.out.println("Error: "+ err.getMessage());
		}
	}
}

class problem extends Exception{
	public problem(String s){
		super(s);
	}
}