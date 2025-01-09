package uam.backend.projet1.GestionFilAttente.Service;

import org.springframework.stereotype.Service;
import uam.backend.projet1.GestionFilAttente.Model.Ticket;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class TicketService {

    private final AtomicInteger ticketCounter = new AtomicInteger(0);
    private static final AtomicInteger currentProcessingTicket = new AtomicInteger(1);

    public Ticket generateTicket(String service, String location) {
        int ticketNumber = ticketCounter.incrementAndGet(); // Incrémente et obtient le numéro du ticket

        Ticket ticket = new Ticket();
        ticket.setNumTicket(ticketNumber); // Définit le numéro du ticket
        ticket.setService(service); // Définit le service
        ticket.setLocation(location); // Définit la localisation

        return ticket;
    }

    public int getPositionInQueue(int ticketNumber) {
        return ticketNumber - currentProcessingTicket.get();
    }

    public int getPeopleAhead(int ticketNumber) {
        return Math.max(0, getPositionInQueue(ticketNumber));
    }

    public int getCurrentProcessingTicket() {
        return currentProcessingTicket.get();
    }

    public int processNextTicket() {
        // Incrémente le ticket en cours de traitement
        return currentProcessingTicket.incrementAndGet();
    }

    public int processPreviousTicket() {
        // Décrémente le ticket en cours de traitement, mais ne descend pas en dessous de 1
        return Math.max(1, currentProcessingTicket.decrementAndGet());
    }
}
