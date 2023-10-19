package Exception;
public class except3 
{
	public static Integer x;

	public static void main(String []args){
		try{
			show(x);
		}
		catch(NullPointerException err){
			System.out.println("Error: "+err.getMessage());
		}
   	}

	static void show(int a){
		int p=a*2;
		System.out.println("p:"+p);
   	}	
}
