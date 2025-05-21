import java.util.Scanner;

public class maximumHandshakes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n =sc.nextInt();
        double max_handshakes = (float)n * (n - 1) / 2;
        System.out.println("Maximum handshakes are: " + max_handshakes);
    }
}