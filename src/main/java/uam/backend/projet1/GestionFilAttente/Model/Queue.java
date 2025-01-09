package uam.backend.projet1.GestionFilAttente.Model;

public class Queue {
    private String service;
    private String location;
    private int ticketCount;

    public Queue(String service, String location, int ticketCount) {
        this.service = service;
        this.location = location;
        this.ticketCount = ticketCount;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }
}
