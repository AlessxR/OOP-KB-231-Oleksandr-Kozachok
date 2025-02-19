package lab03.task1;

public class Ticket {

    private int id;
    private String name;
    private int estimate;
    private boolean completed;

    public Ticket(int id, int estimate, String name) {
        this.id = id;
        this.estimate = estimate;
        this.name = name;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public int getEstimate(int estimate) {
        return estimate;
    }

    public void complete() {
        this.completed = true;
    }
}
