package Day3.Level1;
import java.util.Scanner;
public class pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        for (int number : numbers) {
            if (number == 0) {
                System.out.println(number + " = Zero");
            } else if (number > 0) {
                System.out.println(number + " = Positive");
            } else {
                System.out.println(number + " = Negative");
            }
        }
        if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println(numbers[0] + " > " +
                    numbers[numbers.length - 1]);
        } else if (numbers[0] < numbers[numbers.length - 1]) {
            System.out.println(numbers[0] + " < " +
                    numbers[numbers.length - 1]);
        } else {
            System.out.println(numbers[0] + " = " +
                    numbers[numbers.length - 1]);
        }sc.close();
    }
}