import java.util.Scanner;

public class calculateSI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle amount:");
        double p = sc.nextDouble();
        System.out.print("Enter time:");
        double t = sc.nextDouble();
        System.out.print("Enter rate of interest:");
        double r = sc.nextDouble();
        double si = (p*t*r)/100;
        System.out.println("Interest is: " + si);
        sc.close();
    }
}