package Day2.Level1;
import java.util.Scanner;
public class findFactorialUsingifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int fact = 1;
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
        }else{
                System.out.println("Enter a positive number...");
            }
        System.out.println("Factorial of " + num + " is:"+fact);
        }
    }

