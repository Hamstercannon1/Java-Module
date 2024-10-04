import java.util.Random;
import java.util.Scanner;

public class Guessing_Game{
    public static void main(String[] args){
        
        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;
        System.out.print("The system has selected a random number from 1 to 100. Give it your best guess! ");

        Scanner scanner = new Scanner(System.in);
        
        boolean hasGuessedCorrectly = false;
        int guessCount = 0;
        while (!hasGuessedCorrectly){
            System.out.print("Input guess here: ");
            int guess = scanner.nextInt();
            guessCount++;

            if (guess > randomNumber){
                System.out.print("Close, but your guess is too high! ");
            } else if (guess < randomNumber){
                System.out.print("That number is too low. Keep going! ");
            } else{
                System.out.print("Congratulations! you guessed the random number! ");
                System.out.print("You won in " + guessCount + " guesses. ");
                hasGuessedCorrectly = true;
            }
        }
        scanner.close();


    }

}