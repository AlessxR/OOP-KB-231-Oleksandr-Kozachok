package lab02.task3;

public class Triangle {

    private final Point a, b, c;
    private final double ab, ac, bc;

    public Triangle(Point a, Point b, Point c) {
        if (null == a || null == b || null == c) {
            throw new NullPointerException("Null point!");
        }

        this.a = a;
        this.b = b;
        this.c = c;
        this.ab = length(a, b);
        this.ac = length(a, c);
        this.bc = length(b, c);

        if (ab + ac <= bc || ab + bc <= ac || ac + bc <= ab) {
            throw new IllegalArgumentException("Degenerate triangle.");
        }
    }


    public double area() {
        return Math.abs(
                (a.getX() - c.getX()) * (b.getY() - a.getY())
                        - (a.getX() - b.getX()) * (c.getY() - a.getY())
        ) / 2.0;
    }

    public Point centroid() {
        double x = ((a.getX() + b.getX() + c.getX()) / 3);
        double y = ((a.getY() + b.getY() + c.getY()) / 3);

        return new Point(x,y);
    }

    public static double length(Point a, Point b) {
        double dx = a.getX() - b.getX();
        double dy = a.getY() - b.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "x1=" + a +
                ", x2=" + b +
                ", x3=" + c +
                '}';
    }
}
