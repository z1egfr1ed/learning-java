package while_loops;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// String name = "";
		// while (name.isEmpty()) {
		// 	System.out.print("Please enter your name: ");
		// 	name = scanner.nextLine();
		// }
		// System.out.printf("Hello, %s!", name);

		int age = 0;

		do {
			System.out.println("Your age can't be negative");
			System.out.print("Enter your age: ");
			age = scanner.nextInt();
		} while (age < 0);

		System.out.printf("You are %d years old", age);

		scanner.close();
	}
}
