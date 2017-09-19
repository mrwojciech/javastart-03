package Shape;

public class Circle {
    double radius;

    ShapeCalculator shapeCalculator = new ShapeCalculator();

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea(){
        return shapeCalculator.circleArea(this);
    }
}
