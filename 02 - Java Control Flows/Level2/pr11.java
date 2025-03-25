package Day2.Level2;
import java.util.Scanner;
public class pr11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer less than 100:");
        int number = sc.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input. Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}