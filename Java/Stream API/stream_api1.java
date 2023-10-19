import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class stream_api1{
	public static void main(String[] args) {
     		List <Integer> list=new ArrayList<Integer>();
     		for(int i=0;i<20;i++)
    	 		list.add(i);
     		
     		Stream<Integer> stream= list.stream();

     		List<Integer> evenNumbersList= stream.filter(i->i%2==0).collect(Collectors.toList());
     		System.out.println(evenNumbersList);

     		System.out.println("----------------------------------------------------");
     		
		List<Integer> list1=new ArrayList<Integer>();
     		for(int i=0;i<11;i++)
    	 		list1.add(i);
     		Stream<Integer> stream1=list1.stream();
     		stream1.forEach(p -> System.out.println(p));

     		System.out.println("---------------------------------------------------");
     
     		Stream<Integer> stream2= list1.stream();
     		stream2.filter(i->i%2==0).forEach(System.out::println);
     
     		System.out.println("---------------------------------------------------");
    		
		Stream<Integer> stream3=list1.stream();
    		Integer[] evenNumbersArr= stream3.filter(i->i%2==0).toArray(Integer[]::new);
     		for(Integer num: evenNumbersArr) 
        		System.out.println(num);

	}
}

