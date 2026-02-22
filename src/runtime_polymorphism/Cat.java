package runtime_polymorphism;

public class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("The cat goes *meow*");
	}
}
