package org.howard.edu.lsp.finalexam.question3;

// ShapeRenderer using the Factory Pattern and Singleton

/**
 * ShapeRenderer demonstrates the Factory Pattern with Singleton for creating shapes.
 */
public class ShapeRenderer {

    // Singleton instance of the ShapeFactory
    private static ShapeFactory shapeFactory = ShapeFactory.getInstance();

    /**
     * Renders a shape based on the specified type.
     *
     * @param shapeType the type of shape to render.
     */
    public void renderShape(String shapeType) {
        Shape shape = shapeFactory.createShape(shapeType);
        if (shape != null) {
            shape.draw(); // Draw the shape if it's valid
        } else {
            System.out.println("Unknown shape type: " + shapeType); // Handle invalid types
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // Render various shapes
        renderer.renderShape("circle");    // Output: Drawing a Circle
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
        renderer.renderShape("triangle");  // Output: Drawing a Triangle
        renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon
    }
}

// Shape interface representing a generic shape
interface Shape {
    void draw(); // Method to draw the shape
}

// Circle class implementing the Shape interface
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Rectangle class implementing the Shape interface
class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Triangle class implementing the Shape interface
class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

// Factory class to create Shape objects
class ShapeFactory {
    private static ShapeFactory instance; // Singleton instance

    // Private constructor to prevent direct instantiation
    private ShapeFactory() {}

    /**
     * Returns the singleton instance of ShapeFactory.
     *
     * @return the ShapeFactory instance.
     */
    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    /**
     * Creates and returns a Shape object based on the given type.
     *
     * @param shapeType the type of shape to create.
     * @return a Shape object or null if the type is invalid.
     */
    public Shape createShape(String shapeType) {
        if (shapeType == null) {
            return null; // Return null for null input
        }
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "triangle":
                return new Triangle();
            default:
                return null; // Handle unsupported shape types
        }
    }
}
