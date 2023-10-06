package Static;
//import java.util.Scanner;

class p{
	int x;
	static int y;

	p(){	
		x=0;		
	}
	public void get_count(){
		x= ++y;
	}
	void show(){
		System.out.println("x= "+x+" y="+y);
	}
}

class static_variable{
	public static void main(String args[]){	
		p ob= new p();
		ob.get_count();
		ob.show();			
	}
}