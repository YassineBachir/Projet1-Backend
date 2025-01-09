package uam.backend.projet1.GestionFilAttente.Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uam.backend.projet1.GestionFilAttente.Service.TicketService;

@Controller
@RequestMapping("/agent")
public class AgentController {
//
    @Autowired
    private TicketService ticketService;

    @GetMapping
    public String getAgentDashboard(Model model) {
        model.addAttribute("currentProcessingTicket", ticketService.getCurrentProcessingTicket());
        return "AgentHome"; // Assurez-vous que cette vue existe
    }


    @PostMapping("/next")
    public String processNextTicket(Model model) {
        // Passer au ticket suivant
        int nextTicket = ticketService.processNextTicket();
        model.addAttribute("currentProcessingTicket", nextTicket);
        return "AgentHome";
    }

    @PostMapping("/previous")
    public String processPreviousTicket(Model model) {
        // Revenir au ticket précédent
        int previousTicket = ticketService.processPreviousTicket();
        model.addAttribute("currentProcessingTicket", previousTicket);
       return "AgentHome";
    }
}
