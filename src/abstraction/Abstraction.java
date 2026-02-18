package abstraction;

public class Abstraction {
	public static void main(String[] args) {

		// abstract = Used to define abstract classes and methods.
 		//            Abstraction is the process of hiding implementation details
 		//            and showing only the essential features;
 		//            Abstract classes CAN'T be instantiated directly
 		//            Can contain 'abstract' methods (which must be implemented)
 		//            Can contain 'concrete' methods (which are inherited)

		// Shape shape = new Shape(); // 'Shape' is abstract; cannot be instantiated

		Circle circle = new Circle(3);
		Triangle triangle = new Triangle(4, 5);
		Rectangle rectangle = new Rectangle(6, 7);

		System.out.println(circle.getArea());
		System.out.println(triangle.getArea());
		System.out.println(rectangle.getArea());

	}
}
