package lab02.task1;

public class Line {
    private int x1;
    private int y1;

    public Line(int y1, int x1) {
        this.y1 = y1;
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX1() {
        return x1;
    }

    public Point intersection(Line line) {
        if (line.getY1() == this.getY1()) {
            return null;
        }
        double x = 1.0 * (line.getY1() - this.getY1()) / (this.getX1() - line.getX1());
        double y = this.getX1() - line.getX1();
        return new Point(x, y);
    }
}
