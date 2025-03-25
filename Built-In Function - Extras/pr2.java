package Builtinfunc;
import java.util.Scanner;

public class pr2 {
    public static int getInput(String prompt, Scanner input) {
        System.out.print(prompt);
        return input.nextInt();
    }
    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = getInput("Enter first number: ", input);
        int num2 = getInput("Enter second number: ", input);
        int num3 = getInput("Enter third number: ", input);
        int max = findMax(num1, num2, num3);
        System.out.println("Maximum of three numbers is: " + max);
    }
}

