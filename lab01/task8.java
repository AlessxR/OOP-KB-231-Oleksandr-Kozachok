package lab01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task8 {
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

        // Виконуємо через стріми, преобразування елементів в int а потім відповідною функцією рахуємо середнє коллекції, якщо коллекція пуста, то повертаємо 0.0
        System.out.println(positiveNumbersList.stream().mapToInt(Integer::intValue).average().orElse(0.0));
    }
}
