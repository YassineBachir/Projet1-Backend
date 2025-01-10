package uam.backend.projet1.GestionFilAttente.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uam.backend.projet1.GestionFilAttente.Repository.ServiceRepository;

import java.util.List;

@Service
public class ServiceManagementService {

     @Autowired
    private ServiceRepository serviceRepository;

    public List<uam.backend.projet1.GestionFilAttente.Model.Service> getAllServices() {
        return serviceRepository.findAll();
    }

//    public Service addService(Service service) {
//        return serviceRepository.save(service);
//    }

    public List<uam.backend.projet1.GestionFilAttente.Model.Service> findServiceByName(String name) {
        return serviceRepository.findByName(name);
    }



}
