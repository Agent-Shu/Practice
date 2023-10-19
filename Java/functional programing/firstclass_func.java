@FunctionalInterface
interface Calculator<X, Y> {    
   public X compute(X a, Y b);
}

public class firstclass_func {
	public static void main(String[] args) {
		
	      Calculator<Integer, Integer> calculator = (a,b) -> a * b;

	      System.out.println(calculator.compute(2, 3));

	      printResult(calculator, 2, 3);

	      Calculator<Integer, Integer> calculator1 = getCalculator();
	      System.out.println(calculator1.compute(2, 3));
	   }

	   static void printResult(Calculator<Integer, Integer> calculator, Integer a, Integer b){
	      System.out.println(calculator.compute(a, b));
	   }

	   static Calculator<Integer, Integer> getCalculator(){
	      Calculator<Integer, Integer> calculator = (a,b) -> a * b;
	      return calculator;
	}

}