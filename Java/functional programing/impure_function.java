public class impure_function {
	private static double valueUsed = 0.0; 
		public static void main(String[] args) {

	      	double result = randomSum(2.0,3.0);
	      	System.out.println(result);

	      	result = randomSum(2.0,3.0);
	      	System.out.println(result);
	}
	static double randomSum(double a, double b){
	  	valueUsed = Math.random();       
	      	return valueUsed + a + b;
	}
}	