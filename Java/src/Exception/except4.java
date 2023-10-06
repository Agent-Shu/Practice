package Exception;
public class except4{
	public static void main(String []args)
  	{
    		try{    	
    			Object obj[]=new String[4];
    			obj[0]="Saswata";
    			obj[1]="21";
    			obj[2]=134.56;              //not a string
    			obj[3]='m';
    	
    			for(int i=0;i<obj.length;i++){
    				System.out.println(obj[i]);
    			}
    		}
    		catch(ArrayStoreException err){
    			System.out.println("Error: "+err.getMessage());
    		}
  	}
}
