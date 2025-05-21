import java.util.Scanner;

public class Prg9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fees amount:");
        int fees = sc.nextInt();
        System.out.println("Enter discount_percent:");
        int discount_percent = sc.nextInt();
        double discount_amt = (double) (fees * discount_percent) / 100;
        double total_fees = fees - discount_amt;
        System.out.println("Discount is: " + discount_amt);
        System.out.println("Total fees after discount is: " + total_fees);
        sc.close();
    }
}