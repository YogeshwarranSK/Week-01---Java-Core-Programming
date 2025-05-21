import java.util.Scanner;
public class findArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base:");
        float b = sc.nextFloat();
        System.out.print("Enter the height:");
        float h = sc.nextFloat();
        float area_cm2 = (float)1/2 * b * h;
        float area_in2 = area_cm2 / 2.54f;
        System.out.println("Area of rectangle in squared centimeters: " + area_cm2);
        System.out.println("Area of rectangle in squared inches: " + area_in2);
        sc.close();

    }
}