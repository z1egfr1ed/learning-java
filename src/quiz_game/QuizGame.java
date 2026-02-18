package quiz_game;

import java.util.Scanner;

public class QuizGame {
	public static void main(String[] args) {

		// JAVA QUIZ GAME

		String[] questions = {
				"What is the main function of a router?",
				"Which part of the computer is considered the brain?",
				"What year was Facebook launched?",
				"Who is known as the father of computers?",
				"What was the first programming language?"
		};

		String[][] options = {
				{"1. Storing Files", "2. Encrypting Data", "3. Directing Internet Traffic", "4. Managing Passwords"},
				{"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
				{"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
				{"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
				{"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}
		};

		int[] answers = {3, 1, 2, 4, 3};
		int score = 0;
		int guess;

		Scanner scanner =  new Scanner(System.in);

		System.out.println("-------------------------------------------");
		System.out.println("------ WELCOME TO THE JAVA QUIZ GAME ------");
		System.out.println("-------------------------------------------\n");

		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);

			for (String option : options[i]) {
				System.out.println(option);
			}

			System.out.println();
			System.out.print("Enter your guess: ");
			guess = scanner.nextInt();

			if (guess == answers[i]) {
				System.out.println("\n******************");
				System.out.println("**** CORRECT! ****");
				System.out.println("******************\n");
				score++;
			} else {
				System.out.println("\n******************");
				System.out.println("*** INCORRECT! ***");
				System.out.println("******************\n");
			}
		}

		System.out.printf("YOUR FINAL SCORE IS: %d/%d", score, answers.length);

		scanner.close();
	}
}
