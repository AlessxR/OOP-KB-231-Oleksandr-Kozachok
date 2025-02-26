package lab01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task8 {
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
            positiveNumbersList.add(positiveNumbers);
        }

        System.out.println(positiveNumbersList.stream().mapToInt(Integer::intValue).average().orElse(0.0));
    }
}
