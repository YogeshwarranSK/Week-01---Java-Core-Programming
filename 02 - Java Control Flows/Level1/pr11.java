package Day2.Level1;
import java.util.Scanner;
public class pr11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double num;
        while (true) {
            System.out.println("Enter a number:");
            num = sc.nextDouble();
            if (num <= 0) {
                break;
            }
            total += num;
        }
        System.out.println("Total sum: " + total);
    }
}
