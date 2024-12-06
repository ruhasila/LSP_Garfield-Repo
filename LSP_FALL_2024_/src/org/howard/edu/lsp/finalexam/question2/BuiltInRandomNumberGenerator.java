package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Implementation of a random number generator using Java's built-in Random class.
 */
public class BuiltInRandomNumberGenerator {
    private Random random;

    /**
     * Initializes a new instance of the built-in random number generator.
     */
    public BuiltInRandomNumberGenerator() {
        this.random = new Random();
    }

    /**
     * Generates a positive pseudo-random integer.
     *
     * @return a positive random number.
     */
    public int generateRandomNumber() {
        return random.nextInt(Integer.MAX_VALUE); // Ensures a non-negative result
    }
}
