package Day4.Level1;
import java.util.Scanner;
public class pr3 {
    public static int maximumHandshakes(int numberOfStudents ){
        double maxHandshake = (double)numberOfStudents  * (numberOfStudents -1)/2;
        return (int) maxHandshake;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.of Students :");
        int numberOfStudents  = sc.nextInt();
        System.out.println("Maximum handshakes: " +maximumHandshakes(numberOfStudents ));
        sc.close();
    }
}
