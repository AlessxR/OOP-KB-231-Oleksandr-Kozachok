package lab01;

import java.util.Arrays;

public class task14 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 6, 5};
        cycleSwap(array);
        System.out.println();
        cycleSwap(array2, 2);
    }

    public static int[] cycleSwap(int[] array) {
        return cycleSwap(array, 1);
    }

    public static int[] cycleSwap(int[] array, int shift) {
        shift = shift % array.length;
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[(i + shift) % array.length] = array[i];
        }

        for (int num : newArray) {
            System.out.print(num + " ");
        }
        return newArray;
    }
}
