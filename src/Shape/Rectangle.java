package Shape;

public class Rectangle {

    double sideA, sideB;

    ShapeCalculator shapeCalculator = new ShapeCalculator();

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    double calculatePerimeter() {

        return shapeCalculator.rectPerimeter(this);
    }
}
