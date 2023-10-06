import java.util.StringTokenizer; 
   
public class string_token3{    
	public static void main(String args[]){
		StringTokenizer s= new StringTokenizer("Good Evening hello world"," ");    
     		
		while(s.hasMoreTokens()){
			System.out.println(s.nextElement());
          	}    
 	}      
} 