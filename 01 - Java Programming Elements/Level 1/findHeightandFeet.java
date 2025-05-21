import java.util.Scanner;

public class findHeightandFeet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in cm:");
        double cm = sc.nextDouble();
        double inch = cm / 2.54;
        double feet = inch / 12;
        System.out.println("Height in inches is: " + inch);
        System.out.println("Height in feet is: " + feet);
        sc.close();

    }
}