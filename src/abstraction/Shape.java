package abstraction;

public abstract class Shape {

	abstract double getArea();

	void display() { // CONCRETE
		System.out.println("This is a shape");
	}
}
