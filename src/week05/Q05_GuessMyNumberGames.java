package week05;

import java.util.Random;
import java.util.Scanner;

public class Q05_GuessMyNumberGames {

	public static void main(String[] args) {

		/*
		 * Write a program that generates a random number and asks the user to guess
		 * what the number is. If the user's guess is higher than the random number, the
		 * program should display "Too high, try again." If the user's guess is lower
		 * than the random number, the program should display "Too low, try again." The
		 * program should use a loop that repeats until the user correctly guesses the
		 * random number.
		 * 
		 */

		guessPlay();

	}

	private static void guessPlay() {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number");

		int guess;
		System.out.println("........ Guess My Number Game .......");
		Random random = new Random();

		int r = random.nextInt(101); // sayi araligini buraya koymak gerekiyor yoksa eksi sayilar da isin icine giriyor 

		int counter = 0;

		do {

			guess = scan.nextInt();
			counter++;
			if (guess > r) {

				System.out.println("Too high,try again");

			} else if (guess < r) {
				System.out.println("Too low,try again");
			} else {
				System.out.println("Sayiyi buldunuz." + guess);
			}

		} while (guess != r);

	}

}
