package uam.backend.projet1.GestionFilAttente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uam.backend.projet1.GestionFilAttente.Model.Location;
import uam.backend.projet1.GestionFilAttente.Model.Service;
import uam.backend.projet1.GestionFilAttente.Repository.ServiceRepository;
import uam.backend.projet1.GestionFilAttente.Repository.LocationRepository;

import java.util.Arrays;

@SpringBootApplication
public class GestionFilAttenteApplication implements CommandLineRunner {

	@Autowired
	private ServiceRepository serviceRepository;
	@Autowired
	private LocationRepository locationRepository;


	public static void main(String[] args) {
		SpringApplication.run(GestionFilAttenteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Créer des localisations
		Location loc1 = new Location();
		loc1.setName("Dakar");

		Location loc2 = new Location();
		loc2.setName("Parcelles");
		Location loc3 = new Location();
		loc3.setName("Guédiawaye");
		Location loc4 = new Location();
		loc4.setName("Thies");

		locationRepository.saveAll(Arrays.asList(loc1, loc2,loc3,loc4 ));

		Service ser1 = new Service();
		ser1.setName("SenEau");
		ser1.setLocations(Arrays.asList(loc1, loc2, loc3, loc4));

		Service ser2 = new Service();
		ser2.setName("Orange");
		ser2.setLocations(Arrays.asList(loc1, loc2, loc3, loc4));

		Service ser3 = new Service();
		ser3.setName("Senelec");
		ser3.setLocations(Arrays.asList(loc1, loc2, loc3, loc4));

		Service ser4 = new Service();
		ser4.setName("Bank");
		ser4.setLocations(Arrays.asList(loc1, loc2, loc3, loc4));

		Service ser5 = new Service();
		ser5.setName("Yas");
		ser5.setLocations(Arrays.asList(loc1, loc2, loc3, loc4));


		Service ser6 = new Service();
		ser6.setName("Expresso");
		ser6.setLocations(Arrays.asList(loc1, loc2, loc3, loc4));

		// Sauvegarde des services dans la base de données
		serviceRepository.saveAll(Arrays.asList(ser1, ser2, ser3, ser4, ser5, ser6));

//		// Afficher tous les services
//		for (Service s : serviceRepository.findAll()) {
//			System.out.println("Service ID: " + s.getId() + ", Name: " + s.getName());
//		}
	}
}
