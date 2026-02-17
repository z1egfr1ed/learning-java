package print_f_statement;


public class PrintF {
	public static void main(String[] args) {

		// printf() = is a method used to format output

		// %[flags][width][.precision][specifier-character]

		String name = "Spongebob";
		char firstLetter = 'S';
		int age = 30;
		double height = 1.65;
		boolean isEmployed = true;

		//	System.out.printf("Hello, %s\n", name);
		//	System.out.printf("Your name starts with a %c \n", firstLetter);
		//	System.out.printf("You are %d years old\n", age);
		//	System.out.printf("You are %.2fcm tall\n", height);
		//  System.out.printf("Employed: %b\n", isEmployed);
		//  System.out.printf("%s is %d years old\n", name, age);

		// + = output a plus
		// , = comma grouping separator
		// ( = negative numbers are enclosed in ()
		// space = display a minus if negative, space if positive

		double price1 = 9000.99;
		double price2 = 100000.15;
		double price3 = -54000.01;

		//System.out.printf("%, .1f\n", price1);
		//System.out.printf("%,+.2f\n", price2);
		//System.out.printf("%,.3f\n", price3);

		// 0 = zero padding
		// number = right justified padding
		// negative number = left justified padding

		int id1 = 1;
		int id2 = 23;
		int id3 = 456;
		int id4 = 7890;

		// System.out.println(id1); // 1
		// System.out.println(id2); // 23
		// System.out.println(id3); // 456
		// System.out.println(id4); // 7890

		// System.out.printf("%04d\n", id1); // 0001
		// System.out.printf("%04d\n", id2); // 0023
		// System.out.printf("%04d\n", id3); // 0456
		// System.out.printf("%04d\n", id4); // 7890

		// System.out.printf("%4d\n", id1); //    1
		// System.out.printf("%4d\n", id2); //   23
		// System.out.printf("%4d\n", id3); //  456
		// System.out.printf("%4d\n", id4); // 7890

		// System.out.printf("%-4d\n", id1); // 1
		// System.out.printf("%-4d\n", id2); // 23
		// System.out.printf("%-4d\n", id3); // 456
		// System.out.printf("%-4d\n", id4); // 7890
	}
}
