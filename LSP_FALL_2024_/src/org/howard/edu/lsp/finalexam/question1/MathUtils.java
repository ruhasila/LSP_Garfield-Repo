package org.howard.edu.lsp.finalexam.question1;

/**
 * This utility class offers mathematical functions, including
 * calculating factorials, determining prime numbers, and finding
 * the greatest common divisor (GCD).
 */
public class MathUtils {

    /**
     * Computes the factorial of a non-negative integer.
     * Throws an exception if the input is negative.
     *
     * @param n the non-negative integer to calculate the factorial for
     * @return the factorial value of n
     * @throws IllegalArgumentException if n is a negative number
     */
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * Determines whether the input number is a prime.
     *
     * @param n the number to check
     * @return true if the number is prime, otherwise false
     */
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Computes the greatest common divisor (GCD) of two integers
     * using the Euclidean algorithm. Handles cases where one or both
     * inputs are zero. Throws an exception if both inputs are zero.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the GCD of a and b
     * @throws IllegalArgumentException if both inputs are zero
     */
    public int gcd(int a, int b) {
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("Both numbers cannot be zero");
        }
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
