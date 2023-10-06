package Constructor;
//import java.util.Scanner;

class p{
	int x;
}

class q extends p{
	int x;
	q(int a,int b){
		super.x= a;
		this.x= b;
	}
	public void show(){
		System.out.println("x= "+super.x+" y= "+x);
	}
}

class child_parent_const_super{
	public static void main(String args[]){	
		q ob= new q(1,2);	
		ob.show();	
	}
}