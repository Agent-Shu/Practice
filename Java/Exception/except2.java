package Exception;
class except2{
	public static void main(String args[]){
		int ar[]= {1,2,3,4,5};
		try{
			ar[10]= 10;
			for(int i=0; i< ar.length; i++)
				System.out.print(ar[i]+",");		
		}
		catch(ArrayIndexOutOfBoundsException err){
			System.out.println("Error: "+err.getMessage());
		}
		finally{
		
		}	
	}
}	