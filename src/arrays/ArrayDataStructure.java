package arrays;

import java.util.Arrays;

public class ArrayDataStructure {
	public static void main(String[] args) {

		// array = a collection of values of the same data type
		//          * think of it as a variable that can store more than 1 value *
		
		String[] fruits = {"Banana", "Orange", "Coconaut", "Apple"};

		// System.out.println("fruit = " + fruits); // java.lang.String;@6acbcfc0 -> a memory address
		// System.out.printf("The fruit is a(n): %s", fruits[0]);

		// fruits[0] = "pineapple";
		// System.out.println(fruits[0]);
		
		// int numOfFruits = fruits.length;
		// System.out.println("numOfFruits = " + numOfFruits); // 4

		// for (int i = 0; i < numOfFruits; i++) {
		// 	String fruit = fruits[i];
		// 	System.out.println(fruit);
		// }

		// Arrays.sort(fruits);
		// Arrays.fill(fruits, "Pineapple");

		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
