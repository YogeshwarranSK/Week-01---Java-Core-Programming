public class Prg4 {
    public static void main(String[] args) {
        int cp = 129;
        int sp = 191;
        int profit = sp - cp;
        float profit_percent = (float) profit / cp * 100 ;
        System.out.println("Profit is " + profit + " and profit percent is " + profit_percent);
    }
}