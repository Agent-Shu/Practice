//import java.util.Scanner;

class external{
	public void method2(){
		System.out.println("\nExternal Class Method");
	}
}

class func{	
	static void method1(){
		System.out.println("\nIn Class Method");
	}
	public static void main(String args[]){
		external x = new external();
		method1();
		x.method2();	
	}
}