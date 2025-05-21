package StringPractice;
import java.util.Scanner;
public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String mainString = input.nextLine();
        System.out.println("Enter substring count: ");
        String subString = input.nextLine();
        int count = countOccurrences(mainString, subString);
        System.out.println("Occurrences: " + count);
    }
    public static int countOccurrences(String mainString, String subString) {
        int count = 0, index = 0;
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }
        return count;
    }
}
