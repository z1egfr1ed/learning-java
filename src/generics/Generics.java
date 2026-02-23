package generics;

import java.util.ArrayList;

public class Generics {
	public static void main(String[] args) {

		// Generics = A concept where you can write a class, interface, or method
		//            that is compatible with different data types.
		//            <T> type parameter (placeholder that gets replaced with a real type)
		//            <String || Boolean || Int || anything> type argument (specifies the type)

		// ArrayList<String> fruits = new ArrayList<>();
		// fruits.add("Apple");
		// fruits.add("Orange");
		// fruits.add("Banana");

		Box<String> box1 = new Box<>();
		box1.setItem("Fruit");
		System.out.println(box1.getItem());

		Box<Integer> box2 = new Box<>();
		box2.setItem(1996);
		System.out.println(box2.getItem());

		Box<Double> box3 = new Box<>();
		box3.setItem(3.14);
		System.out.println(box3.getItem());

		Product<String, Double> product1 = new Product<>("Apple", 0.50);
		System.out.println(product1.getItem());
		System.out.println(product1.getPrice());

		Product<String, Integer> product2 = new Product<>("Ticket", 15);
		System.out.println(product2.getItem());
		System.out.println(product2.getPrice());

	}
}
