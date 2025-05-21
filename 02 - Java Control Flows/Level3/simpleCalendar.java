package Day2.Level3;
import java.util.Scanner;
public class simpleCalendar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day" +
                "\n0-Sunday,1-Monday,2-Tuesday,3-Wednesday,4-Thursday,5-Friday,6-Saturday:");
        int d = sc.nextInt();
        System.out.println("Enter a month" +
                "\n1-Jan,2-Feb,3-Mar,4-Apr,5-May,6-Jun,7-Jul,8-Aug,9-Sep,10-Oct,11-Nov,12-Dec:");
        int m = sc.nextInt();
        System.out.println("Enter a Year:");
        int y = sc.nextInt();

        int y0 = y - (14-m)/12;
        int x = y0 + y0/4 - y0/100 + y/400;
        int m0 = m+12 * ((14-m)/12)-2;
        int d0 = (d+x+(31*m0)/12)%7;

        System.out.println("Day is:"+d0);
        sc.close();
    }
}
