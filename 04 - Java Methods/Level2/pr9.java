package Day4.Level2;
import java.util.Scanner;

public class pr9 {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInM = heightInCm / 100;
            double bmi = weight / (heightInM * heightInM);
            data[i][2] = bmi;
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] statuses = new String[10];
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Enter weight (in kg): ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm): ");
            teamData[i][1] = scanner.nextDouble();
        }
        calculateBMI(teamData);
        String[] bmiStatuses = getBMIStatus(teamData);
        System.out.println("\nBMI and Status for Each Person:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + teamData[i][0] + " kg");
            System.out.println("Height: " + teamData[i][1] + " cm");
            System.out.println("BMI: " + teamData[i][2]);
            System.out.println("BMI Status: " + bmiStatuses[i]);
            System.out.println();
        }
        scanner.close();
    }
}
