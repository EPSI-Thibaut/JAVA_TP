package fr.epsi.b32425c2.demo_boot;

import fr.epsi.b32425c2.demo_boot.service.BavardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoBootApplication {

	@Autowired
	private BavardService bavardService;

	public static void main(String[] args) {
		SpringApplication.run(DemoBootApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello world";
	}
	// variante de l'étape 3 du tp (bonus)
	@GetMapping("/blabla")
	public String blabla() {
		return bavardService.parler();
	}
}
