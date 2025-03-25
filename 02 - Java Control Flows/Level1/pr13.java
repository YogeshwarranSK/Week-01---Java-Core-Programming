package Day2.Level1;
import java.util.Scanner;
public class pr13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum1 ;
        int sum2 = 0;
        if (num > 0) {
            System.out.println("Natural Number");
            sum1 = num * (num + 1) / 2;

            for(int i = num; num >= 0; num--) {
                sum2 += num;
            }
            System.out.println("Sum using formula:" + sum1);
            System.out.println("Sum using loop:" + sum2);
            if (sum1 == sum2) {
                System.out.println("Both Sums are equal.Total sum is:" + sum1);
            } else {
                System.out.println("Both do not match");
            }
        }else{
            System.out.println("Not a natural number");
        }
    }
}

