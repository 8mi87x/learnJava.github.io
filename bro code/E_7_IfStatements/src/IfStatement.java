import java.util.Scanner;

public class IfStatement {
	
	public static void main(String[] args) {
		
		int age;
		String name;
		boolean isStudent;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name = scanner.nextLine();
		
		
		
		System.out.print("Enter your age: ");
		age = scanner.nextInt();
		
		
		System.out.println("Are you a student (true/false): ");
		isStudent = scanner.nextBoolean();
		
		
		//GROUP 1
		
		if(name.isEmpty()) {
			
			System.out.println("you didn't enter your name");
		}else {
			System.out.println("Hello "+name+"!" );
		}
		
		
		
		//GROUP 2
		
		if (age >= 65) {
			System.out.println("You are a seniors!");
		}
		else if(age >= 18) {
			
			System.out.println("you are an adult!");
		}
		else if (age < 0) {
			System.out.println("you haven't even born yet! 🤣");
		}
		else if( age == 0) {
			System.out.println("You are a baby!❤❤");
			
		}

		else
		{
			
			System.out.println("You are an child!");
		}
		
		
		//GROUP 3
		
		if(isStudent) {
			
			System.out.println("You are an Student!");
		}else {
			System.out.println("you are NOT an Student!");
		}
		
		scanner.close();
	}

}
