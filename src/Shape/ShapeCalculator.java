package Shape;

public class ShapeCalculator {


    double squareArea(Square square) {

        return Math.pow(square.side, 2);
    }

    double circleArea(Circle cirle) {
        return Math.PI * Math.pow(cirle.radius, 2);
    }

    double trianglePerimeter(Triangle triangle) {

        return triangle.base + triangle.sideA + triangle.sideB;
    }

    double rectPerimeter(Rectangle rectangle) {
        return 2 * rectangle.sideA + 2 * rectangle.sideB;
    }

}

