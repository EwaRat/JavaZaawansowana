package shapes.molding;

public class Circle extends Shapes {

    private final double radius; //final!!

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public double getArea() {
        if (radius < 0) {
            throw new IllegalArgumentException("Promien mniejszy od 0");
        } else {
            return (Math.PI * radius * radius);
        }
    }

    @Override
    public double getPerimeter() {
        if (radius < 0) {
            throw new IllegalArgumentException("Promien mniejszy od 0");
        } else {
            return (2 * Math.PI * radius);
        }
    }
}
