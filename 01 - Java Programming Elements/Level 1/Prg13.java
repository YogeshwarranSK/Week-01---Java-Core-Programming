import java.util.Scanner;

public class Prg13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of a square:");
        double s = sc.nextDouble();
        double perimeter = 4 * s;
        System.out.println("Perimeter of square is: " + perimeter);
        sc.close();
    }
}