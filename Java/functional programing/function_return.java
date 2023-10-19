import java.util.function.*;

public class function_return {
	public static void main(String[] args) {
		
		Function<Integer, Integer> obj1 = adder(1);
	      	Function<Integer, Integer> obj2 = adder(2);
	      	Function<Integer, Integer> obj3 = adder(3);

	      	Integer res1 = obj1.apply(4);
	      	System.out.println(res1);

	      	Integer res2 = obj2.apply(4);
	      	System.out.println(res2);

	      	Integer res3 = obj3.apply(4);
	      	System.out.println(res3);
	}
	
	static Function<Integer, Integer> adder(Integer x){
	      return y -> y + x;
	}
}