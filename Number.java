import java.util.Random;
import java.util.Scanner;


public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int round = 1;

        System.out.println("-------------------Welcome to the Guess the Number Game!-------------------");

        while (true) {
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfAttempts = 0;
            int maxAttempts = 5;
            boolean hasGuessed = false;

            System.out.println("Round " + round);
            System.out.println("The System generates a random number from a given range,say 1 to 100");
            System.out.println("You have " + maxAttempts + " attempts to guess the number.");
System.out.println("===========================================================================");

            while (numberOfAttempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                numberOfAttempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("Number is low! Please Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println(" Number is high!  Please Try again.");


                } 


else {
                    System.out.println("Congratulations! You've guessed the number in " + numberOfAttempts + " attempts.");
                    int points = maxAttempts - numberOfAttempts + 1;
                    totalScore += points;
                    System.out.println("You earned " + points + " points. Total score: " + totalScore);
                    hasGuessed = true;
                    break;
                }
            }
System.out.println("===========================================================================");


            if (!hasGuessed) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The number was " + numberToGuess);
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next();
System.out.println("===========================================================================");

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }

            round++;
        }

        System.out.println("Game over! Your total score is: " + totalScore);
        scanner.close();
System.out.println("===========================================================================");

    }
}