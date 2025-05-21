package Builtinfunc;
import java.time.LocalDate;

public class DateTimeFormatter {
    public static void main(String[] args) {
        LocalDate presentDate = LocalDate.now();
        java.time.format.DateTimeFormatter format1 = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
        java.time.format.DateTimeFormatter format2 = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd");
        java.time.format.DateTimeFormatter format3 = java.time.format.DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Format 1 (dd/MM/yyyy): " + presentDate.format(format1));
        System.out.println("Format 2 (yyyy-MM-dd): " + presentDate.format(format2));
        System.out.println("Format 3 (EEE, MMM dd, yyyy): " + presentDate.format(format3));
    }
}

