import java.time.LocalDate;
import java.time.LocalDateTime;

class time3{
	public static void main(String[] args){
		LocalDate date = LocalDate.of(2019, 1,1); 
		LocalDateTime datetime = date.atTime(1,50,19);
		System.out.println(datetime);   		  
	}
}