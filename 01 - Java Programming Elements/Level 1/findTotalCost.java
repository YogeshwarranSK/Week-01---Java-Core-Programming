import java.util.Scanner;
public class findTotalCost {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit_price of product:");
        int unit_price = sc.nextInt();
        System.out.println("Enter quantity of product:");
        int quantity = sc.nextInt();
        System.out.println("Total cost of product is: " + (quantity * unit_price));
    }
}