package lab01;

import java.util.Scanner;

public class task3 {

    final static int secretPassword = 123;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        int password = sc.nextInt();

        checkPassword(password);

    }

    public static void checkPassword(int password) {
        if (password == secretPassword) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Wrong password");
        }
    }
}

