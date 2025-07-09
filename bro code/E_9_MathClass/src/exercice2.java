import java.util.Scanner;


public class exercice2 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		double radius;
		double cricumference;
		double area;
		double volume;
		
		
		
		System.out.print("Enter the radius: ");
		radius = scanner.nextDouble();
		
		
		cricumference = 2 * Math.PI * radius;
		area = Math.PI * Math.pow(radius, 2);
		volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		
		System.out.printf("circumference is %.1fcm\n",cricumference);
		System.out.printf("area is %.1fcm²\n",area);
		System.out.printf("volume is %.1fcm³\n",volume);
		
		scanner.close();
	}

}
