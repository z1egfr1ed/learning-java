package composition;

public class Car {

	String model;
	int year;
	Engine engine;

	Car(String model, int year, String engineType) {
		this.model = model;
		this.year = year;
		// If we delete a Car object, Engine object is also deleted
		this.engine = new Engine(engineType);
	}

	void start() {
		this.engine.start();
		System.out.println("The " + this.model + " has started.");
	}
}
