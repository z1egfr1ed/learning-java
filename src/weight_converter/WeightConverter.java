package weight_converter;

import java.util.Locale;
import java.util.Scanner;

public class WeightConverter {
	public static void main(String[] args) {

		// WEIGHT CONVERSION PROGRAM

		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);

		double weight;
		double newWeight;
		int choice;

		System.out.println("-------------------------------------");
		System.out.println("----- WEIGHT CONVERSION PROGRAM -----");
		System.out.println("-------------------------------------");

		System.out.println("1. Convert lbs to kgs");
		System.out.println("2. Convert kgs to lbs");

		System.out.print("Choose an option: ");
		choice = scanner.nextInt();

		switch (choice) {
			case 1:
				System.out.print("Enter the weight in lbs: ");
				weight = scanner.nextDouble();
				newWeight = weight * 0.453592;
				System.out.printf("Your weight in kgs is %.2f%n", newWeight);
				break;
			case 2:
				System.out.print("Enter the weight in kgs: ");
				weight = scanner.nextDouble();
				newWeight = weight * 2.20462;
				System.out.printf("Your weight in lbs is %.2f%n", newWeight);
				break;
			default:
				System.out.println("Invalid choice");
				break;
		}

		scanner.close();
	}
}
