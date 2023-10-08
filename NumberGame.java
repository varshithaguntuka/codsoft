package CodSoft;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
        Random rd = new Random(); // To generate random number
        int minRange = 1;
        int maxRange = 100; 
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) // looping the code until the user has won or run out of attempts 
        {
            int numberToGuess = rd.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println(numberToGuess);
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("I've picked a number between " + minRange + " and " + maxRange + ". Try to guess it!");

            while (attempts < maxAttempts) // loop until attempts complete
            {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    hasGuessedCorrectly = true;
                    break; // break if user gueeses correct answer
                } else if (userGuess < numberToGuess) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
            }

            if (!hasGuessedCorrectly) 
            {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + numberToGuess + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }

            score++;
        }

        System.out.println("Thanks for playing! Your total score is: " + score);
        sc.close();
    }

	}


