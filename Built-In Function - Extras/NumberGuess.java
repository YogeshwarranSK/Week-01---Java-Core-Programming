package Builtinfunc;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    static Random rand = new Random();
    static Scanner input = new Scanner(System.in);
    public static int genGuess(int low, int high) {
        return rand.nextInt(high - low + 1) + low;
    }
    public static String getUserFeedback(int guess) {
        System.out.print("Is your number " + guess + "? (Enter: high / low / correct): ");
        return input.nextLine().trim().toLowerCase();
    }
    public static void startGame() {
        int low = 1;
        int high = 100;
        boolean guessed = false;
        System.out.println("Think of a number between 1 and 100 and will try to guess it!");
        while (!guessed && low <= high) {
            int guess = genGuess(low, high);
            String feedback = getUserFeedback(guess);

            if (feedback.equals("correct")) {
                System.out.println("Got your number: " + guess);
                guessed = true;
            }
            else if (feedback.equals("high")) {
                high = guess - 1;
            }
            else if (feedback.equals("low")) {
                low = guess + 1;
            }
            else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }
        if (!guessed) {
            System.out.println("Something went wrong, Maybe inconsistent answers");
        }
    }
    public static void main (String[]args){
        startGame();
    }
}