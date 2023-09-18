import java.util.Scanner;

class external{
	public static void method2(){
		System.out.println("\nExternal Class Method");
	}
}

class func{
	external x;
	
	static void method1(){
		System.out.println("\nIn Class Method");
	}
	public static void main(String args[]){
		method1();
		x.method2();	
	}
}