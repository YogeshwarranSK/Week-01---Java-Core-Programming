package Day2.Level2;
import java.util.Scanner;
public class findFactors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num>0){
            for(int i = 1; i <= num; i++){
                if(num%i==0){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
