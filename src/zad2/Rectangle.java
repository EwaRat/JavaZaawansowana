package zad2;

public class Rectangle extends Polygon {
    public double a;
    public double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
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
    public double getPerimeter() {
        return 2*a + 2*b;
    }
}
