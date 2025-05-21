package Day4.Level1;
import java.util.Scanner;
public class smallestAndLargestFinder {
    public static void findSmallestAndLargest(int number1, int number2, int number3) {
        if (number1 < number2 && number1 < number3) {
            System.out.println("Smallest number is: " + number1);
        } else if (number2 < number1 && number2 < number3) {
            System.out.println("Smallest number is: " + number2);
        } else if (number3 < number1 && number3 < number2) {
            System.out.println("Smallest number is: " + number2);
        } else {
            System.out.println("Smallest number is: None");
        }

        if (number1 > number2 && number1 > number3) {
            System.out.println("Largest number is: " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Largest number is: " + number2);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Largest number is: " + number2);
        } else {
            System.out.println("Largest number is: None");
        }
    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number1:");
            int number1 = sc.nextInt();
            System.out.println("Enter number2:");
            int number2 = sc.nextInt();
            System.out.println("Enter number3:");
            int number3 = sc.nextInt();
            findSmallestAndLargest(number1,number2,number3);
    }
}
