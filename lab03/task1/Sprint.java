package lab03.task1;

import java.util.ArrayList;

public class Sprint {
    private int timeCapacity;
    private int countTicket;
    private ArrayList<Ticket> tickets;

    public Sprint(int timeCapacity, int countTicket) {
        this.timeCapacity = timeCapacity;
        this.countTicket = countTicket;
        this.tickets = new ArrayList<>();
    }

    public boolean addTicket(Ticket ticket) {
        int totalEst = getTotalEstimate();

        if (ticket == null || ticket.isCompleted() || tickets.size() >= countTicket || (totalEst + ticket.getEstimate() > timeCapacity)) {
            return false;
        }

        tickets.add(ticket);
        return true;
    }

    public boolean addUserStory(UserStory userStory) {
        if (userStory == null || userStory.isCompleted()) {
            return false;
        }

        return addTicket(userStory);
    }

    public boolean addBug(Bug bugReport) {
        if (bugReport == null || bugReport.isCompleted()) {
            return false;
        }

        return addTicket(bugReport);
    }

    public ArrayList<Ticket> getTickets() {
        return new ArrayList<>(tickets);
    }

    public int getTotalEstimate() {
        int totalEsmimate = 0;

        for (Ticket ticket : tickets) {
            totalEsmimate += ticket.getEstimate();
        }

        return totalEsmimate;
    }
}
