package Day2.Level1;
import java.util.Scanner;
public class pr12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum1;
        int sum2 = 0;
        if (num > 0) {
            System.out.println("Natural number ...");
            sum1 = num * (num + 1) / 2;

            int temp = num;
            while (temp > 0) {
                sum2 = sum2 + temp;
                temp = temp - 1;
            }
            System.out.println("Sum using Formula: " + sum1);
            System.out.println("Sum using Loop: " + sum2);

            if (sum1 == sum2) {
                System.out.println("Both sums are equal. Sum is: " + sum1);
            } else {
                System.out.println("Sums do not match!");
            }
        } else {
            System.out.println("Not a Natural number!!!");
        }
    }
}