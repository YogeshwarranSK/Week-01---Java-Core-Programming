package Day2.Level1;
import java.util.Scanner;
public class pr14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num>0) {
            int fact = 1;
            int i = num;
            while (i != 0) {
                fact *= i;
                i--;
            }
            System.out.println("Factorial of " + num + " is: " + fact);
        }else{
            System.out.println("Enter a positive number !!");
        }
    }
}
