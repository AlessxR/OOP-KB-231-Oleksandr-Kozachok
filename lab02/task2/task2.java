package lab02.task2;

public class task2 {
    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(0, 1);
        Point p3 = new Point(2, 3);
        Point p4 = new Point(2, 0);

        Segment s = new Segment(p1, p2);
        Segment s1 = new Segment(p3, p4);

        System.out.println(s.lenght());
        System.out.println(s.middle());
        System.out.println(s.intersection(s1));
    }
}
