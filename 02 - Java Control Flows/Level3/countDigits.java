package Day2.Level3;
import java.util.Scanner;
public class countDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int count = 0;
        while(num!=0){
            num = num/10;
            count+=1;
        }
        System.out.println("Count:"+count);
        sc.close();
    }
}
