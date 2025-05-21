package Day2.Level2;

import java.util.Scanner;

public class findNumberRaisedToPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer for the base number: ");
        int number = sc.nextInt();
        System.out.println("Enter a positive integer for the power: ");
        int power = sc.nextInt();
        if (number < 0 || power < 0) {
            System.out.println("Invalid input! Both the number and power should be positive integers.");
            return;
        }
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(number + " raised to the power " + power + " is: " + result);
        sc.close();
    }
}
