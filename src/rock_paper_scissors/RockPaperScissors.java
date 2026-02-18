package rock_paper_scissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		runGame();
	}

	static void runGame() {
			// ROCK PAPER SCISSORS GAME

			Scanner scanner = new Scanner(System.in);
			Random random = new Random();

			String[] choices = {"rock", "paper", "scissors"};
			String playerChoice;
			String computerChoice;
			String playAgain = "yes";

			printMessage("Welcome to the Rock Paper Scissors!");

			do {
				printMessage("Enter your move (rock, paper, scissors): ", true);
				playerChoice = scanner.nextLine().toLowerCase();
				computerChoice = choices[random.nextInt(choices.length)];

				if (!playerChoice.equals("rock")
						&& !playerChoice.equals("paper")
						&& !playerChoice.equals("scissors")) {
					printMessage("Please enter a valid move (rock, paper, scissors)");
					continue;
				}

				printMessage("Computer Choice: " + computerChoice.toUpperCase());

				if (playerChoice.equals(computerChoice)) {
					printMessage("It's a tie!");
				} else if ((playerChoice.equals("rock") && computerChoice.equals("scissors"))
						|| (playerChoice.equals("paper") && computerChoice.equals("rock"))
						|| (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
					printMessage("You win!");
				} else {
					printMessage("You lose!");
				}

				printMessage("Wanna play again? (yes/no): ", true);
				playAgain = scanner.nextLine();

			} while (playAgain.equals("yes"));

			printMessage("Thanks for playing!");

			scanner.close();
	}

	static void printMessage(String message) {
		System.out.println(message);
	}

	static void printMessage(String message, boolean inline) {
		if (inline) System.out.print(message);
		else System.out.println(message);
	}
}



