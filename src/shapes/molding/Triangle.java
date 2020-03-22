package shapes.molding;

public class Triangle extends Polygon {

    private double base;
    private double height;
    private double sideA;
    private double sideB;

    public Triangle(double base, double height,double sideA, double sideB) {
        this.base = base;
        this.height = height;
        this.sideA=sideA;
        this.sideB=sideB;
    }

    //mozna dodac kolejne konstruktory dla trojkata rownobocznego i prostokatnego

    @Override
    public double getArea() {
        return (base*height)/2.0;
    }

    @Override
    public double getPerimeter() {
        return (base + sideA + sideB) ;
    }

    @Override
    public int getNumberOfEdges() {
        return 3;
    }
}
