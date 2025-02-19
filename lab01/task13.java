package lab01;

import java.util.ArrayList;
import java.util.Arrays;

public class task13 {
    public static void main(String[] args) {
        int arr[] = {18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(removeLocalMaxima(arr)));
    }

    public static int[] removeLocalMaxima(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>(); // Динамічний список для збереження значень

        for (int i = 0; i < numbers.length; i++) {
            boolean isLocalMax = false;

            // Перевіряємо перший елемент
            if (i == 0 && numbers[i] > numbers[i + 1]) {
                isLocalMax = true;
            }
            // Перевіряємо останній елемент
            else if (i == numbers.length - 1 && numbers[i] > numbers[i - 1]) {
                isLocalMax = true;
            }
            // Перевіряємо середні елементи
            else if (i > 0 && i < numbers.length - 1 && numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) {
                isLocalMax = true;
            }

            // Якщо не локальний максимум – додаємо до списку
            if (!isLocalMax) {
                list.add(numbers[i]);
            }
        }

        // Перетворюємо список у масив та повертаємо
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
