package lab02.task1;

public class Line {
     private double k;
     private double b;

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line otherLine) {
        if (getK() == otherLine.k || getB() == otherLine.b) {
            return null;
        }

        double x = (otherLine.b - getB()) / (getK() - otherLine.k);
        double y = getK() * x + getB();

        return new Point(x, y);
    }

    public double getK() {
        return k;
    }

    public double getB() {
        return b;
    }
}
