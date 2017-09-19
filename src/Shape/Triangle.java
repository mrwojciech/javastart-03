package Shape;

public class Triangle {
    double base, sideA, sideB;
    ShapeCalculator shapeCalculator = new ShapeCalculator();

    public Triangle(double base, double sideA, double sideB) {
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double calculatePerimeter() {
        return shapeCalculator.trianglePerimeter(this);

    }
}
