package Day4.Level1;
import java.util.Scanner;
public class WindChillCalculator {
    public static double calculateWindChill(double temperature, double speed){
        double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(speed,0.16);
        return windChill;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Wind Temperature: ");
        double temperature = sc.nextDouble();
        System.out.println("Enter Wind Speed: ");
        double speed = sc.nextDouble();
        double windChill = calculateWindChill(temperature,speed);
        System.out.println("Wind Chill Temperature: " + windChill);
        sc.close();
    }
}
