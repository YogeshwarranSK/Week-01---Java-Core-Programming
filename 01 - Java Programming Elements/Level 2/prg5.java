import java.util.Scanner;
public class prg5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temp in fahrenheit:");
        float fahr = sc.nextFloat();
        float cel = (fahr-32)*5/9;
        System.out.println("Temperature in Celsius:"+cel);
    }
}