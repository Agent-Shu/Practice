import java.util.Scanner;
class sic{
	public static void main(String args[]){
		System.out.println("Input the principle ammount, rate and time:");
		Scanner s = new Scanner(System.in);
		int p= s.nextInt();
		int r= s.nextInt();
		int t= s.nextInt();
		System.out.println("Simple Interest: "+(p+r+t)/100);
	}
}