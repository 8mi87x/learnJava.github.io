import java.util.Scanner;

public class ENHANCEDSWITCHES {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		String day = "Wednesday";
		
		
		System.out.println("Enter the day of weekend: ");
		day = scanner.nextLine();
		

		
		
		switch(day) {
		
		case "Monday" -> System.out.println("It is a weekday ");
		case "Tuesday" -> System.out.println("It is a weekday2");
		case "Wednesday" -> System.out.println("It is a weekday3");
		case "Friday" -> System.out.println("It is a weekday4");
		case "Saturday" -> System.out.println("It is a weekday5");
		case "Sunday" -> System.out.println("It is a weekday6");
		
		default -> System.out.println(day + " is not a day");
		}
		
		
		switch(day) {
		
		case "Monday","Tuesday","Wednesday","Friday" ->
		       System.out.println("Its the weeeeeekend :DDD");
		       
		case "Saturday","Sunday" -> System.out.println("bruhh");
		
		default -> System.out.println(day + " is not a day");
		}
		
		scanner.close();
	}
}
