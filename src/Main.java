// Define the main class for testing the Canvas and various shape implementations
public class Main {
    public static void main(String[] args) {
        // Create a canvas to manage shapes
        Canvas canvas = new Canvas();

        // Create instances of different shapes
        Shape square = new Square(5, 1);
        Shape rectangle = new Rectangle(4, 6, 0);
        Shape circle = new Circle(3, 0);

        // Add shapes to the canvas
        canvas.addElement(square);
        canvas.addElement(rectangle);
        canvas.addElement(circle);

        // Print the results
        System.out.println("Get area including the border: " + canvas.totalAreaWithBorder());
        System.out.println("Get total area of only borders: " + canvas.totalBorderArea());
        System.out.println("Get total area without borders: " + canvas.calculateArea());
    }
}
