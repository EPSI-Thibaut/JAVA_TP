package fr.epsi.b3devc2.bestioles;

import fr.epsi.b3devc2.bestioles.repository.AnimalRepository;
import fr.epsi.b3devc2.bestioles.repository.PersonRepository;
import fr.epsi.b3devc2.bestioles.repository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BestiolesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BestiolesApplication.class, args);
    }

    @Autowired
    private PersonRepository personRepository;

    @Bean
    CommandLineRunner displayData(
            PersonRepository personRepository,
            SpeciesRepository speciesRepository,
            AnimalRepository animalRepository
    ) {
        return args -> {
            System.out.println("Suppression des personnes sans animaux");
            personRepository.deletePersonsWithoutAnimals();

        };
    }
}
