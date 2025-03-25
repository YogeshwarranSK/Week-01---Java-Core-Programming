package Day2.Level1;
import java.util.Scanner;
public class pr18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        for(int i=6;i<10;i++){
            int prod = num*i;
            System.out.println(num+" * "+ i +" = "+ prod);
        }
    }
}
