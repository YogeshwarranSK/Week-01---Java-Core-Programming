package Day4.Level2;
public class pr11 {
    public static void main(String[] args) {
        int[] randomValues = new int[5];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            randomValues[i] = (int)(Math.random() * 9000) + 1000;
            sum += randomValues[i];
            min = Math.min(min, randomValues[i]);
            max = Math.max(max, randomValues[i]);
        }
        double average = (double) sum / randomValues.length;
        System.out.println("Generated Random Values: ");
        for (int value : randomValues) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Average Value: " + average);
        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);
    }
}
