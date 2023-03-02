package solid3.ocp;

public class Circle implements Shape{
    private int radius;
    double PI = Math.PI;

    public Circle(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public double getArea(){
        return PI * Math.pow(radius, 2);
    }
}
