package Constructor;
//import java.util.Scanner;

class sw{
	sw(){
		System.out.println("This is constructor");
	}	
	sw(String x){
		System.out.println(x+" This is constructor");
	}
	void show(){
		//just to remove the warning of ob,ob1 not used
	}
}

class constructor{
	public static void main(String args[]){
		sw ob= new sw();
		sw ob1= new sw("Hello");

		ob.show();
		ob1.show();
	}
}