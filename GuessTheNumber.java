import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max);
        int userGuess;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("Computer selected a number between " + min + " and " + max + ". Try to guess it.");

        while (true) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
                break; // Exit the loop when the guess is correct
            }
        }

        scanner.close();
    }
}
