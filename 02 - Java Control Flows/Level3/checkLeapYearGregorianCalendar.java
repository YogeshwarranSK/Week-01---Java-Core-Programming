package Day2.Level3;
import java.util.Scanner;
public class checkLeapYearGregorianCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year more than 1582:");
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("The Leap Year check is only valid for years starting from 1582.");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
        sc.close();
    }
}