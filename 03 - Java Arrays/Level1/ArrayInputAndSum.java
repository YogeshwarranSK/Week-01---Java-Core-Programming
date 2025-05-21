package Day3.Level1;
import java.util.Scanner;
public class ArrayInputAndSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[11];
        double total = 0.0;
        int index = 0;
        System.out.println("Enter elements: ");
        do{
            double num = sc.nextDouble();
            numbers[index] = num;
            index++;
        }while(index<=9);
        for(int i = 0; i < numbers.length; i++){
            total = total+numbers[i];
        }
        System.out.print("Total: " + total);
        sc.close();
    }
}