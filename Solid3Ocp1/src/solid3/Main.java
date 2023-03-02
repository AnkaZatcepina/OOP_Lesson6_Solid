package solid3;

import java.util.ArrayList;
import java.util.List;

import solid3.ocp.Circle;
import solid3.ocp.RightTriangle;
import solid3.ocp.Shape;
import solid3.ocp.Square;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        shapes.add(new Circle(5));
        double sumArea = 0;
        for (Shape shape : shapes) {
           sumArea += shape.getArea();
           System.out.printf("Площадь равна %f \n", shape.getArea());
        }

        System.out.printf("Сумма площадей фигур равна %f \n", sumArea);
    }
}
