package Day4.Level1;
import java.util.Scanner;
public class pr5 {
    public static void printEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("It is an Even number");
        } else {
            System.out.println("It is an Odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        printEvenOrOdd(num);
        sc.close();
    }
}