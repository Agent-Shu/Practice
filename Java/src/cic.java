import java.util.Scanner;
class cic{
	public static void main(String args[]){
		System.out.println("Input the principle ammount, rate, number of times enumeration and time:");
		Scanner s = new Scanner(System.in);
		double p= s.nextInt();
		double r= s.nextInt();
		double n= s.nextInt();
		double t= s.nextInt();
	
		double comp= p*Math.pow(1+r/n,n*t);	
		System.out.println("Compund Interest: "+comp);
	}
}