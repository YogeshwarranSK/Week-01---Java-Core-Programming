package Day4.Level3;
import java.util.ArrayList;
public class DigitAnalyzer {
    public static void main() {
        int number = 153;

        int digitCount = countDigits(number);
        int[] digitsArray = storeDigits(number);
        boolean isDuck = isDuckNumber(digitsArray);
        boolean isArmstrong = isArmstrongNumber(number, digitsArray);
        int[] largestTwo = findLargestTwo(digitsArray);
        int[] smallestTwo = findSmallestTwo(digitsArray);

        System.out.println("Number: " + number);
        System.out.println("Count of Digits: " + digitCount);
        System.out.println("Digits Array: ");
        for (int digit : digitsArray) System.out.print(digit + " ");
        System.out.println("\nIs Duck Number: " + isDuck);
        System.out.println("Is Armstrong Number: " + isArmstrong);
        System.out.println("Largest Digit: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);
        System.out.println("Smallest Digit: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);
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

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int num, int[] digits) {
        int sum = 0, power = digits.length;
        for (int digit : digits) sum += (int) Math.pow(digit, power);
        return sum == num;
    }

    public static int[] findLargestTwo(int[] digits) {
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int num : digits) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }
        return new int[]{firstMax, secondMax};
    }

    public static int[] findSmallestTwo(int[] digits) {
        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int num : digits) {
            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin && num != firstMin) {
                secondMin = num;
            }
        }
        return new int[]{firstMin, secondMin};
    }
}

