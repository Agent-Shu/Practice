package Inheritance;
//import java.util.Scanner;

class method1{
	public void a(){
		System.out.println("Inside method 1");
	}
}

class method2 extends method1{
	public void a(){
		System.out.println("Inside method 2");
	}
}

class method_overriding{
	public static void main(String args[]){
		method2 ob= new method2();
		ob.a();
		ob.a();
	}
}


