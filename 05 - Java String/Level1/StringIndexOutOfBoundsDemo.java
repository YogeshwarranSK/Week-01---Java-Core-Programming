package Day5.Level1;
import java.util.Scanner;
public class pr5 {
    public static void generateException(String text) {
        System.out.println("Attempting to access an out-of-bounds index...");
        System.out.println(text.charAt(text.length()));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Attempting to access an out-of-bounds index...");
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: "
                    + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();
        handleException(userInput);
        input.close();
    }
}
