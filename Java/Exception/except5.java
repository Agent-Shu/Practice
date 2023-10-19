package Exception;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class except5{
	public static void main(String[] args) throws Exception{

		BufferedReader dis= new BufferedReader(new InputStreamReader(System.in));;
		int n,i,v=0,iv=0;
		for(i=1;i<=6;i++){
			try{
				System.out.print("Enter number :");
				n= Integer.parseInt(dis.readLine());
				v++;
			}
			catch(NumberFormatException err){
				iv++;
				continue;
			}
		}
		
		System.out.println("Valid number ="+v);
		System.out.print("In valid number ="+iv);	
	}
}
