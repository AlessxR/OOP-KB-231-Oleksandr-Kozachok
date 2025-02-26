package lab01;

import java.util.Scanner;

public class task6 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        float summaCheck = checkValidation("Введіть суму чека ( > 0 ): ");
        int numberFriends = checkValidation("Введіть кількість друзів ( > 0 ): ");
        totalSum(summaCheck, numberFriends);
    }

    // Валідація на значеннях > 0
    public static int checkValidation(String message) {
        int number;
        while (true) {
            System.out.print(message);
            number = sc.nextInt();
            if (number > 0) {
                return number;
            }
            System.out.println("Помилка! Значення повино бути більше 0.");
        }
    }

    // Підрахунок загальної суми з процентами
    public static void totalSum(float summaCheck, int numberFriends) {
        float result = (summaCheck / numberFriends) * 1.1f; // 10%
        System.out.println("Сума на кожного з 10%: " + result);
    }
}
