package lab03.task1;

public class task1 {
    public static void main(String[] args) {

        System.out.println("ТЕСТОВА ПЕРЕВІРКА...");
        UserStory userStory1 = new UserStory(1, 5, "Тестування - 1");
        UserStory userStory2 = new UserStory(2, 6, "Тестування - 2");


        System.out.println(userStory1);
        System.out.println(userStory2);

        userStory1.complete();
//        userStory2.complete();

        Bug bug1 = Bug.createBug(1, "Помилка - 1", 2, userStory1);
        Bug bug2 = Bug.createBug(2, "Помилка - 2", 2, userStory2);

        System.out.println(bug1);
        System.out.println(bug2);


        System.out.println();
        System.out.println("ОСНОВНА ЧАСТИНА...");
        Sprint sprint1 = new Sprint(10, 3);

        System.out.println(sprint1.addUserStory(userStory1));
        System.out.println(sprint1.addUserStory(userStory2));
        System.out.println(sprint1.addBug(bug1));
        System.out.println(sprint1.addBug(bug2));

        System.out.println("\nСписок тікетів:");

        for (Ticket ticket : sprint1.getTickets()) {
            System.out.println(ticket);
        }

        System.out.println();
        System.out.println("Оцінка часу: " + sprint1.getTotalEstimate());

    }
}
