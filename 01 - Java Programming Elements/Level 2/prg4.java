import java.util.Scanner;
public class prg4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temp in celsius:");
        float c = sc.nextFloat();
        double farh = (c * 9/5)+32;
        System.out.println("Temperature in fahrenheit:"+farh);
    }
}