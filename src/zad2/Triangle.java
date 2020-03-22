package zad2;

public class Triangle extends Polygon {

    public double a;
    public double b;
    public double c;
    public double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }


    @Override
    public int getNumberOfEdges() {
        return 3;
    }

    @Override
    public double getArea() {
        return a*h;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
