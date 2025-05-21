package Day3.Level1;
import java.util.Scanner;
public class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its multiplication table : ");
        int number = sc.nextInt();
        int[] multiplicationResult = new int[4];
        for (int i = 0; i < 4; i++) {
            int multiplier = 6 + i;
            multiplicationResult[i] = number * multiplier;
        }
        System.out.println("Multiplication table : " + number);
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = 6 + i;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }
        sc.close();
    }
}