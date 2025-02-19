package lab01;

import java.util.Arrays;
import java.util.Collections;

public class task14 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        cycleSwap(array);
    }

    public static void cycleSwap(int[] array) {
        int[] newArray = new int[array.length];

        System.arraycopy(array, array.length - 1, newArray, 0, 1);
        System.arraycopy(array, 0, newArray, 1, array.length - 1);

        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }

    public static void cycleSwap(int[] array, int shift) {
        // ToDo: rework this method
    }
}
