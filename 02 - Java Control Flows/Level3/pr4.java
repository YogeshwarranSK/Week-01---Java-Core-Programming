package Day2.Level3;
import java.util.Scanner;
public class pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number greater than 1 to check if it is a prime number: ");
        int number = sc.nextInt();
        if (number <= 1) {
            System.out.println("Prime numbers are greater than 1.");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
        sc.close();
    }
}