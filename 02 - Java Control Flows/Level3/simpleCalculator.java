package Day2.Level3;
import java.util.Scanner;
public class simpleCalculator {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();
        System.out.println("Operator:");
        String op = sc.next();
        switch (op) {
            case "+":
                System.out.println("Output = " + (num1 + num2));
                break;
            case "-":
                System.out.println("Output = " + (num1 - num2));
                break;
            case "*":
                System.out.println("Output = " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Output = " + (num1 / num2));
                } else {
                    System.out.println("Enter valid divisor");
                }
            default:
                System.out.println("Enter a valid operator");
        }
    }
}



