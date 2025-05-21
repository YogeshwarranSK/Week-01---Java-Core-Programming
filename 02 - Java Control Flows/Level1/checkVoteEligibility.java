package Day2.Level1;

import java.util.Scanner;
public class checkVoteEligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter person's age:");
        int age = sc.nextInt();
        if(age < 18) {
            System.out.println("Person cannot vote");
        }
        else{
            System.out.println("Person can vote");
        }
        sc.close();
    }
}
