package math;

import java.util.Locale;
import java.util.Scanner;

public class MathClass {
	public static void main(String[] args) {
		// System.out.println(Math.PI);
		// System.out.println(Math.E); // Euler's Number
		
		double result;

		result = Math.pow(6, 2); // 2² = 36
		result = Math.abs(-5); // 5
		result = Math.sqrt(49); // Square root of 49 = 7
		result = Math.round(3.14); // 3
		result = Math.round(3.5); // 4
		result = Math.ceil(3.13); // 4
		result = Math.floor(3.13); // 3
		result = Math.max(10, 20); // 20
		result = Math.min(10, 11); // 10
		
		// HYPOTENUSE c = Math.sqrt(a² + b²)
		double a;
		double b;
		double c;

		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);

		System.out.print("Enter the length of a side A: ");
		a = scanner.nextDouble();
		System.out.print("Enter the length of a side B: ");
		b = scanner.nextDouble();

		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

		System.out.printf("The hypotenuse (side c) is: %.1fcm\n", c);
		scanner.close();
	}
}
