package shapes.molding;

public class Square extends Rectangle {
    public Square(double sideA) {
        super(sideA, sideA);  // !!!! sideA 2 razy wpisac bo prostokat ma 2 boki, wiec musi byc wpisane w 2 miejscach
    }


    // niepotrzebne to co ponizej bo przejmuje wszystko od prostokata
   /* @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public int getNumberOfEdges() {
        return super.getNumberOfEdges();
    } */
}
