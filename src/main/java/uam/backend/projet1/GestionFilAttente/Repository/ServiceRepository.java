package uam.backend.projet1.GestionFilAttente.Repository;

import uam.backend.projet1.GestionFilAttente.Model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Service> findByName(String name);

}
