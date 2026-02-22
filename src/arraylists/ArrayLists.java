package arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
	public static void main(String[] args) {

		// ArrayList = A resizeable array that stores objects (autoboxing).
		//             Arrays are fixed in size, but ArrayLists can change.

		// ArrayList<String> fruits = new ArrayList<>();

		// fruits.add("Apple");
		// fruits.add("Watermelon");
		// fruits.add("Orange");
		// fruits.add("Banana");

		// fruits.remove(1);
		// fruits.set(0, "Pineapple");

		// System.out.println(fruits.get(0));
		// System.out.println(fruits.contains("Pineapple"));
		// System.out.println(fruits.size());

		// Collections.sort(fruits);
		// System.out.println(fruits);

		Scanner scanner = new Scanner(System.in);

		ArrayList<String> foods = new ArrayList<>();

		System.out.print("Enter the # of food u would like: ");
		int numOfFood = scanner.nextInt();
		scanner.nextLine();

		for(int i = 1; i <= numOfFood; i++) {
			System.out.print("Enter food # " + i + ": ");
			String food = scanner.nextLine();
			foods.add(food);
		}

		System.out.println(foods);

		scanner.close();

	}
}
