public class Rectangle extends Shape {

    public double length;
    public double width;

    public Rectangle(double length, double width, double borderThickness) {
        this.length = length;
        this.width = width;
        this.borderThickness = borderThickness;
    }

    // Implement the calculateArea method from the IShape interface
    @Override
    public double calculateArea() {
        // Calculate the area of the rectangle using the formula: length * width
        return length * width;
    }

    @Override
    public double calculateAreaWithBorder() {
        // Calculate the area of the rectangle with a specified border thickness
        // by adjusting the length and width and applying the formula: lengthWithBorder * widthWithBorder
        double lengthWithBorder = length + borderThickness;
        double widthWithBorder = width + borderThickness;
        return lengthWithBorder * widthWithBorder;
    }
}
