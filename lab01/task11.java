package lab01;

import java.util.Arrays;
import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbersArray = new int[size];

        for (int i = 0; i < size; i++) {
            numbersArray[i] = sc.nextInt();
        }

        // Фільтруємо по парним числам та сумуємо за допомогою потоку stream
        int summa = Arrays.stream(numbersArray).filter(num -> num % 2 == 0).sum();

        System.out.println(summa);

    }
}
