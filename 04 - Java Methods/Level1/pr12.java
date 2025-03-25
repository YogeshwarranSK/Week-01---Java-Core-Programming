package Day4.Level1;
import java.util.Scanner;

public class pr12 {
    public static double[] calculateTrigonometricFunctions(double rad){
        double sine = Math.sin(rad);
        double cosine = Math.cos(rad);
        double tangent = Math.tan(rad);
        return new double[]{(int) sine,cosine,tangent};
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double rad = angle * 5/18;
        double[] trigFunc = calculateTrigonometricFunctions(rad);
        System.out.println("Angle in radians: "+rad);
        System.out.println("Sine value: "+trigFunc[0]);
        System.out.println("Cosine value: "+trigFunc[1]);
        System.out.println("Tangent value: "+trigFunc[2]);
    }
}
