package Day2.Level1;
import java.util.Scanner;
public class pr9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the countdown time:");
        int count = sc.nextInt();
        for(int i = count ;count>=1 ; count--){
            System.out.println(count);
        }
        System.out.println("Takeoff...");
    }
}
