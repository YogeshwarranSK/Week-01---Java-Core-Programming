package Day2.Level2;
import java.util.Scanner;
public class findGreatestFactor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int greatestFactor = 1;
        for(int i = num - 1; i >=1;i--){
            if(num%i==0){
                greatestFactor = i;
                break;
            }
        }
        System.out.println("GreatFactor is:"+greatestFactor);
        sc.close();
    }
}
