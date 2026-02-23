package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {

		// Exception = An event that interrupts the normal flow of a program
		//             (Dividing by zero, file not found, mismatch input type)
		//             Surround any dangerous code with a try {} block
		//             try{}, catch{}, finally{}

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();
			System.out.println(number);
		} catch (InputMismatchException e) {
			System.out.println("THAT WASN'T A NUMBER");
		} catch (Exception e) {
			// SAFETY NET
			System.out.println("SOMETHING WENT WRONG");
		}

	}
}
