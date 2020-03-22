package shapes.molding;

import java.util.Random;
public class Calculator extends IllegalArgumentException {
    public static void main(String[] args) {
        // utworzenie tablicy 20 kształtow;
        // losuje 0-4, gdy wypadnie 0: trojkat, 1: prostokat, 2:kwadrat, 3:kolo - podaje ich pola
        Shapes[] shapes = new Shapes[20];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = getRandomShape();
        }
        for (Shapes shape : shapes) {
            try {
                System.out.println(shape.getArea());
            }catch(IllegalArgumentException e){
                System.out.println("Bład! " + e.getMessage());
            }
        }
    }
    private static Shapes getRandomShape() {
        Random r = new Random();
        Shapes result = new Circle(r.nextDouble());
        switch (r.nextInt(4)) {
            case 0:
                result = new Triangle(r.nextDouble(),r.nextDouble(),r.nextDouble(),r.nextDouble());
                break;
           /* case 1:
                result = new Rectangle(4, 5);
                break;
            case 2:
                result = new Square(5);
                break; */
            case 3:
                try {
                    result = new Circle(-5);
                } catch (IllegalArgumentException e) {
                    System.out.println("Bład! " + e.getMessage());
                }
                /* lub:
                case 3:
        result = new Circle(-5);
        try {
           result.getArea();
        } catch (IllegalArgumentException e) {
            System.out.println("Bład!!" + e.getMessage());
        }
}
                 */
        }
        return result;
    }
}


