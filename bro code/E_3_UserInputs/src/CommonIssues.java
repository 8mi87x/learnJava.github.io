import java.util.Scanner;



public class CommonIssues {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		//COMMON PORBLEM
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
		
		System.out.print("Enter your favorite color: ");
		String color = scanner.nextLine();
		
		System.out.println("your age is: "+age+"\n your favorite color is: "+color);
		
		//TO FIX THIS
		System.out.print("Enter your age: ");
		int age2 = scanner.nextInt();
		scanner.nextLine(); //this is removing /n character in age/n so it wont be color2 = /n
		
		
		System.out.print("Enter your favorite color: ");
		String color2 = scanner.nextLine();
		
		System.out.println("your age is: "+age2+"\n your favorite color is: "+color2);
		
		
	}

}
