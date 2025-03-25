package Builtinfunc;
import java.util.Scanner;

public class pr4 {
    public static void genFibonacci(int terms) {
        int a = 0, b = 1;
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of terms: ");
        int terms = input.nextInt();
        genFibonacci(terms);
        input.close();
    }
}

