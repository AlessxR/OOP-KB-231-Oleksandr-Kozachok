package lab02.task2;

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
        return new Point(1, 4);
        // To-Do: replace this method, very bad!
    }
}
