package polymorphism;

public class Boat implements VehicleI {
	@Override
	public void go() {
		System.out.println("** You sail the boat **");
	}
}
