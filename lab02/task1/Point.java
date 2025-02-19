package lab02.task1;

public class Point {

    private double x, y;

    public Point(double a, double b) {
        this.x = a;
        this.y = b;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
