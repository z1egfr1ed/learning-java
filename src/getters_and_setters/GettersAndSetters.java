package getters_and_setters;

public class GettersAndSetters {
	public static void main(String[] args) {

		// They help protect object data and add rules for accessing or modifying them.
		// GETTERS = Methods that make a field READABLE.
		// SETTERS = Methods that make a field WRITEABLE.

		Car car = new Car("Charger", "Yellow", 10000);

		// car.model = "Corvette"; ❌

		car.setColor("Black"); // ✅ SETTER

		System.out.println(car.getColor()); // GETTER
		System.out.println(car.getModel()); // GETTER
		System.out.println(car.getPrice()); // GETTER
	}
}
