package Builtinfunc;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class pr12 {
    public static void main(String[] args) {
        LocalDate presentDate = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Format 1 (dd/MM/yyyy): " + presentDate.format(format1));
        System.out.println("Format 2 (yyyy-MM-dd): " + presentDate.format(format2));
        System.out.println("Format 3 (EEE, MMM dd, yyyy): " + presentDate.format(format3));
    }
}

