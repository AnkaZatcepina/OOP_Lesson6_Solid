package solid1;

import solid1.srp.Point;
import solid1.srp.Square;
import solid1.srp.SquareCalc;
import solid1.srp.SquareView;

public class Main {
    public static void main(String[] args) {
        //Square square = new Square(new Point(1,1), 5);
        //System.out.printf("Площадь фигуры: %d \n", square.getArea());
        //square.draw();
        SquareCalc square = new SquareCalc( 5);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        SquareView squareView = new SquareView();
        squareView.draw(square.getSide()*2);
    }
}
