package Day2.Level2;
import java.util.Scanner;
public class pr10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int count = num - 1;
        int greatestFactor = 1;
        while (count > 1) {
            if (num % count == 0) {
                greatestFactor = count;
                break;
            }
            count--;
        }
        System.out.println("Greatest Factor is: " + greatestFactor);
        sc.close();
    }
}