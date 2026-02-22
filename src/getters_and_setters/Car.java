package getters_and_setters;

public class Car {

	private final String model;
	private String color;
	private int price;

	Car(String model, String color, int price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}

	String getModel() {
		return model;
	}
	String getColor() {
		return color;
	}
	int getPrice() {
		return price;
	}

	void setColor(String color) {
		this.color = color;
	}
	void setPrice(int price) {
		if (price < 0) {
			throw new IllegalArgumentException();
		}
		this.price = price;
	}
}
