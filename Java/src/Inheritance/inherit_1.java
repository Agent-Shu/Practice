package Inheritance;
import java.util.Scanner;

class store{
	String name;
	Scanner s= new Scanner(System.in);	
	public void get_name(){
		System.out.println("Enter your name: ");
		name= s.nextLine();
	}
}

class full_name extends store{
	String sur_name;
	public void get_surname(){
		System.out.println("Enter your sur name: ");
		sur_name= s.nextLine();
	}

	public void concat(){
		System.out.println(name.concat(sur_name));
	}
}	

class inherit_1{
	public static void main(String args[]){
		full_name ob= new full_name();
		ob.get_name();	
		ob.get_surname();
		ob.concat();
	}
}