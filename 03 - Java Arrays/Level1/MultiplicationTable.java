package Day3.Level1;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] table = new int[11];
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            table[i] = number * i;
        }
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + table[i]);
        }
        sc.close();
    }
}