class thread1{
	public static void main(String args[]){
		Thread th=Thread.currentThread();
	
		System.out.println("Current thread name :"+th);
		th.setName("Hello");
		System.out.println("New thread name: "+th.getName());
		try{
			for(int i=1;i<=10;i++){
				System.out.println(i);
				Thread.sleep(500);
				
				if(i >4)
					th.stop();
			}
		}
		catch(InterruptedException er){
			System.out.println(er.getMessage());
		}
	}
}