
public class StringMethodsJava {
	
	public static void main(String[] args) {
		
		
		
		String name = "Bro Code";
		
		int length = name.length();
		char letter = name.charAt(0);
		int index = name.indexOf(" ");
		int lastIndex = name.lastIndexOf("o");
		
		name = name.toUpperCase();
		name = name.toLowerCase();
		
		name = name.trim();
		
		name = name.replace("o", "c");
		
		
		
		//ystem.out.println(name.isEmpty());
		
		
		if(name.isEmpty()) {
			
			
			System.out.println("Your name is empty");
		}else {
			
			System.out.println("Your name is "+name);
		}
		
		
		
		if(name.contains(" ")) {
			
			System.out.println("Your name contains spaces");
		}else {
			System.out.println("Your name doesn't contain any spaces");
		}
		
	    
		
		//if(name.equalsIgnoreCase("password"))          -- this ignore key sensitives letters
		if(name.equals("password")) {
			
			
			System.out.println("Your name can;t be password");
		}else {
			
			System.out.println("Hello "+name);
		}
	}

}
