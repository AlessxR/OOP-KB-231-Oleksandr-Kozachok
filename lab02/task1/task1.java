package lab02.task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть координати першої лінії: ");
        double k = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Введіть координати другої лінії: ");
        double k1 = sc.nextDouble();
        double b2 = sc.nextDouble();

        Line line1 = new Line(k,b);
        Line line2 = new Line(k1,b2);

        System.out.println(line1.intersection(line2));
    }
}
