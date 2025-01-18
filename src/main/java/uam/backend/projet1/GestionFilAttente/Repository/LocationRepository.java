package uam.backend.projet1.GestionFilAttente.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uam.backend.projet1.GestionFilAttente.Model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
