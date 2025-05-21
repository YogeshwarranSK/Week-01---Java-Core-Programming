import java.util.Scanner;

public class calculateTotalRounds {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1:");
        int s1 = sc.nextInt();
        System.out.println("Enter side2:");
        int s2 = sc.nextInt();
        System.out.println("Enter side3:");
        int s3 = sc.nextInt();
        int perimeter = s1 + s2 + s3;
        int dist = 3;
        double rounds = (double) dist /perimeter;
        System.out.println("Total Number rounds:" + rounds);
    }
}