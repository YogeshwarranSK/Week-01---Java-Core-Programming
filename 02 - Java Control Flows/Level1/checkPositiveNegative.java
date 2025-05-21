import java.util.Scanner;
public class checkPositiveNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num<0){
            System.out.print("NEGATIVE NUMBER ");
        } else if(num == 0) {
            System.out.print("ZERO");
        }else {
            System.out.print("POSITIVE NUMBER");
            }
        sc.close();
        }
    }

