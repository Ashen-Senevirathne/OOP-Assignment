public class CircleWithBorder extends Circle implements IShapeWithBorder {

    public CircleWithBorder(double radius) {
        super(radius);
    }

    // Implement the calculateAreaWithBorder method from the IShapeWithBorder interface
    @Override
    public double calculateAreaWithBorder(double borderThickness) {
        // Calculate the area of the circle with a specified border thickness
        // by adjusting the radius and applying the formula: π * radiusWithBorder * radiusWithBorder
        double radiusWithBorder = radius + borderThickness;
        return Math.PI * radiusWithBorder * radiusWithBorder;
    }
}
