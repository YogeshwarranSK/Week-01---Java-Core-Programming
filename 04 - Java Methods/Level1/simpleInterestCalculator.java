package Day4.Level1;
import java.util.Scanner;
public class simpleInterestCalculator {
    public static int calculateSimpleInterest(int p, int t, int r) {
        return (p * t * r) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount:");
        int p = sc.nextInt();
        System.out.println("Enter rate of interest:");
        int r = sc.nextInt();
        System.out.println("Enter time period:");
        int t = sc.nextInt();
        int si = calculateSimpleInterest(p, t, r);
        System.out.println("The Simple Interest is: " + si);
        sc.close();
    }
}