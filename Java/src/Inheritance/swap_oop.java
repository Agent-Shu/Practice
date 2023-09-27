package Inheritance;
import java.util.Scanner;

class sw{	
	public void swap(int x, int y){
		x= x+y;
		y= x-y;
		x= x-y;
		System.out.println("Value of x and yare:"+x+" "+y);
	}
	public void swap(int x, int y,int flag){
		flag = x;
		x = y;
		y = flag;
		System.out.println("Value of x and yare:"+x+" "+y);
	}
}

class swap_oop{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		sw ob= new sw();
		System.out.print("Enter two number: ");
		int x= s.nextInt(), y= s.nextInt();
		ob.swap(x,y);
		ob.swap(x,y,1);
		s.close();
	}
}