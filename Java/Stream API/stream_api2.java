import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stream_api2{
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);

		memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		
		memberNames.forEach(System.out::println);
		
		
		List<String> memNamesInUppercase = memberNames.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());

        	System.out.print(memNamesInUppercase);
        
        	boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
         
        	System.out.println(matchedResult);    
         
        	matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));
         
        	System.out.println(matchedResult);     
         
        	matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));
         
        	System.out.println(matchedResult);  
       
        	long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();
        	 
        	System.out.println(totalMatched);   
        
        	boolean matched = memberNames.stream().anyMatch((s) -> s.startsWith("A"));         
        	System.out.println(matched);
      
        	String firstMatchedName = memberNames.stream().filter((s) -> s.startsWith("L")).findFirst().get();
     
        	System.out.println(firstMatchedName); 		
	}

}
