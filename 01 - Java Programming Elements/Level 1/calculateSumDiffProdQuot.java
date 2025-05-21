import java.util.Scanner;

public class calculateSumDiffProdQuot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        float n1 = sc.nextFloat();
        System.out.print("Enter the second number:");
        float n2 = sc.nextFloat();
        double sum = n1 + n2;
        double diff = n1 - n2;
        double product = n1 * n2;
        double quotient = n1 / n2;
        System.out.println("Sum is: " + sum);
        System.out.println("Difference is: " + diff);
        System.out.println("Product is: " + product);
        System.out.println("Quotient is: " + quotient);
        sc.close();
    }
}