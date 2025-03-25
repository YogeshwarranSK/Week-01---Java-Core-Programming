package Day4.Level2;
import java.util.Scanner;

public class pr7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of friend " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter the height of friend " + (i + 1) + ": ");
            heights[i] = scanner.nextInt();
        }

        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);

        System.out.println("Youngest Friend's Age: " + ages[youngest]);
        System.out.println("Tallest Friend's Height: " + heights[tallest]);
    }

    public static int findYoungest(int[] ages) {
        int youngest = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngest]) {
                youngest = i;
            }
        }
        return youngest;
    }

    public static int findTallest(int[] heights) {
        int tallest = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallest]) {
                tallest = i;
            }
        }
        return tallest;
    }
}
