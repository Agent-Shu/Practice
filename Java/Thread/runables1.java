class NameRunnable implements Runnable{ 
    public void run() {
    	try{
			for (int x = 1; x <= 3; x++){
				System.out.println("Run by "+ Thread.currentThread().getName()+ ", x is " + x);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException er){
			System.out.println(er.getMessage());
		}
	}
}
	
class runables1{
	public static void main(String[] args){
		NameRunnable nr = new NameRunnable();
		
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);

		one.setName("hello");
		two.setName("world");
		three.setName("test");

		one.start();
		two.start();
		three.start();
	}
}