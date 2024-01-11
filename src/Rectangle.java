public class Rectangle implements IShape {

    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement the calculateArea method from the IShape interface
    @Override
    public double calculateArea() {
        // Calculate the area of the rectangle using the formula: length * width
        return length * width;
    }
}
