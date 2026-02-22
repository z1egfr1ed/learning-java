package polymorphism;

public class Car implements VehicleI {
	@Override
	public void go() {
		System.out.println("** You drive the car **");
	}
}
