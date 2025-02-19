package lab01;

public class task9 {
    public static void main(String[] args) {
        printQuadraticRoots(2, 2, 2);
    }

    public static double getDiscriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static void printQuadraticRoots(double a, double b, double c) {
        if (a == 0) {
            // Лінійне рівняння bx + c = 0
            if (b == 0) {
                System.out.println(c == 0 ? "Безліч розв'язків" : "Немає розв'язків");
            } else {
                System.out.println("Один корень: " + (-c / b));
            }
            return;
        }

        double D = getDiscriminant(a, b, c);

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Двоє коренів: " + x1 + " та " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("Один корінь: " + x);
        } else {
            System.out.println("Немає коренів");
        }
    }
}
