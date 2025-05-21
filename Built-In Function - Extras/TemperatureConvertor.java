package Builtinfunc;
import java.util.Scanner;

public class TemperatureConvertor {
    public static double cToF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fToC(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();
            double fahrenheit = cToF(celsius);
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsius = fToC(fahrenheit);
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid choice.");
        }
        input.close();
    }
}

