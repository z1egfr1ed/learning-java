package search_an_array;

import java.util.Scanner;

public class SeachAnArray {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] fruits = {"apple", "orange", "banana", "coconaut"};
		boolean isFound = false;
		String fruit_target;

		System.out.print("Enter a fruit to search for: ");
		fruit_target = scanner.nextLine();

		for (int i = 0; i < fruits.length; i++) {
			String fruit = fruits[i];
			if (fruit.equals(fruit_target)) {
				System.out.println("Element found at index: " + i);
				isFound = true;
				break;
			}
		}

		if (!isFound)	System.out.println("Element not found");

		scanner.close();
	}
}
