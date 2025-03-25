package StringPractice;
import java.util.Scanner;
public class pr9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        int[] frequenc = new int[256];
        for (char s : string.toCharArray()) {
            frequenc[s]++;
        }
        char moreFrequent = ' ';
        int maximum = 0;
        for (int i = 0; i < 256; i++) {
            if (frequenc[i] > maximum) {
                maximum = frequenc[i];
                moreFrequent = (char) i;
            }
        }
        System.out.println("Most Frequent Character: '" + moreFrequent + "'");
    }
}
