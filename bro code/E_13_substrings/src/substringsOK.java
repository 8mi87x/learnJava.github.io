import java.util.Scanner;
public class substringsOK {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String email;
		String username;
		String domain;
		

		System.out.print("Enter your email: ");
		email = scanner.nextLine();
		
		
		
		if(email.contains("@")) {
			username = email.substring(0, email.indexOf("@"));
			//String domain = email.substring(8); this works too
			//String domain = email.substring(8, 17);
			domain = email.substring(email.indexOf("@")+1);
			System.out.println(username);
			System.out.println(domain);
			
		}else {
			
			System.out.println("Emails must contians @ characters!");
		}
		
		

		
		
		scanner.close();
		
	}

}
