package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * A driver class to test the MapUtilities class.
 */
public class MapUtilitiesDriver {

    /**
     * The main method to execute the test cases.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        // Create map1 and add name-value pairs to it
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Carl", "Doe");
        map1.put("Jane", "Smith");
        map1.put("Mike", "Brown");
        map1.put("Emily", "Davis");

        // Create map2 and add name-value pairs to it
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Carl", "Doe");
        map2.put("Jane", "Doe");
        map2.put("Mike", "Brown");
        map2.put("Anna", "Taylor");

        // Output answer to stdout
        System.out.println("Number of common key/value pairs is: " +
                MapUtilities.commonKeyValuePairs(map1, map2));
    }
}
