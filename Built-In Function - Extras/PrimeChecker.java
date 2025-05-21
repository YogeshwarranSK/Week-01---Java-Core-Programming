package Builtinfunc;
import java.util.Scanner;

public class PrimeChecker {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a Prime number.");
        }
        else {
            System.out.println(num + " is not a Prime number.");
        }
    }
}
