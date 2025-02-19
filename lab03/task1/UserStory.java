package lab03.task1;

import java.util.Arrays;

public class UserStory extends Ticket{

    private UserStory[] depend;

    public UserStory(int id, int estimate, String name, UserStory[] depend) {
        super(id, estimate, name);
        this.depend = depend;
    }

    public UserStory getDependcies(UserStory[] userStories) {
        return (userStories != null && userStories.length > 0) ? userStories[0] : null;
    }

    public void complete() {
        for (UserStory userStory : depend) {
            if (!userStory.isCompleted()) {
                return;
            }
        }
        super.complete();
    }

    @Override
    public String toString() {
        return "[US" + getId() + "] " + getName();
    }
}