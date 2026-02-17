package variables;

public class Variables {
	public static void main(String[] args) {
		// variable = a reusable container for a value
		//            a variable behaves as if it was the value it contains

		// Primitive = simple value stored directly in memory (stack)
		// Reference = memory address (stack) that points to the (heap)

		// Primitive vs Reference
		// ---------    ---------
		// int          string
		// double       array
		// char         object
		// boolean
		
		// 2 steps to creating a variable
		// ------------------------------
		// 1. declaration
		// 2. assignment
		
		int age; // declaration
		// System.out.println("age = " + age);
		// java: variable age might not have been initialized
		
		int year = 1996; // assignment
		// System.out.println("age = " + age); // 1996
		
		double price = 19.99;
		double gpa = 3.5;
		double temperature = -12.5;
		System.out.println("temperature = " + temperature);
		
		char grade = 'A';
		char symbol = '!';
		char currency = '$';
		System.out.println("currency = " + currency);

		boolean isStudent = true;
		boolean forSale = false;
		boolean isOnline = true;
		System.out.println("isOnline = " + isOnline);

		String name = "Marshel";
		String food = "Frite Chicken";
		String email = "fake123@gmail.com";
		String car = "Mustang";
		System.out.println("My favorite food is " + food);

		if (forSale) {
			System.out.println("The car " + car + "is for sale");
		} else {
			System.out.println("The car " + car + " is not for sale");
		}

	}
}
