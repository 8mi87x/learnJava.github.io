import java.util.Random;


public class RandomNumber {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int number;
		
		number = random.nextInt(1, 500);
		
		System.out.println(number);
		
		double number2;
		
		number2 = random.nextDouble();
		
		
		System.out.println(number2);
		
		
		boolean isHead;
		
		isHead = random.nextBoolean();
		
		if(isHead) {
			
			System.out.println("Head");
		}else {
			
			System.out.println("Tail");
		}
	}

}
