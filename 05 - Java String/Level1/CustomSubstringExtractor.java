package Day5.Level1;
import java.util.Scanner;
public class CustomSubstringExtractor {
    public static String createSubstringWithCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }
    public static boolean compareStringsWithCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next();
        System.out.print("Enter Starting index: ");
        int start = sc.nextInt();
        System.out.print("Enter Ending index: ");
        int end = sc.nextInt();
        if (start < 0 || end > str.length() || start >= end) {
            System.out.println("Invalid start or end indices.");
            return;
        }
        String substringWithCharAt = createSubstringWithCharAt(str, start, end);
        String substringWithBuiltInMethod = str.substring(start, end);
        boolean areEqual = compareStringsWithCharAt(substringWithCharAt, substringWithBuiltInMethod);
        System.out.println("Substring using charAt() method: " + substringWithCharAt);
        System.out.println("Substring using built-in substring() method: " + substringWithBuiltInMethod);
        System.out.println("Are both substrings equal? " + areEqual);
    }
}