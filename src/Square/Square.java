package Square;
import Shape.Shape;

public class Square extends Shape {
    private double Side = 1.0;

    public Square() {
    }

    public Square(double Side) {
        this.Side = Side;
    }

    public Square(double Side, String color, boolean filled) {
        super(color, filled);
        this.Side = Side;
    }

    public double getSide() {
        return Side;
    }

    public void setSide(double Side) {
        this.Side = Side;
    }

    public double getArea() {
        return Side * Side;
    }

    public double getPerimeter() {
        return 2 * Side;
    }

    @Override
    public String toString() {
        return "A Square: Sqquare with Side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}