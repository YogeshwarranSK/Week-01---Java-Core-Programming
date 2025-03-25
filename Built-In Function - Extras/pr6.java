package Builtinfunc;
import java.util.Scanner;

public class pr6 {
    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();
        return num;
    }
    public static long calcFactorial(int n) {
        if (n <= 1)
            return 1;
        return n * calcFactorial(n - 1);
    }
    public static void displayResult(int number, long factorial) {
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    public static void main(String[] args) {
        int num = getInput();
        long res = calcFactorial(num);
        displayResult(num, res);
    }
}

