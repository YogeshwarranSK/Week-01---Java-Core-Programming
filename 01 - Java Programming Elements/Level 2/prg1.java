import java.util.Scanner;

public class prg1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = sc.nextInt();
        System.out.println("Enter number2:");
        int num2 = sc.nextInt();
        double quotient = (double)num1/num2;
        double remainder = num1 % num2;
        System.out.println("Quotient:" + quotient);
        System.out.println("Remainder:" + remainder);
    }
}