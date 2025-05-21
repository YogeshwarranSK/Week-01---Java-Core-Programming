package StringPractice;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Scanner;
public class RemoveDuplicateCharacters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        String result = removeDuplicate(str);
        System.out.println("String affter removing duplicates: " + result);
    }
    public static String removeDuplicate(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (seen.add(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}