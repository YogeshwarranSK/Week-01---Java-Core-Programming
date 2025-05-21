package Day4.Level3;
import java.util.Arrays;

public class PalindromeAndArrayUtils {
    public static void main(String[] args) {
        int number = 121;

        int digitCount = countDigits(number);
        int[] digitsArray = storeDigits(number);
        int[] reversedArray = reverseDigits(digitsArray);
        boolean isEqual = areArraysEqual(digitsArray, reversedArray);
        boolean isPalindrome = isPalindromeNumber(digitsArray);
        boolean isDuck = isDuckNumber(digitsArray);
        boolean isPrime = isPrimeNumber(number);
        boolean isNeon = isNeonNumber(number);
        boolean isSpy = isSpyNumber(digitsArray);
        boolean isAutomorphic = isAutomorphicNumber(number);
        boolean isBuzz = isBuzzNumber(number);

        System.out.println("Number: " + number);
        System.out.println("Count of Digits: " + digitCount);
        System.out.println("Digits Array: " + Arrays.toString(digitsArray));
        System.out.println("Reversed Digits: " + Arrays.toString(reversedArray));
        System.out.println("Are Arrays Equal: " + isEqual);
        System.out.println("Is Palindrome Number: " + isPalindrome);
        System.out.println("Is Duck Number: " + isDuck);
        System.out.println("Is Prime Number: " + isPrime);
        System.out.println("Is Neon Number: " + isNeon);
        System.out.println("Is Spy Number: " + isSpy);
        System.out.println("Is Automorphic Number: " + isAutomorphic);
        System.out.println("Is Buzz Number: " + isBuzz);
    }

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] storeDigits(int num) {
        String numStr = Integer.toString(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindromeNumber(int[] digits) {
        return areArraysEqual(digits, reverseDigits(digits));
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isPrimeNumber(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeonNumber(int num) {
        int square = num * num, sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static boolean isSpyNumber(int[] digits) {
        int sum = 0, product = 1;
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int num) {
        String numStr = Integer.toString(num);
        String squareStr = Integer.toString(num * num);
        return squareStr.endsWith(numStr);
    }

    public static boolean isBuzzNumber(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }
}

