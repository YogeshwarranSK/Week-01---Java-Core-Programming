import java.util.Scanner;

public class prg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int a = sc.nextInt();
        System.out.println("Enter num2:");
        int b = sc.nextInt();
        System.out.println("Enter num3:");
        int c = sc.nextInt();
        int op1 = a + (b * c);
        int op2 = (a * b) + c;
        int op3 = c + (a / b);
        int op4 = (a % b) + c;
        System.out.println("Results:");
        System.out.println("a + (b * c) = " + op1);
        System.out.println("(a * b) + c = " + op2);
        System.out.println("c + (a / b) = " + op3);
        System.out.println("(a % b) + c = " + op4);
        sc.close();
    }
}
