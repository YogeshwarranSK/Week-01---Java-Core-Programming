package StringPractice;
import java.util.Scanner;
public class LexicographicalComparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter second string: ");
        String s2 = input.nextLine();
        int length1 = s1.length();
        int length2 = s2.length();
        int minLen = Math.min(length1, length2);
        boolean areEqual = true;
        for (int i = 0; i < minLen; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 < c2) {
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
                areEqual = false;
                break;
            }
            else if (c1 > c2) {
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
                areEqual = false;
                break;
            }
        }
        if (areEqual) {
            if (length1 < length2) {
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
            }
            else if (length1 > length2) {
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
            }
            else {
                System.out.println("Both strings are equal");
            }
        }
    }
}

