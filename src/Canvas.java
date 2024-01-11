import java.util.ArrayList;
import java.util.List;

// Define a class named Canvas that implements the IShape interface
public class Canvas implements IShape {

    private List<IShape> elements = new ArrayList<>();

    // Method to add a shape to the canvas
    public void addElement(IShape shape) {
        elements.add(shape);
    }

    // Implement the calculateArea method from the IShape interface
    @Override
    public double calculateArea() {
        // Calculate the total area of all shapes on the canvas
        double total = 0;
        for (IShape element : elements) {
            total += element.calculateArea();
        }
        return total;
    }

    // Calculate the total area of all shapes on the canvas with a specified border thickness
    public double totalAreaWithBorder(double borderThickness) {
        double totalWithBorder = 0;
        for (IShape element : elements) {
            if (element instanceof IShapeWithBorder) {
                // If the shape supports borders, calculate the area with border thickness
                totalWithBorder += ((IShapeWithBorder) element).calculateAreaWithBorder(borderThickness);
            } else {
                // If the shape does not support borders, calculate the regular area
                totalWithBorder += element.calculateArea();
            }
        }
        return totalWithBorder;
    }

    // Calculate the total area of all borders on the canvas with a specified border thickness
    public double totalBorderArea(double borderThickness) {
        double totalBorder = 0;
        for (IShape element : elements) {
            if (element instanceof IShapeWithBorder) {
                // If the shape supports borders, calculate the area difference (border area)
                totalBorder += ((IShapeWithBorder) element).calculateAreaWithBorder(borderThickness) - element.calculateArea();
            }
        }
        return totalBorder;
    }
}
