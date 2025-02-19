package lab01;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seconds = sc.nextInt();
        int secondsRemain = seconds % 60;
        int minutes = (seconds % 3600) / 60;
        int hours = seconds / 3600;

        System.out.println(hours + ":" + minutes + ":" + secondsRemain);
    }
}
