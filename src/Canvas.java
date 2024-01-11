import java.util.ArrayList;
import java.util.List;

// Define a class named Canvas that implements the IShape interface
public class Canvas {

    private List<Shape> elements = new ArrayList<>();

    // Method to add a shape to the canvas
    public void addElement(Shape shape) {
        elements.add(shape);
    }

    public double calculateArea() {
        // Calculate the total area of all shapes on the canvas
        double total = 0;
        for (Shape element : elements) {
            total += element.calculateArea();
        }
        return total;
    }

    // Calculate the total area of all shapes on the canvas
    public double totalAreaWithBorder() {
        double totalWithBorder = 0;
        for (Shape element : elements) {
            totalWithBorder += element.calculateAreaWithBorder();
        }
        return totalWithBorder;
    }

    // Calculate the total area of all borders on the canvas
    public double totalBorderArea() {
        double totalBorder = 0;
        for (Shape element : elements) {
            totalBorder += element.calculateAreaWithBorder() - element.calculateArea();
        }
        return totalBorder;
    }
}
