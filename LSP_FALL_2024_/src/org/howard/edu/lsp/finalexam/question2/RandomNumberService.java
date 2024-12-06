package org.howard.edu.lsp.finalexam.question2;

/**
 * A service class that allows switching between different random number generators.
 * Implements the Singleton design pattern.
 */
public class RandomNumberService {
    private static final RandomNumberService instance = new RandomNumberService();
    private Object generator;

    /**
     * Private constructor to ensure only one instance of the service is created.
     */
    private RandomNumberService() {}

    /**
     * Retrieves the singleton instance of RandomNumberService.
     *
     * @return the singleton instance.
     */
    public static RandomNumberService getInstance() {
        return instance;
    }

    /**
     * Sets the random number generator to be used by the service.
     *
     * @param generator the generator implementation.
     */
    public void setGenerator(Object generator) {
        this.generator = generator;
    }

    /**
     * Generates a random number using the currently configured generator.
     *
     * @return a random number.
     * @throws IllegalStateException if the generator is not set or unknown.
     */
    public int getRandomNumber() {
        if (generator == null) {
            throw new IllegalStateException("Generator not set.");
        }
        if (generator instanceof BuiltInRandomNumberGenerator) {
            return ((BuiltInRandomNumberGenerator) generator).generateRandomNumber();
        } else if (generator instanceof RandNumberGenLCG) {
            return ((RandNumberGenLCG) generator).generateRandomNumber();
        } else {
            throw new IllegalStateException("Unknown generator type.");
        }
    }
}
