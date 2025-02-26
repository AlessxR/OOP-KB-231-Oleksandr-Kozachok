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

        System.out.println(sum(numbersArray));

    }

    public static int sum(int array[]) {
        if (array == null || array.length == 0) {
            return 0;
        }

        return Arrays.stream(array).filter(num -> num % 2 == 0).sum();
    }
}
