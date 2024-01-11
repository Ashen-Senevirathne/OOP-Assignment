// Define the main class for testing the Canvas and various shape implementations
public class Main {
    public static void main(String[] args) {
        // Create a canvas to manage shapes
        Canvas canvas = new Canvas();

        // Create instances of different shapes
        IShape square = new Square(5);
        IShape rectangle = new Rectangle(4, 6);
        IShape circle = new Circle(3);

        // Add shapes to the canvas
        canvas.addElement(square);
        canvas.addElement(rectangle);
        canvas.addElement(circle);

        // Create a shape with border and add it to the canvas
        IShapeWithBorder squareWithBorder = new SquareWithBorder(5);
        canvas.addElement(squareWithBorder);

        // Print the results
        System.out.println("Get area including the border: " + canvas.totalAreaWithBorder(1));
        System.out.println("Get total area of only borders: " + canvas.totalBorderArea(1));
        System.out.println("Get total area without borders: " + canvas.calculateArea());
    }
}
