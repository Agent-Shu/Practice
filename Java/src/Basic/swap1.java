import java.util.Scanner;

class swap1{
	public static void main(String args[]){
		System.out.println("Input two numbers:");
		Scanner s = new Scanner(System.in);
		int x= s.nextInt();
		int y= s.nextInt();
		System.out.println("Two numbers before swap x= "+x+" & y= "+y);
		x= x+y;
		y= x-y;
		x= x-y;
		System.out.println("Two numbers after swap x= "+x+" & y= "+y);
		s.close();
	}
}