package uam.backend.projet1.GestionFilAttente.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uam.backend.projet1.GestionFilAttente.Model.Service;
import uam.backend.projet1.GestionFilAttente.Service.ServiceManagementService;

import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServiceController {

    @Autowired
    private ServiceManagementService serviceManagementService;

    @GetMapping
    public List<Service> getAllServices() {
        return serviceManagementService.getAllServices();
    }

//    @PostMapping
//    public Service addService(@RequestBody Service service) {
//        return serviceManagementService.addService(service);
//    }

    @GetMapping("/search")
    public List<Service> searchServices(@RequestParam String name) {
        return serviceManagementService.findServiceByName(name);
    }

}

//http://localhost:8080/api/services/search?name=SenEau
