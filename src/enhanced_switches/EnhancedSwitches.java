package enhanced_switches;

import java.util.Scanner;

public class EnhancedSwitches {
	public static void main(String[] args) {

		// Enhanced switch = A replacement to many else if statements
		//                   (Java 14 feature)

		Scanner scanner =  new Scanner(System.in);

		System.out.print("Enter the day of the week: ");
		String day = scanner.nextLine();

		switch (day) {
			case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
					-> System.out.println("It is a weekday 🙁");
			case "Saturday", "Sunday"
					-> System.out.println("It is the weekend 😀");
			default
					-> System.out.println("Invalid day");
		}

		scanner.close();
	}
}

// https://www.youtube.com/watch?v=xTtL8E4LzTQ
// 3:09:58