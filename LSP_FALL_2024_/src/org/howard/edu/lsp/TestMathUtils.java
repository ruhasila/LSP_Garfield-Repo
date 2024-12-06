package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the MathUtils class, verifying the correctness of factorial, isPrime, and gcd methods.
 */
class TestMathUtils{

    /**
     * Verifies that factorial(0) correctly returns 1.
     */
    @Test
    public void testFactorial_ofZero() {
        MathUtils utils = new MathUtils();
        int result = utils.factorial(0);
        assertEquals(1, result, "factorial(0) should return 1");
    }

    /**
     * Verifies that factorial(1) correctly returns 1.
     */
    @Test
    public void testFactorial_ofOne() {
        MathUtils utils = new MathUtils();
        int result = utils.factorial(1);
        assertEquals(1, result, "factorial(1) should return 1");
    }

    /**
     * Tests factorial for a small positive number to ensure the result is accurate.
     */
    @Test
    public void testFactorial_ofPositiveNumber() {
        MathUtils utils = new MathUtils();
        int result = utils.factorial(5);
        assertEquals(120, result, "factorial(5) should return 120");
    }

    /**
     * Tests factorial for a larger positive number to validate correctness.
     */
    @Test
    public void testFactorial_ofLargerNumber() {
        MathUtils utils = new MathUtils();
        int result = utils.factorial(10);
        assertEquals(3628800, result, "factorial(10) should return 3,628,800");
    }

    /**
     * Confirms that factorial throws IllegalArgumentException for negative inputs.
     */
    @Test
    public void testFactorial_ofNegativeNumber_throwsException() {
        MathUtils utils = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> utils.factorial(-1),
            "factorial(-1) should throw IllegalArgumentException");
    }

    /**
     * Verifies isPrime returns true for a prime number.
     */
    @Test
    public void testIsPrime_withPrimeNumber() {
        MathUtils utils = new MathUtils();
        assertTrue(utils.isPrime(7), "7 is a prime number");
    }

    /**
     * Confirms isPrime returns false for a non-prime number.
     */
    @Test
    public void testIsPrime_withNonPrimeNumber() {
        MathUtils utils = new MathUtils();
        assertFalse(utils.isPrime(10), "10 is not a prime number");
    }

    /**
     * Ensures isPrime returns false for 1 and 0, as they are not prime numbers.
     */
    @Test
    public void testIsPrime_withOneAndZero() {
        MathUtils utils = new MathUtils();
        assertFalse(utils.isPrime(1), "1 is not a prime number");
        assertFalse(utils.isPrime(0), "0 is not a prime number");
    }

    /**
     * Validates that isPrime returns false for negative numbers.
     */
    @Test
    public void testIsPrime_withNegativeNumber() {
        MathUtils utils = new MathUtils();
        assertFalse(utils.isPrime(-5), "Negative numbers are not prime");
    }

    /**
     * Verifies isPrime returns true for 2, the smallest prime number.
     */
    @Test
    public void testIsPrime_withTwo() {
        MathUtils utils = new MathUtils();
        assertTrue(utils.isPrime(2), "2 is the smallest prime number");
    }

    /**
     * Tests gcd for two non-zero values to ensure the correct GCD is calculated.
     */
    @Test
    public void testGcd_withTwoNonZeroNumbers() {
        MathUtils utils = new MathUtils();
        int result = utils.gcd(54, 24);
        assertEquals(6, result, "gcd(54,24) should return 6");
    }

    /**
     * Verifies gcd returns the absolute value of the non-zero number when one input is zero.
     */
    @Test
    public void testGcd_withOneZeroValue() {
        MathUtils utils = new MathUtils();
        assertEquals(15, utils.gcd(0, 15), "gcd(0,15) should return 15");
        assertEquals(20, utils.gcd(-20, 0), "gcd(-20,0) should return 20");
    }

    /**
     * Confirms gcd throws IllegalArgumentException when both inputs are zero.
     */
    @Test
    public void testGcd_withBothZero_throwsException() {
        MathUtils utils = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> utils.gcd(0, 0),
            "gcd(0,0) should throw IllegalArgumentException");
    }

    /**
     * Validates gcd for negative inputs, ensuring the correct positive GCD is returned.
     */
    @Test
    public void testGcd_withNegativeNumbers() {
        MathUtils utils = new MathUtils();
        assertEquals(4, utils.gcd(-8, -12), "gcd(-8,-12) should return 4");
    }

    /**
     * Confirms gcd returns 1 for coprime numbers.
     */
    @Test
    public void testGcd_withCoprimeNumbers() {
        MathUtils utils = new MathUtils();
        assertEquals(1, utils.gcd(17, 13), "gcd(17,13) should return 1 since these numbers are coprime");
    }
}
