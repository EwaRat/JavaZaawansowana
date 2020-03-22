package molding.shapes.dom;

public class Rectangle extends Polygon {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a=a;
        this.b=b;
    }

    @Override
    public int getNumberOfEdges() {
        return 4;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getDiameter() {
        return 2*a + 2*b;
    }
}
