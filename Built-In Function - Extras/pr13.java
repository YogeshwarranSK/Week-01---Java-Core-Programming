package Builtinfunc;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class pr13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String input1 = input.nextLine();
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String input2 = input.nextLine();
        LocalDate date1 = LocalDate.parse(input1, format);
        LocalDate date2 = LocalDate.parse(input2, format);
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before second date.");
        }
        else if (date1.isAfter(date2)) {
            System.out.println("The first date is after second date.");
        }
        else if (date1.isEqual(date2)) {
            System.out.println("Both dates are same.");
        }
    }
}

