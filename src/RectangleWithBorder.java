public class RectangleWithBorder extends Rectangle implements IShapeWithBorder {

    public RectangleWithBorder(double length, double width) {
        // Call the constructor of the base class (Rectangle) to set the length and width
        super(length, width);
    }

    // Implement the calculateAreaWithBorder method from the IShapeWithBorder interface
    @Override
    public double calculateAreaWithBorder(double borderThickness) {
        // Calculate the area of the rectangle with a specified border thickness
        // by adjusting the length and width and applying the formula: lengthWithBorder * widthWithBorder
        double lengthWithBorder = length + borderThickness;
        double widthWithBorder = width + borderThickness;
        return lengthWithBorder * widthWithBorder;
    }
}
