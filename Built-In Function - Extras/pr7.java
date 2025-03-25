package Builtinfunc;
import java.util.Scanner;

public class pr7 {
    public static int getInput(String label) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + label + " number: ");
        return input.nextInt();
    }
    public static int calculateGCD(int a, int b) {
        if (b == 0)
            return a;
        return calculateGCD(b, a % b);
    }
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }
    public static void results(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
    public static void main(String[] args) {
        int num1 = getInput("first");
        int num2 = getInput("second");
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);
        results(num1, num2, gcd, lcm);
    }
}
