package Shape;

public class ShapeTest {
    public static void main(String[] args) {

        Circle circle = new Circle(3.2);
        Rectangle rectangle = new Rectangle(4, 5.5);
        Square square = new Square(5.4);
        Triangle triangle = new Triangle(3, 4, 5);

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println(
                shapeCalculator.circleArea(circle));

        System.out.println(circle.calculateArea());

        System.out.println(
                shapeCalculator.rectPerimeter(rectangle));

        System.out.println(rectangle.calculatePerimeter());

        System.out.println(
                shapeCalculator.squareArea(square));
        System.out.println(square.calculateArea());

        System.out.println(
                shapeCalculator.trianglePerimeter(triangle));
        System.out.println(triangle.calculatePerimeter());


    }
}
