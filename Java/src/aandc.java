import java.util.Scanner;

class aandc{
	public static void main(String args[]){
		System.out.println("Enter the raius of the circle: ");
		Scanner s= new Scanner(System.in);
		double radius= s.nextDouble();
		
		double area= 3.14*Math.pow(radius,2);
		double circ= 2*3.14*radius;
		System.out.println("Area: "+area+" & Circumference: "+circ);
	}
}