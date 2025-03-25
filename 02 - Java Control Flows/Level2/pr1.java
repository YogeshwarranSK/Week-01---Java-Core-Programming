package Day2.Level2;
import java.util.Scanner;
public class pr1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++){
            if(i%2==0){
                System.out.println(i+" is even number");
            }
            else{
                System.out.println(i+" is odd Number");
            }
        }
    }
}
