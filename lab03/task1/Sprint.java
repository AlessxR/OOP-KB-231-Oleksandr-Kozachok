package lab03.task1;

import java.util.ArrayList;

public class Sprint {
    private int timeCapacity;
    private int countTicket;
    private ArrayList<Ticket> tickets;

    public Sprint(int timeCapacity, int countTicket, ArrayList<Ticket> tickets) {
        this.timeCapacity = timeCapacity;
        this.countTicket = countTicket;
        this.tickets = tickets;
    }

    public boolean addTicket(Ticket ticket) {
        if (ticket == null && ticket.isCompleted() && tickets.size() >= countTicket) {
            return false;
        } // To-Do: 4 punkt.

        return false;
    }

    public boolean addUserStory(UserStory userStory) {
        if (userStory != null && !userStory.isCompleted()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean addBug(Bug bugReport) {
        if (bugReport != null && !bugReport.isCompleted()) {
            return false;
        } else {
            return true;
        }
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

}
