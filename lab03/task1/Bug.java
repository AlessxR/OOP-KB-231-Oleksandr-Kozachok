package lab03.task1;

public class Bug extends Ticket {

    public Bug(int id, int estimate, String name) {
        super(id, estimate, name);
    }

    public static Bug createBug(int id, String name, int estimate, UserStory userStory) {
        if (userStory == null || !isCompleted()) {
            return null;
        } else {
            return new Bug(id, estimate,name);
        }
    }

    @Override
    public String toString() {
        return "Bug{}";
    }
}
