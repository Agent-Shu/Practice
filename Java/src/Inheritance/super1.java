package Inheritance;
class a{
	int x, y;
	a(int a, int b){
		x=a; 
		y=b;
		System.out.println("A and B: "+x+" "+y);
	}
}

class b extends a{
	b(int a, int b){
		super(a,b);
	}
}

class super1{
	public static void main(String args[]){
		b ob=new b(1,2);	
	}
}