package molding.shapes.dom;

import java.util.Random;

public class Calculator {
    // utworzenie tablicy 20 kształtow;
    // losuje 0-4, gdy wypadnie 0: trojkat, 1: prostokat, 2:kwadrat, 3:kolo - podaje ich pola

    public static void main(String[] args) {

        Shapes [] shapes= new Shapes[20];
        for (int i = 0; i <shapes.length ; i++) {
            shapes[i] = getRandomShape();
        }

            for (Shapes shape: shapes) {
                System.out.println(shape.getArea());

        }
    }

    private static Shapes getRandomShape() {
        Random r = new Random();
        Shapes result = null;
        switch (r.nextInt(4)) {
            case 0:
                result = new Triangle(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
                break;
            case 1:
                result = new Rectangle(r.nextDouble(), r.nextDouble());
                break;
            case 2:
                result = new Square(r.nextDouble());
                break;
            case 3:
                result = new Circle(r.nextDouble());
                break;

        }
        return result;

    }
}
