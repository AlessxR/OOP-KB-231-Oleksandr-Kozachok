package lab02.task3;

public class task3 {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4, 5);
        Point p2 = new Point(6, 7, 8);
        Point p3 = new Point(9, 10, 12);


        Triangle triangle = new Triangle(p1, p2, p3);

        System.out.println(triangle.area());
    }
}
