package uam.backend.projet1.GestionFilAttente.Model;



public class Admin {
    private int id;
    private String name;
    private int currentTicketNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentTicketNumber() {
        return currentTicketNumber;
    }

    public void setCurrentTicketNumber(int currentTicketNumber) {
        this.currentTicketNumber = currentTicketNumber;
    }
}
