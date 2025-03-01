package lab02.task2;

import lab02.task1.Line;

public class Segment {

    private Point startPoint;
    private Point endPoint;

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }


    // Довжина сегменту
    public double lenght() {
        double res1 = Math.pow(endPoint.getX() - startPoint.getX(), 2) + Math.pow(endPoint.getY() - startPoint.getY(), 2);
        return Math.sqrt(res1);
    }

    // Середина відрізку
    public Point middle() {
        return new Point((startPoint.getX() + endPoint.getX()) / 2,
                      (startPoint.getY() + endPoint.getY()) / 2);
    }

    public Point intersection(Segment another) {
        double x1 = startPoint.getX(), y1 = startPoint.getY();
        double x2 = endPoint.getX(), y2 = endPoint.getY();
        double x3 = another.getStartPoint().getX(), y3 = another.getStartPoint().getY();
        double x4 = another.getEndPoint().getX(), y4 = another.getEndPoint().getY();

        double denominator = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        if (denominator == 0) return null;

        double px = ((x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4)) / denominator;
        double py = ((x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4)) / denominator;

        if (px >= Math.min(x1, x2) && px <= Math.max(x1, x2) &&
                py >= Math.min(y1, y2) && py <= Math.max(y1, y2) &&
                px >= Math.min(x3, x4) && px <= Math.max(x3, x4) &&
                py >= Math.min(y3, y4) && py <= Math.max(y3, y4)) {
            return new Point(px, py);
        }
        return null;
    }
}
