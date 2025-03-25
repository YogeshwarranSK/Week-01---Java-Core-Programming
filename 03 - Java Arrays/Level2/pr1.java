package Day3.Level2;

import java.util.Scanner;

public class pr1 {

    public static void main(String[] args) {
        double[] oldSalary = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonuses = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    System.out.println("Enter the salary of employee " + (i + 1) + ":");
                    oldSalary[i] = sc.nextDouble();
                    if (oldSalary[i] <= 0) {
                        System.out.println("Salary must be a positive number. Please enter again.");
                        continue;
                    }
                    System.out.println("Enter the years of service of employee " + (i + 1) + ":");
                    yearsOfService[i] = sc.nextInt();
                    if (yearsOfService[i] < 0) {
                        System.out.println("Years of service cannot be negative. Please enter again.");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter numeric values.");
                    sc.next();
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = oldSalary[i] * 0.05;
            } else {
                bonuses[i] = oldSalary[i] * 0.02;
            }
            newSalary[i] = oldSalary[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += oldSalary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\nEmployee Bonus and Salary Details:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d - Old Salary: %.2f, Bonus: %.2f, New Salary: %.2f%n",
                    (i + 1), oldSalary[i], bonuses[i], newSalary[i]);
        }
        sc.close();
    }
}