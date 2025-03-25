package Day4.Level3;

public class pr6 {
    public static void main(String[] args) {
        int number = 145;

        int[] factors = findFactors(number);

        System.out.println("Number: " + number);
        System.out.println("Factors of the number: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println("\nGreatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }

    public static int[] findFactors(int num) {
        int[] factors = new int[num];
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[count] = i;
                count++;
            }
        }

        int[] result = new int[count];
        System.arraycopy(factors, 0, result, 0, count);
        return result;
    }

    public static int greatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int num) {
        int[] factors = findFactors(num);
        int sum = sumOfFactors(factors) - num;
        return sum == num;
    }

    public static boolean isAbundantNumber(int num) {
        int[] factors = findFactors(num);
        int sum = sumOfFactors(factors) - num;
        return sum > num;
    }

    public static boolean isDeficientNumber(int num) {
        int[] factors = findFactors(num);
        int sum = sumOfFactors(factors) - num;
        return sum < num;
    }

    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum;
    }
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
