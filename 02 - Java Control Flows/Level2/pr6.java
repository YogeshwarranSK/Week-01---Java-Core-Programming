package Day2.Level2;
import java.util.Scanner;
public class pr6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amar age:");
        int amarAge = sc.nextInt();
        System.out.println("Enter akbar:");
        int akbarAge = sc.nextInt();
        System.out.println("Enter Anthony age:");
        int anthonyAge = sc.nextInt();

        String youngest;
        if(amarAge<akbarAge && amarAge<anthonyAge){
            youngest = "Amar";
        }else if(akbarAge<amarAge && akbarAge<anthonyAge){
            youngest = "Akbar";
        }else if(anthonyAge<amarAge && anthonyAge<akbarAge){
            youngest = "Anthony";
        }else{
            youngest = "No one";
        }
        System.out.println("Youngest is "+youngest);

        String tallest;
        System.out.println("Enter amar height:");
        int amarHeight = sc.nextInt();
        System.out.println("Enter akbar height:");
        int akbarHeight = sc.nextInt();
        System.out.println("Enter Anthony height:");
        int anthonyHeight = sc.nextInt();
        if(amarHeight>akbarHeight && amarHeight>anthonyHeight){
            tallest = "Amar";
        }else if(akbarHeight>amarHeight && akbarHeight>anthonyHeight){
            tallest = "Akbar";
        }else if(anthonyHeight>amarHeight && anthonyHeight>akbarHeight){
            tallest = "Anthony";
        }else {
            tallest = "No one";
        }
        System.out.println("Tallest is "+tallest);
        sc.close();
        }
    }
