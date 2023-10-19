package Constructor;
//import java.util.Scanner;

class p{
	p(){
		System.out.println("Inside parent class");
	}
	p(int a){
		System.out.println("Inside parent class with val");
	}
}

class c extends p{
	c(){
		System.out.println("Inside child class");
	}
	c(int a){
		System.out.println("Inside child class with val");
	}
}

class child_parent_const{
	public static void main(String args[]){
		//c ob= new c();
		c ob1= new c(1);		
	}
}