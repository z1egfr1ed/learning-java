package compound_interest_calculator;

import java.util.Scanner;

public class CompoundInterestCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double principal;
		double interestRate;
		int timesCompounded;
		int years;
		double amount;

		System.out.print("Enter the principal amount: ");
		principal = scanner.nextDouble();

		System.out.print("Enter the interest rate (in %): ");
		interestRate = scanner.nextDouble() / 100;

		System.out.print("Enter the # of times compounded per year: ");
		timesCompounded = scanner.nextInt();

		System.out.print("Enter the # of years: ");
		years = scanner.nextInt();

		amount = principal * Math.pow(1 + interestRate / timesCompounded, timesCompounded * years);
		System.out.printf("THE AMOUNT AFTER %d YEAR(S) IS: $%,2f", years, amount);

		scanner.close();
	}
}

// https://www.youtube.com/watch?v=xTtL8E4LzTQ
// 2:03:46