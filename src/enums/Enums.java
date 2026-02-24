package enums;

import java.util.Scanner;

public class Enums {
	public static void main(String[] args) {

		// Enums = (Enumerations) A special kind of class that
		//         represents a fixed set of constants.
		//         They improve code readability and are easy to maintain.
		//         More efficient with switches rather than comparing Strings.

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a day of the week: ");
		String response = sc.nextLine().toUpperCase();

		try {
			Day day = Day.valueOf(response);

			switch (day) {
				case MONDAY,
				     TUESDAY,
				     WEDNESDAY,
				     THURSDAY,
				     FRIDAY -> System.out.println("It's a weekday");
				case SATURDAY,
				     SUNDAY -> System.out.println("It's a weekend");
			}
		} catch (IllegalArgumentException e) {
				System.out.println("Please enter a valid day");
		}

		sc.close();
	}
}
