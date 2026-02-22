package polymorphism;

public class Polymorphism {
	public static void main(String[] args) {

		// Polymorphism = "POLY" = "MANY"
		//                "MORPH" = "SHAPE"
		//                Objects can identify as other objects.
		//                Objects can be treated as objects of a common superclass.

		Car car = new Car();
		Bike bike = new Bike();
		Boat boat = new Boat();

		// car.go();
		// bike.go();
		// boat.go();

		// Car[] cars = { car, bike, boat }; // incompatible types: Bike cannot be converted to Car

		VehicleI[] vehicles = { car, bike, boat }; // ✅ They are all SHAPES

		for (VehicleI vehicle : vehicles) {
			vehicle.go();
		}

	}
}
