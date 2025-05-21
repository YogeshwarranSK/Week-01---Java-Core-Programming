package Day2.Level2;

import java.util.Scanner;

public class findMultiplesUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (positive and less than 100): ");
        int number = sc.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Please enter a positive number less than 100.");
            return;
        }
        System.out.println("Multiples of " + number + " below 100 are:");
        int counter = 99;
        while (counter > 1) {
            if (counter % number == 0) {
                System.out.println(counter);
            }
            counter--;
        }
        sc.close();
    }
}