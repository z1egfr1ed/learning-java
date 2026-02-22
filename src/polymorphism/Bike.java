package polymorphism;

public class Bike implements VehicleI {
	@Override
	public void go() {
		System.out.println("** You ride the bike **");
	}
}
