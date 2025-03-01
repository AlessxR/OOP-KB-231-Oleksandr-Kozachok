package lab04.task1;

public class Triangle extends Figure{

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return Math.abs(
                a.getX() * (b.getY() - c.getY()) +
                        b.getX() * (c.getY() - a.getY()) +
                        c.getX() * (a.getY() - b.getY())
        ) / 2.0;
    }

    @Override
    public Point centroid() {
        double x = ((a.getX() + b.getX() + c.getX()) / 3);
        double y = ((a.getY() + b.getY() + c.getY()) / 3);

        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Triangle[" + "A(" + a + ")" +  ", " + b + ", " + c + "]";
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }
}
