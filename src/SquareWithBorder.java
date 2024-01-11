public class SquareWithBorder extends Square implements IShapeWithBorder {

    public SquareWithBorder(double sideLength) {
        super(sideLength);
    }

    @Override
    public double calculateAreaWithBorder(double borderThickness) {
        // Calculate the area of the square with a specified border thickness
        // by adjusting the side length and applying the formula: sideWithBorder * sideWithBorder
        double sideWithBorder = sideLength + borderThickness;
        return sideWithBorder * sideWithBorder;
    }
}
