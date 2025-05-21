import java.util.Scanner;

public class arithematicCalculation_double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        double a = sc.nextInt();
        System.out.println("Enter num2:");
        double b = sc.nextInt();
        System.out.println("Enter num3:");
        double c = sc.nextInt();
        double op1 = a + (b * c);
        double op2 = (a * b) + c;
        double op3 = c + (a / b);
        double op4 = (a % b) + c;
        System.out.println("Results:");
        System.out.println("a + (b * c) = " + op1);
        System.out.println("(a * b) + c = " + op2);
        System.out.println("c + (a / b) = " + op3);
        System.out.println("(a % b) + c = " + op4);
        sc.close();
    }
}
