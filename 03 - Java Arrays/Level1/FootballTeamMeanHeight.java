package Day3.Level1;
import java.util.Scanner;
public class FootballTeamMeanHeight {
    public static void main(String[] args) {
        double[] heights = new double[11];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (double height : heights) {
            sum += height;
        }
        double meanHeight = sum / heights.length;
        System.out.println("The mean height of the football team is: " + meanHeight);
        sc.close();
    }
}