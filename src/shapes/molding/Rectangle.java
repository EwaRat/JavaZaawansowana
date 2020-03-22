package shapes.molding;

public class Rectangle extends Polygon {

    private double sideA;
    private double sideB;

    public Rectangle(double bokA, double bokB) {
        this.sideA =bokA;
        this.sideB =bokB;
    }

    @Override
    public double getArea() {

        return (this.sideA * this.sideB);
    }

    @Override
    public double getPerimeter() {
        return (2* this.sideA + 2* this.sideB);
    }

    @Override
    public int getNumberOfEdges() {
        return 4;
    }
}
