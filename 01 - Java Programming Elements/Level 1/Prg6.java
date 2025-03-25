public class Prg6 {
    public static void main(String[] args){
        int fee = 125000;
        int discount_percent = 10;
        double discount_amt = (double) 10/100*fee;
        double discount_fee = fee - discount_amt;
        System.out.println("Discounted_amt:" + discount_amt);
        System.out.println("Discounted_fee:" + discount_fee);
    }
}