package lab03.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class UserStory extends Ticket {
    private ArrayList<UserStory> dependencies; // Залежності

    public UserStory(int id, int estimate, String name, UserStory... dependencies) {
        super(id, estimate, name);
        this.dependencies = new ArrayList<>();
        this.dependencies.addAll(Arrays.asList(dependencies));
    }

    @Override
    public void complete() {
        boolean allCompleted = true;
        for (UserStory dependency : dependencies) {
            if (!dependency.isCompleted()) {
                allCompleted = false;
                break;
            }
        }
        if (allCompleted) {
            super.complete();
        }
    }

    public ArrayList<UserStory> getDependencies() {
        return new ArrayList<>(dependencies);
    }

    @Override
    public String toString() {
        return "[US " + getId() + "] " + getName();
    }
}