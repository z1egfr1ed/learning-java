package abstraction;

import java.util.Locale;

public class Circle extends Shape {

	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double getArea() {
		double area = Math.PI * Math.pow(radius, 2);
		String formatted = String.format(Locale.US, "%.2f", area);
		return Double.parseDouble(formatted);
	}
}
