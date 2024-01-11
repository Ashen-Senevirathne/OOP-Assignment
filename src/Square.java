public class Square implements IShape {

    protected double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    // Implement the calculateArea method from the IShape interface
    @Override
    public double calculateArea() {
        // Calculate the area of the square using the formula: sideLength * sideLength
        return sideLength * sideLength;
    }
}
