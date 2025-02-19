package lab01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeArray = sc.nextInt();

        int[] numbersArray = new int[sizeArray];

        for(int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = sc.nextInt();
        }

        int max = Arrays.stream(numbersArray).max().getAsInt();

        System.out.println("Максимальний елемент: " + max);
    }
}
