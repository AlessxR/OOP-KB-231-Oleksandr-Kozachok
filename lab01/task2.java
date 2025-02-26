package lab01;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();

        if (seconds < 0) {
            System.out.println("Значення не може бути від'ємним!");
            return;
        }

        System.out.println(String.format("%d:%02d:%02d", seconds / 3600, seconds % 3600 / 60, seconds % 60));
    }
}
