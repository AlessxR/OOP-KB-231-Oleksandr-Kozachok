package lab01;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unknows = sc.nextInt();
        while (true) {
            if (unknows <= 0) {
                System.out.println("Кількість візитів не може бути менше 0: ");
            } else {
                String name = sc.nextLine();

                for (int i = 0; i < unknows; i++) {
                    System.out.println("Hello, " + name + "!");
                }
                break;
            }
        }

    }
}
