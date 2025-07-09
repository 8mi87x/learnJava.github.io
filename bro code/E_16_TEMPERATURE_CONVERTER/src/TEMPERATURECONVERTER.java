import java.util.Scanner;

public class TEMPERATURECONVERTER {

	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		double temp;
		double newTempl;
		String unit;
		
		
		System.out.print("Enter the temprature: ");
		temp = scanner.nextDouble();
		
		System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
		unit = scanner.next().toUpperCase(); //idk bro
		
		//(Condition) true : false
		newTempl  = (unit.equals("C")) ? (temp - 32) *5/9 : (temp * 5/9) + 32;
		
		System.out.printf("%.2f °%s",newTempl, unit);
		
		scanner.close();
	}
}
