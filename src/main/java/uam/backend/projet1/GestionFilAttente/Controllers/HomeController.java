package uam.backend.projet1.GestionFilAttente.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uam.backend.projet1.GestionFilAttente.Model.Ticket;
import uam.backend.projet1.GestionFilAttente.Service.TicketService;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private TicketService ticketService; // Correction ici

    @GetMapping("/")
    public String getHome(Model model) {
        // Liste des services
        List<String> services = Arrays.asList("Seneau", "Orange", "Senelec", "Bank");
        model.addAttribute("services", services);

        // Liste des localisations
        List<String> localisations = Arrays.asList("Dakar", "Thiès", "Saint-Louis", "Kaolack", "Ziguinchor");
        model.addAttribute("localisations", localisations);

        return "Home";
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam("service") String service,
                             @RequestParam("location") String location,
                             Model model) {
        Ticket ticket = ticketService.generateTicket(service, location);
        model.addAttribute("numTicket", ticket.getNumTicket());
        model.addAttribute("positionInQueue", ticketService.getPositionInQueue(ticket.getNumTicket()));
        model.addAttribute("peopleAhead", ticketService.getPeopleAhead(ticket.getNumTicket()));
        model.addAttribute("currentProcessingTicket", ticketService.getCurrentProcessingTicket());

        return "Ticket";
    }
}
