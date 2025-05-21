import java.util.Scanner;
public class calculateWeight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in Pounds:");
        double p = sc.nextDouble();
        double w = p * 2.2;
        System.out.println("The weight of the person in kg:" + w );
        sc.close();
    }
}