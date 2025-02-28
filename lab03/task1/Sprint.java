package lab03.task1;

public class Sprint {

    public boolean addUserStory(UserStory userStory) {
        if (userStory != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addBug(Bug bugReport) {
        if (bugReport != null) {
            return true;
        } else {
            return false;
        }
    }
}
