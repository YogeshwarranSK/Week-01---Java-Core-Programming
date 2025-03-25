package Day2.Level1;
import java.util.Scanner;
public class pr16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num>0){
            for(int i = 1;i<=num;i++){
                if(i%2==0){
                    System.out.println(i+" is a even number");
                }
                else{
                    System.out.println(i+" is a odd number");
                }
            }
        }else{
            System.out.println("Enter a valid number!");
        }

    }
}
