package Day3.Level2;
import java.util.Scanner;
public class pr3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int maxDigit = 10;
        int[] integer = new int[maxDigit];
        int index = 0;
        System.out.print("Enter a Number: ");
        long number = sc.nextLong();
        while (number != 0){
            if(index >= maxDigit){
                break;
            }
            integer[index++] = (int) number % 10;
            number /= 10;
        }
        int largest = 0, secLargest = 0;
        for (int i = 0; i < index; i++){
            if(integer[i] > largest){
                secLargest = largest;
                largest = integer[i];
            }
            else if (integer[i] > secLargest && integer[i] != largest) {
                secLargest = integer[i];
            }
        }
        System.out.println("Largest: " + largest + "\nSecond Largest: " +
                secLargest);
        sc.close();
    }
}
