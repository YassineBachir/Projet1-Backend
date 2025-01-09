package uam.backend.projet1.GestionFilAttente.Repository;

import uam.backend.projet1.GestionFilAttente.Model.Service;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ServiceRepository extends JpaRepository<Service, Long> {
}
