package fr.epsi.b3devc2.bestioles.repository;

import fr.epsi.b3devc2.bestioles.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PersonRepository extends JpaRepository<Person, Integer> {

    List<Person> findByLastnameOrFirstname(String lastName, String firstName);
    List<Person> findByAgeGreaterThanEqual(int age);
    List<Person> findAllByActive(boolean active);

}