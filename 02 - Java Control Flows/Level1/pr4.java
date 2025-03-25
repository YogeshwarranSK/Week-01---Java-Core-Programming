package Day2.Level1;

import java.util.Scanner;
public class pr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println(n + " is not a natural number.");
        } else {
            int sum = n * (n + 1) / 2;
            System.out.println("Sum of first " + n + " natural numbers: " + sum);
        }
        scanner.close();
    }
}
