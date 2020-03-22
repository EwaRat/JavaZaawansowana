package molding.shapes.dom;

public class Triangle extends Polygon {

    private double a;
    private double b;
    private double c;

    public Triangle (double a, double b, double c, double h) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.h=h;
    }
    private double h;
    @Override
    public int getNumberOfEdges() {
        return 3;
    }

    @Override
    public double getArea() {
        return 0.5*a*h;
    }

    @Override
    public double getDiameter() {
        return a+b+c;
    }
}
