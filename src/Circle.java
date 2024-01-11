class Circle implements IShape {

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the calculateArea method from the IShape interface
    @Override
    public double calculateArea() {
        // Calculate the area of the circle using the formula: π * radius * radius
        return Math.PI * radius * radius;
    }
}
