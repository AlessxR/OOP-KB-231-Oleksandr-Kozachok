package lab04.task1;

public class Circle extends Figure {
    private Point x;
    private double radius;

    public Circle(Point x, double radius) {
        this.x = x;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public Point centroid() {
        return x;
    }

    @Override
    public String toString() {
        return "Circle[(" + x + ")" + radius + "Radius" + "]";
    }
}
