package Day4.Level1;
import java.util.Scanner;
public class pr10 {
    public static int[] findChildrenAndChocolates(int numberofChildren, int numberofChocolates){
        int ChocolatesperPerson = numberofChocolates/numberofChildren ;
        int RemainingChocolates = numberofChocolates % numberofChildren ;
        return new int[]{ChocolatesperPerson, RemainingChocolates};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.of Chlidren: ");
        int numberofChildren = sc.nextInt();
        System.out.println("Enter No.of Chocolates: ");
        int numberofChocolates = sc.nextInt();
        if(numberofChocolates == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            int[] res = findChildrenAndChocolates(numberofChildren,numberofChocolates);
            System.out.println("Number of Chocolates per Children: " + res[0] );
            System.out.println("Number of Remaining Chocolates: " + res[1] );
            sc.close();
        }
    }
}
