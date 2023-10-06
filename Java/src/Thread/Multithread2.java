class Chariot extends Thread{
	Chariot(){
		super("Hello Thread");
		System.out.println(this);
		start();
	}
	public void run(){
		try{
			for(int i=5;i>=1;i--){
				System.out.println(i);
				Thread.sleep(500);
			}
			
		}
		catch(InterruptedException ex){
			System.out.println(ex.getMessage());
		}
		System.out.println("exit from Chariot class");
	}
}
class Multithread2{
	public static void main(String args[]){
		new Chariot();
		try{
			for(int j=1;j<=5;j++){
				System.out.println("Rath of j= "+j);
				Thread.sleep(500);
			}
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		System.out.println("Exit from Rath class");
	}
	
}