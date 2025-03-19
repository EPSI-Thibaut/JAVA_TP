// BestiolesApplication.java
package fr.epsi.b3devc2.bestioles;

import fr.epsi.b3devc2.bestioles.model.Person;
import fr.epsi.b3devc2.bestioles.model.Animal;
import fr.epsi.b3devc2.bestioles.model.Role;
import fr.epsi.b3devc2.bestioles.model.Species;
import fr.epsi.b3devc2.bestioles.repository.PersonRepository;
import fr.epsi.b3devc2.bestioles.repository.AnimalRepository;
import fr.epsi.b3devc2.bestioles.repository.RoleRepository;
import fr.epsi.b3devc2.bestioles.repository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@SpringBootApplication
public class BestiolesApplication implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private SpeciesRepository speciesRepository;

    public static void main(String[] args) {
        SpringApplication.run(BestiolesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Supprimer toutes les données existantes avant de commencer les tests
        personRepository.deleteAll();
        animalRepository.deleteAll();
        roleRepository.deleteAll();
        speciesRepository.deleteAll();

        // Tester les méthodes du PersonRepository
        testPersonRepository();

        // Tester les méthodes du AnimalRepository
        testAnimalRepository();

        // Tester les méthodes du RoleRepository
        testRoleRepository();

        // Tester les méthodes du SpeciesRepository
        testSpeciesRepository();
    }

    private void testPersonRepository() {
        // Créer quelques entités Person
        Person person1 = new Person(null, 30, "John", "Doe", "jdoe", "password", true);
        Person person2 = new Person(null, 25, "Jane", "Doe", "jane.doe", "password", true);
        personRepository.save(person1);
        personRepository.save(person2);

        // Afficher la liste des entités Person avec findAll
        List<Person> persons = StreamSupport.stream(personRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        System.out.println("Liste des personnes : " + persons);

        // Rechercher une entité Person par son id avec findById
        Person foundPerson = personRepository.findById(person1.getId()).orElse(null);
        System.out.println("Personne trouvée par ID : " + foundPerson);

        // Supprimer une entité Person avec delete
        personRepository.delete(person1);

        // Afficher la longueur de la liste de toutes les entités Person pour vérifier qu’elle a bien été supprimée
        List<Person> personsAfterDelete = StreamSupport.stream(personRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        System.out.println("Liste des personnes après suppression : " + personsAfterDelete);
    }

    private void testAnimalRepository() {
        // Créer quelques entités Species
        Species species1 = new Species(null, "Chat", "Felis silvestris catus");
        Species species2 = new Species(null, "Chien", "Canis lupus familiaris");
        speciesRepository.save(species1);
        speciesRepository.save(species2);

        // Créer quelques entités Animal
        Animal animal1 = new Animal(null, "Gris", "Max", "M", species1);
        Animal animal2 = new Animal(null, "Blanc", "Médor", "M", species2);
        animalRepository.save(animal1);
        animalRepository.save(animal2);

        // Afficher la liste des entités Animal avec findAll
        List<Animal> animals = StreamSupport.stream(animalRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        System.out.println("Liste des animaux : " + animals);

        // Rechercher une entité Animal par son id avec findById
        Animal foundAnimal = animalRepository.findById(animal1.getId()).orElse(null);
        System.out.println("Animal trouvé par ID : " + foundAnimal);

        // Supprimer une entité Animal avec delete
        animalRepository.delete(animal1);

        // Afficher la longueur de la liste de toutes les entités Animal pour vérifier qu’elle a bien été supprimée
        List<Animal> animalsAfterDelete = StreamSupport.stream(animalRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        System.out.println("Liste des animaux après suppression : " + animalsAfterDelete);
    }

    private void testRoleRepository() {
        // Créer quelques entités Role
        Role role1 = new Role(null, "ROLE_USER");
        Role role2 = new Role(null, "ROLE_ADMIN");
        roleRepository.save(role1);
        roleRepository.save(role2);

        // Afficher la liste des entités Role avec findAll
        List<Role> roles = StreamSupport.stream(roleRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        System.out.println("Liste des rôles : " + roles);

        // Rechercher une entité Role par son id avec findById
        Role foundRole = roleRepository.findById(role1.getId()).orElse(null);
        System.out.println("Rôle trouvé par ID : " + foundRole);

        // Supprimer une entité Role avec delete
        roleRepository.delete(role1);

        // Afficher la longueur de la liste de toutes les entités Role pour vérifier qu’elle a bien été supprimée
        List<Role> rolesAfterDelete = StreamSupport.stream(roleRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        System.out.println("Liste des rôles après suppression : " + rolesAfterDelete);
    }

    private void testSpeciesRepository() {
        // Créer quelques entités Species
        Species species1 = new Species(null, "Chat", "Felis silvestris catus");
        Species species2 = new Species(null, "Chien", "Canis lupus familiaris");
        speciesRepository.save(species1);
        speciesRepository.save(species2);

        // Afficher la liste des entités Species avec findAll
        List<Species> speciesList = StreamSupport.stream(speciesRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        System.out.println("Liste des espèces : " + speciesList);

        // Rechercher une entité Species par son id avec findById
        Species foundSpecies = speciesRepository.findById(species1.getId()).orElse(null);
        System.out.println("Espèce trouvée par ID : " + foundSpecies);

        // Supprimer une entité Species avec delete
        speciesRepository.delete(species1);

        // Afficher la longueur de la liste de toutes les entités Species pour vérifier qu’elle a bien été supprimée
        List<Species> speciesListAfterDelete = StreamSupport.stream(speciesRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        System.out.println("Liste des espèces après suppression : " + speciesListAfterDelete);
    }
}