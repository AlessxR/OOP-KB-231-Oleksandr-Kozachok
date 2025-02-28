package lab03.task1;

public class Ticket {
    private int id;
    private String name;
    private int estimate;
    private static boolean completed;

    public Ticket(int id, int estimate, String name) {
        this.id = id;
        this.estimate = estimate;
        this.name = name;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getEstimate() {
        return estimate;
    }


    public static boolean isCompleted() {
        return completed;
    }

    public void complete() {
        this.completed = true;
    }
}
