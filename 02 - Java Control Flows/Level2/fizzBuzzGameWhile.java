package Day2.Level2;
import java.util.Scanner;
public class fizzBuzzGameWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int i = 1;
        if(num>1){
            while(i<=num) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }i++;
            }
        }else{
            System.out.println("Try Entering a positive number !!!");
        }
        sc.close();
    }
}
