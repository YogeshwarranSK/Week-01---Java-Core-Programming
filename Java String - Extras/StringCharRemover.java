package StringPractice;
import java.util.Scanner;
public class StringCharRemover {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        System.out.print("Character to remove: ");
        char remove = input.next().charAt(0);
        StringBuilder result = new StringBuilder();
        for (char s : string.toCharArray()) {
            if (s != remove) {
                result.append(s);
            }
        }
        System.out.println("Modified String: " + result);
    }
}
