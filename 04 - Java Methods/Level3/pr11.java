package Day4.Level3;
import java.util.Random;

public class pr11 {
    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        double[][] salaryAndBonus = calculateSalaryAndBonus(employeeData);
        displayResults(employeeData, salaryAndBonus);
    }

    public static int[][] generateEmployeeData() {
        Random rand = new Random();
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = rand.nextInt(50000) + 10000;
            data[i][1] = rand.nextInt(20) + 1;
        }
        return data;
    }

    public static double[][] calculateSalaryAndBonus(int[][] data) {
        double[][] result = new double[10][3];
        for (int i = 0; i < 10; i++) {
            int oldSalary = data[i][0];
            int yearsOfService = data[i][1];
            double bonus = (yearsOfService > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            double newSalary = oldSalary + bonus;
            result[i][0] = oldSalary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }

    public static void displayResults(int[][] employeeData, double[][] salaryAndBonus) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.println("Employee No | Old Salary | Bonus | New Salary");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < 10; i++) {
            int oldSalary = employeeData[i][0];
            double bonus = salaryAndBonus[i][1];
            double newSalary = salaryAndBonus[i][2];
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
            System.out.printf("%12d | %10d | %5.2f | %10.2f%n", i + 1, oldSalary, bonus, newSalary);
        }
        System.out.println("---------------------------------------------");
        System.out.printf("Total       | %10.2f | %5.2f | %10.2f%n", totalOldSalary, totalBonus, totalNewSalary);
    }
}
