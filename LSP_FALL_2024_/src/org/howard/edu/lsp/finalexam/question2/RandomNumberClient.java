package org.howard.edu.lsp.finalexam.question2;

/**
 * A client application to demonstrate the use of different random number generators.
 */
public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        // Use Java's built-in random number generator
        service.setGenerator(new BuiltInRandomNumberGenerator());
        System.out.println("Built-in random: " + service.getRandomNumber());

        // Use the custom Linear Congruential Generator (LCG)
        service.setGenerator(new RandNumberGenLCG(12345));
        System.out.println("LCG random: " + service.getRandomNumber());
    }
}
