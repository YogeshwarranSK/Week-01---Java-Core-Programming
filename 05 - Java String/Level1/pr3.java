package Day5.Level1;
import java.util.Scanner;
public class pr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        char[] customArray = getCharsWithoutToCharArray(input);
        char[] builtInArray = input.toCharArray();

        boolean areArraysEqual = compareCharArrays(customArray, builtInArray);

        System.out.println("Custom Method Array: ");
        for (char c : customArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Built-in toCharArray Method Array: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are the arrays equal? " + areArraysEqual);
    }

    public static char[] getCharsWithoutToCharArray(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
