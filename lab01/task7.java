package lab01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveNumbers;

        // Коллекція для зберігання позитивних цілих чисел
        ArrayList<Integer> positiveNumbersList = new ArrayList();

        // Цикл для введення чисел
        while (true) {
            positiveNumbers = sc.nextInt();

            // Перевірка на 0
            if (positiveNumbers == 0) {
                System.out.println("Ви ввели 0!");
                break;
            }

            // Пуш до коллекції
            positiveNumbersList.add(positiveNumbers);
        }
//        for (int numbers : positiveNumbersList) {
//            System.out.print(numbers + " ");
//        }
        System.out.println("Максимальне число у вашій послідовності: " + Collections.max(positiveNumbersList));

    }
}
