package lab02.task2;

public class task2 {
    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(0, 1);

        Segment s = new Segment(p1, p2);

        System.out.println(s.lenght());
        System.out.println(s.middle());
    }
}
