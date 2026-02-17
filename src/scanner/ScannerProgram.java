package scanner;

import java.util.Scanner;
import java.util.Locale;


public class ScannerProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);

		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		System.out.print("What is your gpa: ");
		double gpa = scanner.nextDouble();

		System.out.println("Are you a student (true/false)");
		boolean isStudent = scanner.nextBoolean();

		System.out.println("Hello, " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("You gpa is " + gpa);

		if (isStudent) {
			System.out.println("You are enrolled as a student");
		} else {
			System.out.println("You are NOT enrolled");
		}

		scanner.close();
	}
}
