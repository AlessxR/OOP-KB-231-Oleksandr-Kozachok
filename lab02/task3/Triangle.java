package lab02.task3;

public class Triangle {

    private Point x;
    private Point y;
    private Point z;


    public Triangle(Point x, Point y, Point z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double area() {
        double a = Math.sqrt(Math.pow(y.getX() - x.getX(), 2) + Math.pow(y.getY() - x.getY(), 2) + Math.pow(y.getZ() - x.getZ(), 2));
        double b = Math.sqrt(Math.pow(z.getX() - y.getX(), 2) + Math.pow(z.getY() - y.getY(), 2) + Math.pow(z.getZ() - y.getZ(), 2));
        double c = Math.sqrt(Math.pow(x.getX() - z.getX(), 2) + Math.pow(x.getY() - z.getY(), 2) + Math.pow(x.getZ() - z.getZ(), 2));

        System.out.println("Side a: " + a);
        System.out.println("Side b: " + b);
        System.out.println("Side c: " + c);

        double s = (a + b + c) / 2.0;

        System.out.println("Semi-perimeter (s): " + s);


        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area: " + area);

        return area;

    } // To-Do - rework this method and added a new method to solution this exercise

    @Override
    public String toString() {
        return "Triangle{" +
                "x1=" + x +
                ", x2=" + y +
                ", x3=" + z +
                '}';
    }
}
