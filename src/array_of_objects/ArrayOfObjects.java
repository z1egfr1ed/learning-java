package array_of_objects;

public class ArrayOfObjects {
	public static void main(String[] args) {

		Car car1 = new Car("Mustang", "Purple");
		Car car2 = new Car("Corvette", "Blue");
		Car car3 = new Car("Charger", "Yellow");

		Car[] cars = { car1, car2, car3 };

		// for (int i = 0; i < cars.length; i++) {
		// 	cars[i].drive();
		// }

		for (Car car : cars) {
			car.color = "Black";
			car.drive();
		}
	}
}
