package uam.backend.projet1.GestionFilAttente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uam.backend.projet1.GestionFilAttente.Model.Service;
import uam.backend.projet1.GestionFilAttente.Repository.ServiceRepository;

import java.util.Arrays;

@SpringBootApplication
public class GestionFilAttenteApplication implements CommandLineRunner {

	@Autowired
	private ServiceRepository serviceRepository;

	public static void main(String[] args) {
		SpringApplication.run(GestionFilAttenteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Service ser1 = new Service();
		ser1.setName("SenEau");

		Service ser2 = new Service();
		ser2.setName("Orange");

		Service ser3 = new Service();
		ser3.setName("Senelec");

		Service ser4 = new Service();
		ser4.setName("Bank");

		Service ser5 = new Service();
		ser5.setName("Yas");

		Service ser6 = new Service();
		ser6.setName("Expresso");

		// Sauvegarder les services dans la base de données
		serviceRepository.saveAll(Arrays.asList(ser1, ser2, ser3, ser4, ser5, ser6));

//		// Afficher tous les services
//		for (Service s : serviceRepository.findAll()) {
//			System.out.println("Service ID: " + s.getId() + ", Name: " + s.getName());
//		}
	}
}
