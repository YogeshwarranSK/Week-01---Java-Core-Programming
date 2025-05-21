package Day4.Level1;
import java.util.Scanner;
public class sumOfNaturalNumbers {
    public static void totalSum(int num){
        int sum = 0;
        for(int i = 1; i<=num; i++){
            sum += i;
        }
        System.out.println("The sum of "+num+" natural numbers : "+sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        totalSum(num);
        sc.close();
    }
}
