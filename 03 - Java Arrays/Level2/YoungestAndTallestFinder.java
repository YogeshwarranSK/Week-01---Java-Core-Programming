package Day3.Level2;
import java.util.Scanner;
public class YoungestAndTallestFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] age = new double[3];
        double[] height = new double[3];
        System.out.println("Enter Ages:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of person " + (i + 1) + ": ");
            age[i] = sc.nextDouble();
        }
        double youngest = age[0];
        for (int i = 1; i < 3; i++) {
            if (age[i] < youngest) {
                youngest = age[i];
            }
        }
        System.out.println("Youngest among all is: " + youngest);

        System.out.println("Enter Heights:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter height of person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
        }
        double tallest = height[0];
        for (int i = 1; i < 3; i++) {
            if (height[i] > tallest) {
                tallest = height[i];
            }
        }
        System.out.println("Tallest among all is: " + tallest);
        sc.close();
    }
}