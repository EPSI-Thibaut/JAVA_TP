// BestiolesApplication.java
package fr.epsi.b3devc2.bestioles;

import fr.epsi.b3devc2.bestioles.model.Person;
import fr.epsi.b3devc2.bestioles.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BestiolesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BestiolesApplication.class, args);
    }

    @Bean
    CommandLineRunner displayData(PersonRepository personRepository) {
        return args -> {
            List<Person> persons = personRepository.findAll();

            if (persons.isEmpty()) {
                System.out.println("Aucune personne dans la base de donnée.");
            } else {
                System.out.println("📋 Liste des personnes :");
                for (Person person : persons) {
                    System.out.println(person.getFirstname() + " " + person.getLastname() + " (" + person.getAge() + " ans)");
                }
            }
        };

    }
}
