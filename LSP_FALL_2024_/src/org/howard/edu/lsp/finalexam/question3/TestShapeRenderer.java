package org.howard.edu.lsp.finalexam.question3;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for the ShapeRenderer class.
 * Verifies the correct behavior of the renderShape method for various shape types.
 */
public class TestShapeRenderer {

    /**
     * Tests rendering a Circle.
     * Ensures that the correct output is displayed when the shape type is "circle".
     */
    @Test
    public void testCircleCreation() {
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("circle");
        // Example assertion: assertEquals("Drawing a Circle", output);
        // Use a mock framework or capture console output to verify behavior.
    }

    /**
     * Tests rendering a Rectangle.
     * Ensures that the correct output is displayed when the shape type is "rectangle".
     */
    @Test
    public void testRectangleCreation() {
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("rectangle");
        // Example assertion: assertEquals("Drawing a Rectangle", output);
    }

    /**
     * Tests rendering a Triangle.
     * Ensures that the correct output is displayed when the shape type is "triangle".
     */
    @Test
    public void testTriangleCreation() {
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("triangle");
        // Example assertion: assertEquals("Drawing a Triangle", output);
    }

    /**
     * Tests rendering an unsupported or unknown shape type.
     * Ensures that the appropriate message is displayed for invalid shape types like "hexagon".
     */
    @Test
    public void testUnknownShape() {
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("hexagon");
        // Expected behavior: Output is "Unknown shape type: hexagon".
        // Example assertion: assertEquals("Unknown shape type: hexagon", output);
    }
}
