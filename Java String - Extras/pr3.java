package StringPractice;
import java.util.Scanner;
public class pr3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        input.close();
        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s+", ""); // Ignore case and spaces
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}

