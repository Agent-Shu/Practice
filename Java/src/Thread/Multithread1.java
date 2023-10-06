class Xyz implements Runnable{
	Thread th;
	Xyz(){
		th=new Thread(this,"hello");
		System.out.println(th);
		th.start();
	}
	public void run()	{
		try		{
			for(int i=1;i<=8;i++)
			{
				System.out.println(i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException ix)		{
			System.out.println(ix.getMessage());
		}
		System.out.println("Exit from Xyz class");
	}
}
class Multithread1{
	public static void main(String args[]){
		new Xyz();
		try{
			for(int j=1;j<=5;j++){
				System.out.println("Multithread1 of j= "+j);
				Thread.sleep(1000); 
			}
		}
		catch(InterruptedException ex){
			System.out.println(ex.getMessage());
		}
		System.out.println("Exit from Multithread1 class");
	}
}