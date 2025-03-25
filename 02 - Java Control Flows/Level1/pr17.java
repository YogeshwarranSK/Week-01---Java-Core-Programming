package Day2.Level1;
import java.util.Scanner;
public class pr17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary amount:");
        double amt = sc.nextDouble();
        System.out.println("Enter no.of Years Worked:");
        int year = sc.nextInt();
        if(year>5){
            double new_sal = ((double) 5 /100) *  amt;
            double total_sal = new_sal + amt;
            System.out.println("New Incremented Salary:"+total_sal);
        }
        else{
            System.out.println("No Increment, Your Salary is:"+amt);
        }
    }
}
