package Builtinfunc;
import java.util.Scanner;

public class PalindromeChecker {
    public static String getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        input.close();
        return str;
    }
    public static boolean isPalindrome(String string) {
        string = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = string.length() - 1;
        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void displayResult(String input, boolean result) {
        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        String str = getInput();
        boolean result = isPalindrome(str);
        displayResult(str, result);
    }
}

