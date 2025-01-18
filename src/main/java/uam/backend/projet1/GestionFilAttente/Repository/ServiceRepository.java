package uam.backend.projet1.GestionFilAttente.Repository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;
import uam.backend.projet1.GestionFilAttente.Model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Service> findByName(String name);

//    @Query( value = "select  name from Service where name like: name%")
//    List<String> findByName();

}

