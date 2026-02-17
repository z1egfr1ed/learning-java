package methods;

public class Methods {
	public static void main(String[] args) {

		// method = a block of reusable code that is executed when called ()

		String name1 = "Spongebob";
		int age1 = 25;

		String name2 = "Patrick";
		int age2 = 30;

		happyBirthday(name1, age1);
		happyBirthday(name2, age2);
		
		double result = square(3);
		System.out.println("result = " + result);
		
		boolean isAdult = ageCheck(age2);
		System.out.println("isAdult = " + isAdult);
	}

	static void happyBirthday(String name, int age) {
		System.out.println("Happy Birthday to you!");
		System.out.printf("Happy Birthday dear %s!\n", name);
		System.out.printf("You are %d years old!\n", age);
		System.out.println("Happy Birthday to you!\n");
	}
	
	static double square(double num) {
		return num * num;
	}
	
	static boolean ageCheck(int age) {
		return age >= 18 ? true : false;
	}
}
