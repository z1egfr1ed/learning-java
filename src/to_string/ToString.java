package to_string;

public class ToString {
	public static void main(String[] args) {

		// .toString = Method inherited from the Object class.
 		//             Used to return a string representation of an object.
 		//             By default, it returns a hash code as a unique identifier.
 		//             It can be overridden to provide meaningful details.

		Car car1 = new Car("Ford", "Mustang", 2025, "Black");
		Car car2 = new Car("Chevrolet", "Corvette", 2026, "Green");

		// System.out.println(car); // Car@5f184fc6

		System.out.println(car1); // Black 2025 Ford Mustang
		System.out.println(car2); // Green 2026 Chevrolet Corvette
	}
}
