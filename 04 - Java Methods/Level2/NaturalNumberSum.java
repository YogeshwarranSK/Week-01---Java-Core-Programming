package Day4.Level2;
import java.util.Scanner;
public class NaturalNumberSum {
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number (positive integer). Exiting...");
            return;
        }
        int sumRec = sumRecursive(n);
        int sumForm = sumFormula(n);
        System.out.println("Sum using Recursion: " + sumRec);
        System.out.println("Sum using Formula: " + sumForm);
        if (sumRec == sumForm) {
            System.out.println("Both computations match! The result is correct.");
        } else {
            System.out.println("Mismatch in computations! There might be an error.");
        }
        scanner.close();
    }
}

