import java.util.Scanner;

public class Prg14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet:");
        double feet = sc.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("Distance in yards is: " + yards);
        System.out.println("Distance in miles is: " + miles);
        sc.close();
    }
}