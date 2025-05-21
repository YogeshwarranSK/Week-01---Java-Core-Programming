package Day2.Level3;
import java.util.Scanner;
public class checkArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;
        int originalNumber;
        originalNumber = num;
        while(originalNumber!=0){
            int digit = originalNumber % 10;
            sum = sum + digit*digit*digit;
            originalNumber = originalNumber/10;
        }
        if(sum == num){
            System.out.println(num + " is an Armstrong Number ");
        }
        else{
            System.out.println(num + " is not an Armstrong Number ");
        }
        sc.close();
    }
}
