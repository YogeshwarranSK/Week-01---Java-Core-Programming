package Day4.Level3;
import java.util.ArrayList;
import java.util.Arrays;

public class NumberDigitUtility {
    public static void main() {
        int number = 21;

        int digitCount = countDigits(number);
        int[] digitsArray = storeDigits(number);
        int sumOfDigits = sumDigits(digitsArray);
        int sumOfSquares = sumOfSquares(digitsArray);
        boolean isHarshad = isHarshadNumber(number, sumOfDigits);
        int[][] frequencyArray = digitFrequency(digitsArray);

        System.out.println("Number: " + number);
        System.out.println("Count of Digits: " + digitCount);
        System.out.println("Digits Array: " + Arrays.toString(digitsArray));
        System.out.println("Sum of Digits: " + sumOfDigits);
        System.out.println("Sum of Squares of Digits: " + sumOfSquares);
        System.out.println("Is Harshad Number: " + isHarshad);
        System.out.println("Digit Frequencies:");
        for (int[] freq : frequencyArray) {
            if (freq[1] > 0) System.out.println("Digit " + freq[0] + ": " + freq[1] + " times");
        }
    }

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] storeDigits(int num) {
        ArrayList<Integer> digitsList = new ArrayList<>();
        while (num > 0) {
            digitsList.addFirst(num % 10);
            num /= 10;
        }
        return digitsList.stream().mapToInt(i -> i).toArray();
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) sum += digit;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) sum += (int) Math.pow(digit, 2);
        return sum;
    }

    public static boolean isHarshadNumber(int num, int sumOfDigits) {
        return num % sumOfDigits == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freqArray = new int[10][2];
        for (int i = 0; i < 10; i++) freqArray[i][0] = i;
        for (int digit : digits) freqArray[digit][1]++;
        return freqArray;
    }
}
