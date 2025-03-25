package Day5.Level1;
import java.util.Scanner;
public class pr1 {
    public static boolean compareUsingCharAt(String str1, String str2) {
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
        System.out.println("Enter 1st String: ");
        String str1 = sc.next();
        System.out.println("Enter 2nd String: ");
        String str2 = sc.next();
        boolean charAtResult = compareUsingCharAt(str1, str2);
        System.out.println("Comparison using charAt method: " + charAtResult);
        boolean equalsResult = str1.equals(str2);
        System.out.println("Comparison using equals() method: " + equalsResult);

        if (charAtResult == equalsResult) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("Results differ. Possible issue in charAt logic.");
        }
        sc.close();
    }
}