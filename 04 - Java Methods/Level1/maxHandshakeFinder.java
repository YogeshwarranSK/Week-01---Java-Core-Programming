package Day4.Level1;
import java.util.Scanner;
public class maxHandshakeFinder {
    public static int maximumHandshakes(int num){
        double maxHandshake = (double)num * (num-1)/2;
        return (int) maxHandshake;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.of Students :");
        int num = sc.nextInt();
        System.out.println("Maximum handshakes: " +maximumHandshakes(num));
        sc.close();
    }
}
