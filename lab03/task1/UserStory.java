package lab03.task1;

public class UserStory extends Ticket {
    private static boolean completed;

    public UserStory(int id, int estimate, String name) {
        super(id, estimate, name);
        this.completed = false;
    }

    public void complete() {
        completed = true;
    }

    //public UserStory[] getDependencies() {

    //}
}