package Day4.Level1;
import java.util.Scanner;
public class pr4 {
    public static float calculatePerimeter(float side1, float side2, float side3) {
        return side1 + side2 + side3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1 (in meters): ");
        float side1 = sc.nextFloat();
        System.out.println("Enter side 2 (in meters): ");
        float side2 = sc.nextFloat();
        System.out.println("Enter side 3 (in meters): ");
        float side3 = sc.nextFloat();
        float perimeter = calculatePerimeter(side1, side2, side3);
        float totalDistance = 5000;
        float rounds = totalDistance / perimeter;

        System.out.println("The athlete needs to complete approximately " + Math.ceil(rounds) + " rounds to cover 5 km.");
    }
}