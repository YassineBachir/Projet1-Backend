package uam.backend.projet1.GestionFilAttente.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uam.backend.projet1.GestionFilAttente.Service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/dashboard")
    public String getDashboard(Model model) {
        // Récupère toutes les files d'attente
        model.addAttribute("queues", adminService.getAllQueues());
        return "AdminDashboard";
    }

    @GetMapping("/queue-details")
    public String getQueueDetails(String service, String location, Model model) {
        // Récupère les tickets dans une file spécifique
        model.addAttribute("tickets", adminService.getTicketsInQueue(service, location));
        return "QueueDetails";
    }
}
