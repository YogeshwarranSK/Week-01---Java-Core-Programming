import java.util.Scanner;

public class calculateTotalSalary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary amt:");
        double sal = sc.nextDouble();
        System.out.println("Enter bonus amt:");
        double bonus = sc.nextDouble();
        double tot_sal = sal + bonus;
        System.out.println("Total Salary in INR:" + tot_sal);
    }
}