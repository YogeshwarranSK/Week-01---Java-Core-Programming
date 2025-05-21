package Day2.Level1;
import java.util.Scanner;
public class calculateTotalSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        double num = sc.nextDouble();
        double sum = 0;
        while(num != 0){
            sum += num;
            System.out.println("Enter a number:");
            num = sc.nextDouble();
        }
        System.out.println("Total Sum:" + sum);
    }
}
