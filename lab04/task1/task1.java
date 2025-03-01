package lab04.task1;

public class task1 {
    public static void main(String[] args) {
        Point circle = new Point(10, 10);

        // Коло
        double radius = 5;
        Circle circle1 = new Circle(circle, radius);
        System.out.println(circle1.centroid());

        // Трикутник
        Point triangle1 = new Point(5, 5);
        Point triangle2 = new Point(2, 6);
        Point triangle3 = new Point(4, 4);
        Triangle triangle = new Triangle(triangle3, triangle1, triangle2);
        System.out.println(triangle.area());

        // Чотирикутник
        Point quad1 = new Point(5, 5);
        Point quad2 = new Point(2, 6);
        Point quad3 = new Point(4, 4);
        Point quad4 = new Point(2, 15);
        Quadrilateral quad = new Quadrilateral(quad1, quad2, quad3, quad4);
        System.out.println(quad.area());
    }
}
