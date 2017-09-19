package Shape;

public class Square {

    double side;
    ShapeCalculator shapeCalculator = new ShapeCalculator();

    public Square(double side) {
        this.side = side;
    }

    double calculateArea(){
        return shapeCalculator.squareArea(this);
    }
}
