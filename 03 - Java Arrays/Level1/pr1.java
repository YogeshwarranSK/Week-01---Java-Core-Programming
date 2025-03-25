package Day3.Level1;
import java.util.Scanner;
public class pr1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        int i;
        for(i=0;i<age.length;i++){
            System.out.println("Enter age of "+ (i+1) +":");
            age[i] = sc.nextInt();
        }
        for(int ages : age){
            if(ages<=0){
                System.out.println("Invalid Age!");
            } else if (ages > 18) {
                System.out.println("Student with age "+ ages + " can vote");
            }else{
                System.out.println("Student with age "+ ages + " can't vote");
            }
        }sc.close();

    }
}
