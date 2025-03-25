package Day3.Level2;
import java.util.Scanner;
public class pr5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        int digitCount = String.valueOf(number).length();
        int[] digits = new int[digitCount];
        int index = 0;
        int temp = number;
        while(temp != 0){
            digits[index++] = temp % 10;
            temp /= 10;
        }
        System.out.println("Reversed Number: ");
        for (int i = 0; i < index; i++){
            System.out.print(digits[i]);
        }
        sc.close();
    }
}