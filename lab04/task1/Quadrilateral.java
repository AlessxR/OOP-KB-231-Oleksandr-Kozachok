package lab04.task1;

public class Quadrilateral extends Figure{

    private Point a;
    private Point b;
    private Point c;
    private Point y;

    public Quadrilateral(Point a, Point b, Point c, Point y) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.y = y;
    }

    @Override
    public double area() {
        return Math.abs(
                (a.getX() * b.getY() + b.getX() * c.getY() + c.getX() * y.getY() + y.getX() * a.getY()) -
                        (a.getY() * b.getX() + b.getY() * c.getX() + c.getY() * y.getX() + y.getY() * a.getX())
        ) / 2.0;
    }

    @Override
    public Point centroid() {
        return new Point(
                (a.getX() + b.getX() + c.getX() + y.getX()) / 4.0,
                (a.getY() + b.getY() + c.getY() + y.getY()) / 4.0
        );
    }

    @Override
    public String toString() {
        return "";
    }
}
