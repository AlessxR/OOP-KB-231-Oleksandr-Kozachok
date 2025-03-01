package lab03.task1;

import java.util.ArrayList;

public class UserStory extends Ticket {
    private boolean completed;
    private ArrayList<UserStory> dependies;

    public UserStory(int id, int estimate, String name) {
        super(id, estimate, name);
        this.completed = false;
        dependies = new ArrayList<>();
    }

    public void complete() {
        // Перебираємо кожну зависимість
        if(dependies.stream().allMatch(UserStory::isCompleted)) {
            this.completed = true;
        }
    }

    public ArrayList<UserStory> getDependies() {
        return dependies;
    }

    @Override
    public String toString() {
        return "UserStory{" +
                "ідентифікатор= " + getId() +
                ", ім'я=" + getName() +
                ", об'єкт реєстрації користувача, " + getDependies() +
                '}';
    }
}