public class Square extends Shape {

    protected double sideLength;

    public Square(double sideLength, double borderThickness) {
        this.sideLength = sideLength;
        this.borderThickness = borderThickness;
    }

    // Implement the calculateArea method from the IShape interface
    @Override
    public double calculateArea() {
        // Calculate the area of the square using the formula: sideLength * sideLength
        return sideLength * sideLength;
    }

    @Override
    public double calculateAreaWithBorder() {
        // Calculate the area of the square with a specified border thickness
        // by adjusting the side length and applying the formula: sideWithBorder * sideWithBorder
        double sideWithBorder = sideLength + borderThickness;
        return sideWithBorder * sideWithBorder;
    }
}
