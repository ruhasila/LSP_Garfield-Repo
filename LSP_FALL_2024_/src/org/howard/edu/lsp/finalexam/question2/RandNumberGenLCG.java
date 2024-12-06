package org.howard.edu.lsp.finalexam.question2;

/**
 * A custom random number generator using the Linear Congruential Generator (LCG) algorithm.
 */
public class RandNumberGenLCG {
    private long seed;

    /**
     * Initializes the generator with a given seed value.
     *
     * @param seed the starting value for random number generation.
     */
    public RandNumberGenLCG(long seed) {
        this.seed = seed;
    }

    /**
     * Generates the next random number based on the LCG formula.
     *
     * @return the generated random integer.
     */
    public int generateRandomNumber() {
        seed = (1664525L * seed + 1013904223L) % (1L << 32); // LCG formula
        return (int) seed;
    }
}
