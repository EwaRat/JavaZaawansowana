package zad2;

public class Circle extends Shape {

    private double r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        if (r < 0) {
            throw new IllegalArgumentException("Promien mniejszy od 0");
        } else {
            return (Math.PI * r * r);
        }
    }

    @Override
    public double getPerimeter() {
        return (2*Math.PI*r);
    }
}
