package uam.backend.projet1.GestionFilAttente.Service;

import org.springframework.stereotype.Service;
import uam.backend.projet1.GestionFilAttente.Model.Queue;
import uam.backend.projet1.GestionFilAttente.Model.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class AdminService {

    // Map pour stocker les files par service et localisation
    private final ConcurrentHashMap<String, List<Ticket>> queues = new ConcurrentHashMap<>();

    public void addTicketToQueue(String service, String location, Ticket ticket) {
        String key = service + "-" + location;
        queues.putIfAbsent(key, new ArrayList<>());
        queues.get(key).add(ticket);
    }

    public List<Queue> getAllQueues() {
        List<Queue> queueList = new ArrayList<>();
        for (String key : queues.keySet()) {
            String[] parts = key.split("-");
            String service = parts[0];
            String location = parts[1];
            int ticketCount = queues.get(key).size();
            queueList.add(new Queue(service, location, ticketCount));
        }
        return queueList; // Retourne toutes les files en cours sous forme d'objets Queue
    }

    public List<Ticket> getTicketsInQueue(String service, String location) {
        return queues.getOrDefault(service + "-" + location, new ArrayList<>());
    }
}
