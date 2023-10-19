import java.util.*;

public class functional_order {
	public static void main(String[] args) {
	      List<Integer> num = Arrays.asList(34, 40, 60, 17, 39);

	      Collections.sort(num, (a,b) ->{ return a.compareTo(b); });

	      System.out.println(num);
	      Comparator<Integer> comparator = (a,b) ->{ return a.compareTo(b); };
	      Comparator<Integer> rev = comparator.reversed();
	      
	      Collections.sort(num, rev);
	      System.out.println(num);
	}
}