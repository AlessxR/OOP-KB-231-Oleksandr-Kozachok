package lab01;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unknowns = sc.nextInt();
        sc.nextLine();

        if (unknowns <= 0) {
            System.out.println("Кількість незнайомців не може бути менше 0!");
        } else {
            for (int i = 0; i < unknowns; i++) {
                String names = sc.nextLine();
                System.out.println("Hello, " + names + "!");
            }
        }
    }
}
