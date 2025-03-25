package Day2.Level3;
import java.util.Scanner;
public class pr3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics Mark:");
        float p = sc.nextFloat();
        System.out.println("Enter Chemistry Mark:");
        float c = sc.nextFloat();
        System.out.println("Enter Maths Mark:");
        float m = sc.nextFloat();
        double avg = (p+c+m)/3;
        if(avg>=80){
            System.out.println("Your Grade: A" +
                    "\nYour Level: 4"+
                    "\nRemark: You are above agency normalized Students");
        }else if(avg>=70 && avg<=79 ) {
            System.out.println("Your Grade: B" +
                    "\nYour Level: 3" +
                    "\nRemark: You are agency normalized Students");
        }else if(avg>=60 && avg<=69 ) {
            System.out.println("Your Grade: C" +
                    "\nYour Level: 2" +
                    "\nRemark: Below,but approaching agency normalized Students");
        }else if(avg>=50 && avg<=59 ) {
            System.out.println("Your Grade: D" +
                    "\nYour Level: 1" +
                    "\nRemark: Well below, agency normalized Students");
        }else if(avg>=40 && avg<=49 ) {
            System.out.println("Your Grade: E" +
                    "\nYour Level: 1" +
                    "\nRemark: Too below agency normalized Students");
        }else{
            System.out.println("Your Grade: R" +
                    "\nYour Level: 0" +
                    "\nRemark: Remedial Standard");
        }
        sc.close();
    }
}
