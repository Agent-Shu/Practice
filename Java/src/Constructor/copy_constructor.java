package Constructor;
//import java.util.Scanner;

class abc{
	int x;
	public abc(){
		System.out.println("This is constructor");
	}	
	public abc(int a){
		x=a;
	}
	public abc(abc ob){
		x= ob.x;
	}
	void show(){
		System.out.println("x = "+x);
	}
}

class copy_constructor{
	public static void main(String args[]){
		abc ob1= new abc(100);
		abc ob2= new abc(ob1);
		abc ob3= ob1;
		
		ob1.show();
		ob2.show();
		ob3.show();
	}
}