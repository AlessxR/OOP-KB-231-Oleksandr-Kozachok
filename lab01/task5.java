package lab01;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt(); // Висота

        int result = countNumberOfDay(a, b, h);
        if (result == -1) {
            System.out.println("Impossible");
        } else {
            System.out.println(result);
        }
    }

    public static int countNumberOfDay(int a, int b, int h) {

        if (a >= h) {
            return 1;
        }


        if (a <= b) {
            return -1;
        }

        return (h - b - 1) / (a - b) + 1;
    }
}
