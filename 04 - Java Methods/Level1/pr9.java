package Day4.Level1;
import java.util.Scanner;
public class pr9 {
    public static int[] findRemainderAndQuotient(int num1, int num2) {
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number2: ");
        int num2 = sc.nextInt();
        if (num2 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            int[] result = findRemainderAndQuotient(num1, num2);
            System.out.println("Quotient of " + num1 + " and " + num2 + " is: " + result[0]);
            System.out.println("Remainder of " + num1 + " and " + num2 + " is: " + result[1]);
            sc.close();
        }
    }
}