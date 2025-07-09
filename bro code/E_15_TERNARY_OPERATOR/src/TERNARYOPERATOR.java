
public class TERNARYOPERATOR {
	
	public static void main(String[] args) {
		
		
		int score = 30;
		
//		if(score >=60) {
//			
//			System.out.println("PASS");
//		}else {
//			System.out.println("FAIL");
//		}
		
		
		
		String passOrFail = (score >= 60) ? "PASS" : "FAIL";
		
		System.out.println(passOrFail);
		
		
		int number = 3;
		
		String evenOrOdd = (number%2 == 0) ? "EVEN" : "ODD";
		
		System.out.println(number);
		
		
		int hours = 13;
		
		String timeOfDay = (hours < 12) ? "A.M.":"P..M";
		
		System.out.println(timeOfDay);
		
		
		int income = 60000;
		
		double taxRate = (income >= 40000) ? 0.25 : 0.15;
		
	}

}
