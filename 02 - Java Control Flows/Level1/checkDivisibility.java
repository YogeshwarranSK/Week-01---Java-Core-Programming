package Day2.Level1;
import java.util.Scanner;
public class checkDivisibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num % 5 == 0){
            System.out.println("It is Divisible...");
        }
        else{
            System.out.println("Not divisible!");
        }
        sc.close();
    }
}