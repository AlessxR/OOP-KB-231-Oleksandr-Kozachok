package lab01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveNumbers;

        ArrayList<Integer> positiveNumbersList = new ArrayList();

        while (true) {
            positiveNumbers = sc.nextInt();

            if (positiveNumbers == 0) {
                System.out.println("Ви ввели 0!");
                break;
            }

            // Пуш до коллекції
            positiveNumbersList.add(positiveNumbers);
        }

        System.out.println("Максимальне число у вашій послідовності: " + Collections.max(positiveNumbersList));

    }
}
