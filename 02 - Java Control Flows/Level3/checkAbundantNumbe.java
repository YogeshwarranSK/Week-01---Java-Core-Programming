package Day2.Level3;
import java.util.Scanner;
public class checkAbundantNumbe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }if(sum>num){
            System.out.println(num+ " is Abundant Number");
        }else{
            System.out.println(num+ " is Not an Abundant Number");
            }
        }
    }

