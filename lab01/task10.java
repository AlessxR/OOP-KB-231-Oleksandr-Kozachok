package lab01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        int array[] = {1, 4, 5, 6, 2, 10, 15};
        int array1[] = {};

        System.out.println(max(array));
    }

    public static int max(int array[]) {
        if (array.length == 0 || array == null) {
            System.out.println("Массив не може бути пустим чи null!");
        }
        return Arrays.stream(array).max().getAsInt();
    }
}
