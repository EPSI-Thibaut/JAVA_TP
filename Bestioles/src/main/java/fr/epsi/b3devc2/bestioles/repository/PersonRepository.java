package fr.epsi.b3devc2.bestioles.repository;

import fr.epsi.b3devc2.bestioles.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long>,PersonRepositoryCustom {
}