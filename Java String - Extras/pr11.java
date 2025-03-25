package StringPractice;
import java.util.Scanner;
import java.util.Arrays;
public class pr11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String string1 = input.nextLine().replaceAll("\\s", "").toLowerCase();
        System.out.print("Enter second string: ");
        String string2 = input.nextLine().replaceAll("\\s", "").toLowerCase();
        if (string1.length() != string2.length()) {
            System.out.println("The strings are not anagrams.");
            return;
        }
        char[] ar1 = string1.toCharArray();
        char[] ar2 = string2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if (Arrays.equals(ar1, ar2)) {
            System.out.println("The strings are anagrams.");
        }
        else {
            System.out.println("The strings are not anagrams.");
        }
    }
}

