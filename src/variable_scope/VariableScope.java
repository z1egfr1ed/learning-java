package variable_scope;

public class VariableScope {
	static int x = 3; // CLASS SCOPE

	public static void main(String[] args) {

		// variable scope = where a variable can be accessed
		// A variable declared inside a method has a LOCAL SCOPE
		// Class scope refers to variables declared inside a class but outside any method,
		// making them accessible to all methods (and often tied to the object's state).
		// Java uses the nearest variable first

		int x = 1; // LOCAL SCOPE
		System.out.println("x = " + x); // 1

		doSomething(); // 2
		doSomethingElse(); // 3
	}

	static void doSomething() {
		int x = 2; // LOCAL SCOPE
		System.out.println("x = " + x);
	}

	static void doSomethingElse() {
		System.out.println("x = " + x);
	}
}
