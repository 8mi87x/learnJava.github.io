
public class PrintFU {
	
	public static void main(String[] args) {
		
		
		String name = "SpongeBob";
		char FirstLetter = 'S';
		int age = 30;
		double height = 60.5;
		boolean isEmployed = true;
		
		System.out.printf("Hello! %s\n",name);
		System.out.printf("your name start with a %c\n",FirstLetter);
		System.out.printf("You are %d years old\n", age);
		System.out.printf("You are %f inches tall\n", height);
		System.out.printf("Employed: %b\n",isEmployed);
		
		
		System.out.printf("%s is %d years old \n", name, age);
		
		
		double price1 = 90000.99;
		double price2 = 1000000.15;
		double price3 = -540000.01;
		
		System.out.printf("%(,+.5f\n",price1);
		System.out.printf("%(,+.5f\n",price2);
		System.out.printf("%(,+.5f\n",price3);
		
		
		
		int id1 = 1;
		int id2 = 23;
		int id3 = 456;
		int id4 = 7890;
		
		System.out.printf("%04d\n",id1);
		System.out.printf("%04d\n",id2);
		System.out.printf("%04d\n",id3);
		System.out.printf("%04d\n",id4);
		
		System.out.printf("%4d\n",id1);
		System.out.printf("%4d\n",id2);
		System.out.printf("%4d\n",id3);
		System.out.printf("%4d\n",id4);
		
		System.out.printf("%-4d\n",id1);
		System.out.printf("%-4d\n",id2);
		System.out.printf("%-4d\n",id3);
		System.out.printf("%-4d\n",id4);
	}

}
