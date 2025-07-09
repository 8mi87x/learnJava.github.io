import java.util.Scanner;



public class UserInputs {
	
	
	
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("hello "+name);
		
		System.out.print("Enter your name: ");
		String name2 = scanner.nextLine();
		System.out.println("hello "+name2);
		
		
		System.out.print("Enter your name: ");
		String name3 = scanner.next();
		System.out.println("hello "+name3);
		
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		System.out.println("you are "+age+" years old");
		
		
		
		
		System.out.print("what is your gpa: ");
		double gpa = scanner.nextDouble();
		System.out.println("your gpa is "+gpa);
		
		System.out.print("are you a student? (true/falsde): ");
		boolean isStudent = scanner.nextBoolean();
		System.out.println("Student: "+isStudent);
		
		
		//COMMON ISSUES in the common issue class
		
		
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
