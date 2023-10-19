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

class static_var{
	public static void main(String args[]){	
		p ob= new p();
                p ob1= new p();
		p ob2= new p();
		ob.get_count();
		ob1.get_count();
		ob2.get_count();
		ob.show();
		ob1.show();
		ob2.show();			
	}
}