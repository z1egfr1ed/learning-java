package banking_program;

import java.util.Locale;
import java.util.Scanner;

public class BankingProgram {
	static Scanner scanner =  new Scanner(System.in);

	public static void main(String[] args) {

		scanner.useLocale(Locale.US);

		double balance = 0;
		boolean isRunning = true;
		int choice;

		while (isRunning) {
			System.out.println("\n---------------------------------");
			System.out.println("-------- BANKING PROGRAM --------");
			System.out.println("---------------------------------");

			System.out.println("\n1. Show Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");

			System.out.print("\nEnter your choice (1-4): ");
			choice = scanner.nextInt();

			switch (choice) {
				case 1 -> showBalance(balance);
				case 2 -> balance += deposit();
				case 3 -> balance -= withdraw(balance);
				case 4 -> isRunning = false;
				default -> System.out.println("INVALID CHOICE");
			}
		}

		System.out.println("THANK YOU FOR USING BANKING PROGRAM!");
		scanner.close();
	}

	static void showBalance(double balance) {
		System.out.printf("BALANCE: $%.2f\n", balance);
	}

	static double deposit() {
		double amount;
		System.out.print("Enter amount to deposit: ");
		amount = scanner.nextDouble();
		if (amount <= 0) {
			System.out.println("INVALID AMOUNT");
			return 0;
		} else {
			System.out.println("DEPOSITED $" + amount);
			return amount;
		}
	}

	static double withdraw(double balance) {
		double amount;
		System.out.print("Enter amount to withdraw: ");
		amount = scanner.nextDouble();
		if (amount > balance) {
			System.out.println("INSUFFICIENT FUNDS");
			return 0;
		} else if (amount < 0) {
			System.out.println("INVALID AMOUNT");
			return 0;
		} else {
			System.out.println("WITHDRAWN $" + amount);
			return amount;
		}
	}
}
