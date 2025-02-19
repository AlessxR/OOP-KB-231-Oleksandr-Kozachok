package lab03.task1;

public class Bug extends Ticket {


    private UserStory userStory;

    public Bug(int id, String name, int estimate, UserStory userStory) {
        super(id, estimate, name);
        this.userStory = userStory;
    }

    public static Bug createBug(int id, String name, int estimate, UserStory userStory) {
        if (userStory == null || !userStory.isCompleted()) {
            return null;
        }

        return new Bug(id, name, estimate, userStory);
    }

    @Override
    public String toString() {
        return "[Bug " + getId() + "] " + userStory.getName() + ": " + getName();
    }
}
