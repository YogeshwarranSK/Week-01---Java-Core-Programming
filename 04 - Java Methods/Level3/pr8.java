package Day4.Level3;
import java.util.Scanner;

public class pr8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        displayCalendar(monthName, year, daysInMonth, firstDay);
    }

    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
        return days[month - 1];
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0;
    }

    public static void displayCalendar(String monthName, int year, int daysInMonth, int firstDay) {
        System.out.println("     " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int currentDay = 1;


        for (int i = 0; i < firstDay; i++) {
            System.out.printf("%3s", " ");
        }


        for (int i = firstDay; i < 7; i++) {
            System.out.printf("%3d", currentDay);
            currentDay++;
            if (currentDay > daysInMonth) break;
        }
        System.out.println();

        while (currentDay <= daysInMonth) {
            for (int i = 0; i < 7; i++) {
                if (currentDay > daysInMonth) break;
                System.out.printf("%3d", currentDay);
                currentDay++;
            }
            System.out.println();
        }
    }
}
