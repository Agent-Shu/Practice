public class classes {
    static void myFunc(){
        System.out.println("this is function");
    }

    public void myFunc1(){
        System.out.println("this is another function");
    }

    public static void main(String[] args) {
       myFunc();

       classes x = new classes();
       x.myFunc1();
    }
}
