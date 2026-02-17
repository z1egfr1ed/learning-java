package user_input_into_array;

import java.util.Scanner;

public class UserInputIntoArray {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// We need to set the size
		// String[] foods = {};
		// foods[0] = "pizza"; // ArrayIndexOutOfBoundsException

		System.out.print("Enter the # of elements in the array: ");
		int size = scanner.nextInt();
		scanner.nextLine(); // clean the buffer

		String[] foods = new String[size];

		for (int i = 0; i < foods.length; i++) {
			System.out.print("Enter a food: ");
			foods[i] = scanner.nextLine();
		}

		for (String food : foods) System.out.println(food);

		scanner.close();
	}
}
