package shopping_cart;

import java.util.Scanner;
import java.util.Locale;

public class ShoppingCart {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);

		String item;
		double price;
		int quantity;
		char currency = '$';
		double total;

		System.out.print("What item would you like to buy?: ");
		item = scanner.nextLine();

		System.out.print("What is the price for each?: ");
		price = scanner.nextDouble();

		System.out.print("How many items would you like to buy?: ");
		quantity = scanner.nextInt();

		total = price * quantity;
		System.out.println("\nYOU HAVE BOUTH " + quantity + " " + item + "/s");
		System.out.println("YOUR TOTAL IS " + currency + total);

		scanner.close();
	}
}
