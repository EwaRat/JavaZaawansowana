package molding.shapes.dom;

public class Circle extends Shapes {
    private double r;

    public Circle (double r) {
        this.r=r;
    }

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }

    @Override
    public double getDiameter() {
        return 2*Math.PI*r;
    }
}
