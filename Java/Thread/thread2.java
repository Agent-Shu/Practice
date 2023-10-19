class thread extends Thread{
    thread(){
        start();
    }
    public void prnt(){
        System.out.println("Fucntion without parameter");
    }
    public void prnt(String x){
        System.out.println("Fucntion without parameter: "+x);
    }
}

class thread2{
    public static void main(String[] args){
        thread ob= new thread();
        ob.prnt();
        ob.prnt("Hello");
    } 
}
