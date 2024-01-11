class Circle extends Shape {

    private double radius;

    public Circle(double radius, double borderThickness) {
        this.radius = radius;
        this.borderThickness = borderThickness;
    }

    // Implement the calculateArea method from the IShape interface
    @Override
    public double calculateArea() {
        // Calculate the area of the circle using the formula: π * radius * radius
        return Math.PI * radius * radius;
    }

    public double calculateAreaWithBorder() {
        // Calculate the area of the circle with a specified border thickness
        // by adjusting the radius and applying the formula: π * radiusWithBorder * radiusWithBorder
        double radiusWithBorder = radius + borderThickness;
        return Math.PI * radiusWithBorder * radiusWithBorder;
    }
}
